package com.example.kebunku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvPlant: RecyclerView = findViewById(R.id.rv_plants)
        val list = ArrayList<Plant>()
        val plant1 = Plant(
            "plant 1",
            R.drawable.broccoli
        )
        val plant2 = Plant(
            "plant 2",
            R.drawable.cabbage
        )
        val plant3 = Plant(
            "plant 3",
            R.drawable.carrot
        )
        list.addAll(listOf(plant1, plant2, plant3))
        val listPlantAdapter = ListPlantAdapter(list)
        rvPlant.adapter = listPlantAdapter
        rvPlant.layoutManager = GridLayoutManager(this, 2)
//        rvPlant.layoutManager = LinearLayoutManager(this)
    }
}