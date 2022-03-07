package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    var txtSignUp: TextView? = null
    var btnLogin: Button? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initView();
    }

    private fun initView() {
        txtSignUp = findViewById(R.id.txtSignUp)
        btnLogin = findViewById<Button>(R.id.btnLogin)

        getEventClick()

    }

    private fun getEventClick() {
        txtSignUp?.setOnClickListener{
            val intent = Intent(applicationContext, SignUp::class.java)
            startActivity(intent)
            finish()
        }

//        btnLogin?.setOnClickListener {
//            var url = intent.extras!!.getString("userurl")
//            val intent2 = Intent(applicationContext, OnboardingOne::class.java)
//            intent2.putExtra("userurl", url);
//            startActivity(intent2);
//        }
    }
}