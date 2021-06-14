package com.example.headphones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        //declare a handler
        //postDelayed delays the process for a specified time
        Handler().postDelayed( {

            //declare a variable intent
            val intent = Intent(this, SplashScreenActivity::class.java )

            startActivity(intent)

            //remove the activity
            finish()
        },3000)

    }
}