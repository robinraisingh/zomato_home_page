package com.robinsingh.zomatohomescreen.Constants

import com.robinsingh.zomatohomescreen.R
import com.robinsingh.zomatohomescreen.data.Coupon
import com.robinsingh.zomatohomescreen.data.Food

object Constants {

    fun getCouponsList():ArrayList<Coupon>{
        val couponList:ArrayList<Coupon> = ArrayList()
        val c1= Coupon(
            R.drawable.a,
            "40% off"
        )
        couponList.add(c1)
        val c2= Coupon(
            R.drawable.b,
            "50% off"
        )
        couponList.add(c2)
        val c3= Coupon(
            R.drawable.c,
            "60% off"
        )
        couponList.add(c3)
        val c4= Coupon(
            R.drawable.h,
            "40% off"
        )
        couponList.add(c4)

        val c5= Coupon(
            R.drawable.e,
            "50% off"
        )
        couponList.add(c5)
        val c6= Coupon(
            R.drawable.f,
            "60% off"
        )
        couponList.add(c6)
        val c7= Coupon(
            R.drawable.g,
            "40% off"
        )
        couponList.add(c7)
        return couponList
    }

    fun getFoodList():ArrayList<Food>{

        val foodList:ArrayList<Food> = ArrayList()
        val food1= Food(
            R.drawable.f6,
            "AMA Cafe",
            "North Indian",
            150,
            "No Live Tracking",
            4.3,
            45
        )
        foodList.add(food1)

        val food2= Food(
            R.drawable.f2,
            "Shawarma King's",
            "Chinese",
            200,
            "Live Tracking",
            4.5,
            32
        )
        foodList.add(food2)

        val food3= Food(
            R.drawable.f6,
            "Dilbag Ratan Cafe",
            "North Indian",
            130,
            "No Live Tracking",
            4.0,
            50
        )
        foodList.add(food3)

        val food4= Food(
            R.drawable.f2,
            "Bikkgane Biryani",
            "South Indian",
            250,
            "No Live Tracking",
            4.9,
            30
        )
        foodList.add(food4)

        val food5= Food(
            R.drawable.f6,
            "Singh Brothers",
            "North Indian",
            100,
            "Live Tracking",
            3.9,
            40
        )
        foodList.add(food5)

        val food6= Food(
            R.drawable.f2,
            "Hikwan Delight",
            "North Indian",
            100,
            "Live Tracking",
            3.9,
            40
        )
        foodList.add(food6)


        val food11= Food(
            R.drawable.f6,
            "NewYork Cafe",
            "North Indian",
            150,
            "No Live Tracking",
            4.3,
            45
        )
        foodList.add(food11)

        val food7= Food(
            R.drawable.f2,
            "Shawarma King's",
            "Chinese",
            200,
            "Live Tracking",
            4.5,
            32
        )
        foodList.add(food7)

        val food8= Food(
            R.drawable.f6,
            "AMA Cafe",
            "North Indian",
            130,
            "No Live Tracking",
            4.0,
            50
        )
        foodList.add(food8)

        val food9= Food(
            R.drawable.f2,
            "Bikkgane Biryani",
            "South Indian",
            250,
            "No Live Tracking",
            4.9,
            30
        )
        foodList.add(food9)

        val food10= Food(
            R.drawable.f6,
            "Singh Brothers",
            "North Indian",
            100,
            "Live Tracking",
            3.9,
            40
        )
        foodList.add(food10)

        return foodList
    }

}