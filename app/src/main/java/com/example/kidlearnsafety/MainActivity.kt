package com.example.kidlearnsafety

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import android.media.MediaPlayer
import android.provider.MediaStore

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //To create a background music
        var mediaPlayer = MediaPlayer.create(this, R.raw.dancing_baby_background_music)
        mediaPlayer.start()
        mediaPlayer!!.isLooping = true


        //Play button clicked & move to another activity page
        val playButton = findViewById<ImageButton>(R.id.play_btn)
        playButton.setOnClickListener{
            mediaPlayer.pause();
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}
