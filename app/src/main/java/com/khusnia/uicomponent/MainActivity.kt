package com.khusnia.uicomponent

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgBtn = findViewById<ImageButton>(R.id.imgButtonAdd)
        imgBtn.setOnClickListener {
            Toast.makeText (this@MainActivity, "Berhasil", Toast.LENGTH_LONG ).show()
        }
    }
}