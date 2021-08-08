package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initMenuButtons()
    }

    private fun initMenuButtons() {
        val menuButton = findViewById<Button>(R.id.menu_button)
        menuButton.setOnClickListener {
            Toast.makeText(this, R.string.menu_button, Toast.LENGTH_SHORT).show()
        }
        val favoritesButton = findViewById<Button>(R.id.favorites_button)
        favoritesButton.setOnClickListener {
            Toast.makeText(this, R.string.favorites_button, Toast.LENGTH_SHORT).show()
        }
        val watchLaterButton = findViewById<Button>(R.id.watch_later_button)
        watchLaterButton.setOnClickListener {
            Toast.makeText(this, R.string.watch_later_button, Toast.LENGTH_SHORT).show()
        }
        val collectionsButton = findViewById<Button>(R.id.collections_button)
        collectionsButton.setOnClickListener {
            Toast.makeText(this, R.string.collections_button, Toast.LENGTH_SHORT).show()
        }
        val settingsButton = findViewById<Button>(R.id.settings_button)
        settingsButton.setOnClickListener {
            Toast.makeText(this, R.string.settings_button, Toast.LENGTH_SHORT).show()
        }
    }
}