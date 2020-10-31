package com.robinsingh.zomatohomescreen.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.robinsingh.zomatohomescreen.data.Coupon
import com.robinsingh.zomatohomescreen.R
import kotlinx.android.synthetic.main.item_coupon.view.*

class CouponAdapter(val list : ArrayList<Coupon>): RecyclerView.Adapter<CouponViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CouponViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_coupon,parent,false)
        return CouponViewHolder(view)
    }

    override fun onBindViewHolder(holder: CouponViewHolder, position: Int) {
        val currentItem=list[position]
        holder.couponImage.setImageResource(currentItem.image)
        holder.couponName.setText(currentItem.name)
    }

    override fun getItemCount(): Int {
      return list.size
    }
}



class CouponViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val couponImage=itemView.coupon_image_icon
    val couponName=itemView.tv_coupon_name
}