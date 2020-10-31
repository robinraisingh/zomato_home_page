package com.robinsingh.zomatohomescreen.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.robinsingh.zomatohomescreen.data.Food
import com.robinsingh.zomatohomescreen.R
import kotlinx.android.synthetic.main.item_food.view.*

class FoodAdapter(val list:ArrayList<Food>): RecyclerView.Adapter<FoodViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.item_food,parent,false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {

        val currentItem=list[position]
        holder.itemImage.setImageResource(currentItem.image)
        holder.itemRestrauntName.setText(currentItem.restaurantName)
        holder.itemType.setText(currentItem.type)
        holder.itemCostPerPerson.setText(currentItem.costPerPerson.toString() +" per person")
        holder.itemTracking.setText(currentItem.liveTracking)
        holder.itemRating.setText(currentItem.rating.toString())
        holder.itemTime.setText(currentItem.timeToDel.toString()+" mins")

    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class FoodViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    var itemImage=itemView.iv_food_item
    val itemRestrauntName=itemView.tv_restraunt_name
    val itemType=itemView.tv_type
    val itemCostPerPerson=itemView.tv_cost_per_person
    val itemTracking=itemView.tv_tracking
    val itemRating=itemView.tv_rating
    val itemTime=itemView.tv_time
}