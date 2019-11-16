package id.com.plnntb.myfirstapp

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //set judul Toolbar
        toolbar.setTitle("Judul Toolbar")

        //set action bar
        setSupportActionBar(toolbar)

        //tambahkan tombol crack
        supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)

        //ambil data yang dikirim dari activity pertama
        val username = intent.getStringExtra("user")

        //ubah text pada layout
        user.setText(username)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.simpan -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}