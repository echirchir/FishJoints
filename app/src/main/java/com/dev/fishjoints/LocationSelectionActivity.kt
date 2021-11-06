package com.dev.fishjoints

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class LocationSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_selection)

        val nextButton = findViewById<AppCompatButton>(R.id.next)

        nextButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FishSelectionActivity::class.java)
            startActivity(intent)
        })
    }
}