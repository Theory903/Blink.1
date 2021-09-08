package com.tezerx.blink

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }
    fun dashboardButton(view: View) {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
    fun homeButton(view: View) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
    fun mediaButton(view: View) {
        val intent = Intent(this, MediaSearchActivity::class.java)
        startActivity(intent)
    }
    fun messageButton(view: View) {
        val intent = Intent(this, ChatActivity::class.java)
        startActivity(intent)
    }
}