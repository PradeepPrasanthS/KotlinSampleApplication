package com.tatacommunications.kotlinsampleapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.logging.Logger

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameEdit = findViewById<EditText>(R.id.username)
        val passwordEdit = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.login)

        login.setOnClickListener {
            val username = usernameEdit.text.toString()
            val password = passwordEdit.text.toString()
            if (username.equals("Pradeep") && password.equals("Pradeep")) {
                Logger.getLogger(LoginActivity::class.java.name).warning("Success")
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                intent.putExtra("name", "Pradeep")
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(applicationContext, "Authentication Failed", Toast.LENGTH_LONG).show()
            }
        }

    }
}
