package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list:(RecyclerView)=findViewById(R.id.list)
        list.setLayoutManager(LinearLayoutManager(this))
        val lang=listOf("this","That","Hey")
        list.setAdapter(pa(lang))
    }
}
