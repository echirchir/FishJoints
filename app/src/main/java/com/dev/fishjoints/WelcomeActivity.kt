package com.dev.fishjoints

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_activity)

        val letsGoButton = findViewById<AppCompatButton>(R.id.let_us_go)

        letsGoButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, LocationSelectionActivity::class.java)
            startActivity(intent)
        })
    }
}