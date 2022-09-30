package com.javfairuz.aplikasilistbuah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESK = "extra_desk"
        const val EXTRA_IMG = "extra_img"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var tvNameReceived:TextView = findViewById(R.id.tvTitle)
        var tvDeskReceived:TextView = findViewById(R.id.tvDeskripsi)
        var imgReceived:ImageView = findViewById(R.id.imgDetail)

        val title = intent.getStringExtra(EXTRA_NAME)
        val deskripsi = intent.getStringExtra(EXTRA_DESK)
        val image = intent.getIntExtra(EXTRA_IMG,0)

        tvNameReceived.text = title
        tvDeskReceived.text = deskripsi
        imgReceived.setImageResource(image)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_home,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val moveToHome = Intent(this@DetailActivity,MainActivity::class.java)
        startActivity(moveToHome)
        return super.onOptionsItemSelected(item)
    }
}