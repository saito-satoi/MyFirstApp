package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Intent取得
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // TextViewにセット
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}