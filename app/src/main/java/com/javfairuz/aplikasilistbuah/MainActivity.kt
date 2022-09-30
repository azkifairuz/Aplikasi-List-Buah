package com.javfairuz.aplikasilistbuah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){
    private lateinit var rvFruit:RecyclerView
    private  var list: ArrayList<Fruit> = arrayListOf()
    private var listFruit = Fruit()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvFruit = findViewById(R.id.rvFruit)
        rvFruit.setHasFixedSize(true)

        list.addAll(FruitData.listData)
        rvFruit.layoutManager = LinearLayoutManager(this)
        val  mainPageAdapter = MainPageAdapter(list,this)
        rvFruit.adapter = mainPageAdapter
        title = "Fruit List App"


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val moveToAbout = Intent(this@MainActivity,AboutActivity::class.java)
        startActivity(moveToAbout)
        return super.onOptionsItemSelected(item)
    }


}