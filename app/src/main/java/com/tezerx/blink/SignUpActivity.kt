package com.tezerx.blink

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }
    fun signUpButton(view: View) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}