package id.com.plnntb.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ambil komponen yang dibutuhkan dari layout
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val btnlogin = findViewById<Button>(R.id.btnlogin)

        //buatkan fungsi klik pada tombol login
        btnlogin.setOnClickListener {
            Toast.makeText(
                this,
                "Hallo, ${username.text.toString()}", LENGTH_LONG
            ).show()

            //setup activity kedua
            val secondIntent = Intent(this, SecondActivity::class.java)

            secondIntent.putExtra("user", username.text)

            //Start Activity kedua
            startActivity(secondIntent)
            //finish()
        }
    }
}
