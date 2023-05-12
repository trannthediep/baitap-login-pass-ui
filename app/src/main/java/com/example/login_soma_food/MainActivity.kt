package com.example.login_soma_food

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logIn = findViewById<TextView>(R.id.logIn)
        val singUp = findViewById<TextView>(R.id.singUp)
        val singUpLayout = findViewById<LinearLayout>(R.id.singUpLayout)
        val logInLayout = findViewById<LinearLayout>(R.id.logInLayout)
        val singIn = findViewById<Button>(R.id.singIn)



        singUp.setOnClickListener {
            singUp.background = resources.getDrawable(R.drawable.switch_trcks,null)
            singUp.setTextColor(resources.getColor(R.color.pinkColor,null))
            logIn.background = null
            singUpLayout.visibility = View.VISIBLE
            logInLayout.visibility = View.GONE
            logIn.setTextColor(resources.getColor(R.color.pinkColor,null))
        }
        logIn.setOnClickListener {
            singUp.background = null
            singUp.setTextColor(resources.getColor(R.color.pinkColor,null))
            logIn.background = resources.getDrawable(R.drawable.switch_trcks,null)
            singUpLayout.visibility = View.GONE
            logInLayout.visibility = View.VISIBLE
            logIn.setTextColor(resources.getColor(R.color.pinkColor,null))
        }
        singIn.setOnClickListener {
            startActivity(Intent(this@MainActivity,NewActivity::class.java))
        }
    }
}