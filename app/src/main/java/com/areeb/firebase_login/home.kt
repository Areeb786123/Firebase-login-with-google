package com.areeb.firebase_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_home.*

class home : AppCompatActivity() {
    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        signoutbtn.setOnClickListener {
            signout()
            val signOutIntent = Intent(this , MainActivity::class.java)
            startActivity(signOutIntent)
            finish()


        }


    }

    fun signout() {
        Firebase.auth.signOut()


    }
}