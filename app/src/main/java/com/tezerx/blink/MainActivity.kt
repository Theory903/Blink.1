package com.tezerx.blink

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun signInButton(view: View) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
    fun signupButton(view: View) {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }
    fun forgetPassword(view: View) {
        val intent = Intent(this, ForgetPasswordActivity::class.java)
        startActivity(intent)
    }
}