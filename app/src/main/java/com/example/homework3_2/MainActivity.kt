package com.example.homework3_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btEnter
import kotlinx.android.synthetic.main.activity_main.textInputEditTextLogin
import kotlinx.android.synthetic.main.activity_main.textInputEditTextPassword

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btEnter.setOnClickListener {
            if (textInputEditTextLogin.text.toString() == "Sergei" && textInputEditTextPassword.text.toString()=="1234") {
                constLogin.visibility = View.GONE
            } else{
                Snackbar.make(btEnter, R.string.help, 5000)
                    .show()
            }
        }

        btAds.setOnClickListener {
            var intent = Intent(this, AdsActivity::class.java)
            startActivity(intent)

        }
    }

    override fun onStart() {
        super.onStart()
        constLogin.visibility = View.VISIBLE
        textInputEditTextLogin.text?.clear()
        textInputEditTextPassword.text?.clear()

    }
}