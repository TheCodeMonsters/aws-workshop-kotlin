package com.manuelduarte077.loginrucko

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        val buttonClick = findViewById<TextView>(R.id.clickRegister)
        buttonClick.setOnClickListener {
            val i = Intent(this, RegisterActivity::class.java)
            startActivity(i)
        }

    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://7ufwc4rjfk.execute-api.us-west-2.amazonaws.com/prod/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}