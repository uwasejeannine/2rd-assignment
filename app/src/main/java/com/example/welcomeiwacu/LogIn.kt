package com.example.welcomeiwacu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import kotlin.jvm.internal.Intrinsics

class LogIn : AppCompatActivity() {

     lateinit var btnBack:Button
     lateinit var btnLogin: Button
     lateinit var etEmail:EditText
     lateinit var etpassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        castViews()
        click()
    }
    fun castViews(){
        btnBack = findViewById(R.id.btnBack)
        btnLogin = findViewById(R.id.btnLogin)
        etEmail=findViewById(R.id.etEmail)
        etpassword=findViewById(R.id.etPassword)
    }
    fun click(){

        btnBack.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)


        }


    }
}
