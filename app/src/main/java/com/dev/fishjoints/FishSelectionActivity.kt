package com.dev.fishjoints

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class FishSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fish_selection)

        val nextButton = findViewById<AppCompatButton>(R.id.next)

        nextButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, RestaurantsActivity::class.java)
            startActivity(intent)
        })
    }
}