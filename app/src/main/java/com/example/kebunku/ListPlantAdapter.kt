package com.example.kebunku

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListPlantAdapter(private val listPlant: ArrayList<Plant>) :
    RecyclerView.Adapter<ListPlantAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        private val tvName: TextView = itemView.findViewById(R.id.plant_name)

        fun bind(plant: Plant) {
            Glide.with(itemView.context)
                .load(plant.photo)
                .into(itemView.findViewById(R.id.plant_item_image))
//            tvName.text = plant.name

//            itemView.findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.cardView)
//                .setOnClickListener {
//                }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_plant, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listPlant[position])
    }

    override fun getItemCount(): Int = listPlant.size
}