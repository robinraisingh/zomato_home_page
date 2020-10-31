package com.robinsingh.zomatohomescreen.data

data class Food(
    val image:Int,
    val restaurantName:String,
    val type:String,
    val costPerPerson:Int,
    val liveTracking:String,
    val rating: Double,
    val timeToDel:Int
)