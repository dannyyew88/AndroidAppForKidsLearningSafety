package com.example.kidlearnsafety

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)

        //Back button clicked & move to previous activity page
        val backButton = findViewById<ImageButton>(R.id.back_btn)
        backButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //Furniture button clicked & move to categories_furniture activity page
        val furnitureButton = findViewById<ImageButton>(R.id.furniture_btn)
        furnitureButton.setOnClickListener{
            val intent = Intent(this, Categories_furniture::class.java)
            startActivity(intent)
        }

        //Internet button clicked & move to categories_internet activity page
        val internetButton = findViewById<ImageButton>(R.id.internet_btn)
        internetButton.setOnClickListener{
            val intent = Intent(this, Categories_internet::class.java)
            startActivity(intent)
        }

        //Fire button clicked & move to categories_fire activity page
        val fireButton = findViewById<ImageButton>(R.id.fire_btn)
        fireButton.setOnClickListener{
            val intent = Intent(this, Categories_fire::class.java)
            startActivity(intent)
        }

        //Poison button clicked & move to categories_poison activity page
        val poisonButton = findViewById<ImageButton>(R.id.poison_btn)
        poisonButton.setOnClickListener{
            val intent = Intent(this, Categories_poison::class.java)
            startActivity(intent)
        }

        //Drowning button clicked & move to categories_drowning activity page
        val drowningButton = findViewById<ImageButton>(R.id.drowning_btn)
        drowningButton.setOnClickListener{
            val intent = Intent(this, Categories_drowning::class.java)
            startActivity(intent)
        }
    }
}
