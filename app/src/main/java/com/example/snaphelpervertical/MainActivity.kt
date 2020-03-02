package com.example.snaphelpervertical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageList : ArrayList<String> = arrayListOf("a","b","c","d","e","f","g","h","j","k","l")
        var linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = linearLayoutManager
        var snapHelper : SnapHelper = PagerSnapHelper()
        val sampleAdpater = SampleAdapter(this, imageList)
        recyclerView.adapter = sampleAdpater
        snapHelper.attachToRecyclerView(recyclerView)
    }
}
