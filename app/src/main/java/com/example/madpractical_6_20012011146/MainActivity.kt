package com.example.madpractical_6_20012011146

import android.content.Intent
import android.media.session.MediaController
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaController=android.widget.MediaController(this)
        val uri: Uri=Uri.parse("android.resource://"+packageName+R.raw.thestoryoflight)
        val videoView=findViewById<VideoView>(R.id.videoview)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()

        val button=findViewById<FloatingActionButton>(R.id.fbtn)
        button.setOnClickListener{
            Intent(this,YoutubeActivity::class.java).apply { startActivity(this) }
        }
    }
}