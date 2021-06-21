package com.example.welcomeiwacu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var spGender: Spinner
    lateinit var btnsign:Button
    lateinit var etName:EditText
    lateinit var etEmail:EditText
    lateinit var etphone:EditText
    lateinit var etpassword:EditText
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       spGender = findViewById(R.id.spGender)
       btnsign = findViewById(R.id.btnsign)
       etEmail=findViewById(R.id.etEmail)
       etName=findViewById(R.id.etName)
       etphone=findViewById(R.id.etPhone)
       etpassword=findViewById(R.id.etPassword)

       var gender = arrayOf("F", "M", "O")
       var genderdapter = ArrayAdapter(baseContext, android.R.layout.simple_spinner_dropdown_item, gender)
       genderdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
       spGender.adapter = genderdapter

       btnsign.setOnClickListener {
           val intent = Intent(baseContext, LogIn::class.java)
           startActivity(intent)
       }

    }

}