package com.example.kebunku

class PlantModel {
    var listPlant: ArrayList<Plant> = arrayListOf(
        Plant("Broccoli", R.drawable.broccoli),
        Plant("Cabbage", R.drawable.cabbage),
        Plant("Carrot", R.drawable.carrot),
        Plant("Corn", R.drawable.corn),
        Plant("Cucumber", R.drawable.cucumber),
        Plant("Eggplant", R.drawable.eggplant),
        Plant("Ginger", R.drawable.ginger),
        Plant("Radish", R.drawable.radish),
        Plant("Asparagus", R.drawable.asparagus),
        Plant("beetroot", R.drawable.beetroot),
        Plant("Bell Pepper", R.drawable.bellpepper),
        Plant("Champignon", R.drawable.champignon),
        Plant("Chili", R.drawable.chili),
        Plant("Kale", R.drawable.kale)
    )

    fun getList(): ArrayList<Plant> {
        return listPlant
    }

}