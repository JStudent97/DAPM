package com.example.lab2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById<Button>(R.id.showInput)

        val username: EditText = findViewById<EditText>(R.id.editText1)

        val password: EditText = findViewById<EditText>(R.id.editText1)

        btn.setOnClickListener{
            val usernameText = username.text.toString()
            val passwordText = password.text.toString()

            if (usernameText.equals("student") && passwordText.equals("student")) {
                val intent = Intent(this, FindTheNumberActivity::class.java)
                startActivity(intent)
            }
        }



    }
}
