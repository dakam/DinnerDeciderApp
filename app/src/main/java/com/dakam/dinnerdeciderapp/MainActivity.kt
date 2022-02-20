package com.dakam.dinnerdeciderapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var foodList:ArrayList<String> = arrayListOf("Hamburger", "Pizza","Mexican", "American", "Chinese")
        var btnDecide = findViewById<Button>(R.id.btn_decide);
        var btnAddFood = findViewById<Button>(R.id.btn_addfood);
        var txtFoodType = findViewById<TextView>(R.id.txt_foodType);
        var txtEditFodName = findViewById<EditText>(R.id.txt_addfood);

        btnDecide.setOnClickListener { v ->
            var len:Int = foodList.size
            var randIndex:Int = (0 until len-1).random()
            txtFoodType.text=  foodList.get(randIndex)
        }

        btnAddFood.setOnClickListener { v->
            var foodName:String
            if(txtEditFodName.text.toString()!=null) {
                foodName = txtEditFodName.text.toString()
                foodList.add(foodName)
                txtEditFodName.setText("")

            }
        }
    }
}