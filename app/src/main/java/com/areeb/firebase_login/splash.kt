package com.areeb.firebase_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.google.firebase.auth.FirebaseAuth

class splash : AppCompatActivity() {

    lateinit var  mAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        mAuth= FirebaseAuth.getInstance()
        val user=mAuth.currentUser

        Handler().postDelayed({
            if(user != null){
                val homeintent=Intent(this,home::class.java)
                startActivity(homeintent)
                finish()
            }else{
                val sign_intent =Intent(this,MainActivity::class.java)
                startActivity(sign_intent)
                finish()
            }
        },2000)



    }
}