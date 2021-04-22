package com.example.kidlearnsafety

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class Categories_drowning : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories_drowning)

        val videoView = findViewById<View>(R.id.drowning_video_view) as VideoView

        //Set MediaController  to enable play, pause, forward, etc options.
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        //Location of Media File
        val uri = Uri.parse(
            ("android.resource://" + getPackageName() + "/" + R.raw.drowning))
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}