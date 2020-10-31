package com.robinsingh.zomatohomescreen.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.robinsingh.zomatohomescreen.Adapters.CouponAdapter
import com.robinsingh.zomatohomescreen.Adapters.FoodAdapter
import com.robinsingh.zomatohomescreen.Constants.Constants
import com.robinsingh.zomatohomescreen.R
import com.robinsingh.zomatohomescreen.data.Coupon
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mLayoutManager1 = LinearLayoutManager(applicationContext)
        mLayoutManager1.orientation = LinearLayoutManager.HORIZONTAL
        rv_coupons.layoutManager=mLayoutManager1

        val couponList:ArrayList<Coupon> = Constants.getCouponsList()
        val adapter1= CouponAdapter(couponList)
        rv_coupons.adapter=adapter1

        val foodList= Constants.getFoodList();
        rv_food.layoutManager=LinearLayoutManager(this)
        val adapter2= FoodAdapter(foodList)
        rv_food.adapter=adapter2
    }
}