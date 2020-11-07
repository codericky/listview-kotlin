package com.example.appku


import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var lvItem: ListView? = null
    private val daftar = arrayOf(
            "Jakarta", "Bandung", "Surabaya", "Banjarmasin", "Yogyakarta",
            "Bali", "Lombok", "Solo", "Tangerang",
            "Maluku", "Sumatera", "Lampung", "Kalimantan")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.title = "Listview"

        lvItem = findViewById<View>(R.id.list_view) as ListView
        val adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, android.R.id.text1, daftar)

     lvItem!!.adapter = adapter

        lvItem!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MainActivity, " Anda Memilih : " + daftar[position], Toast.LENGTH_LONG).show()


        }
    }
}
