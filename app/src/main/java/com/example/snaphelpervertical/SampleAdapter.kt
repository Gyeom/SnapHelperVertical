package com.example.snaphelpervertical

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*


class SampleAdapter(context: Context, imageList: ArrayList<String>) :
    RecyclerView.Adapter<SampleAdapter.ViewHolder>() {
    
    var imageList: ArrayList<String>
    var context: Context

    init {
        this.imageList = imageList
        this.context = context
    }

    inner class ViewHolder internal constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView

        init {
            imageView = itemView.imageView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = inflater.inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        when (position) {
            0 -> holder.imageView.setBackgroundColor(Color.GREEN)
            1 -> holder.imageView.setBackgroundColor(Color.BLACK)
            2 -> holder.imageView.setBackgroundColor(Color.RED)
            3 -> holder.imageView.setBackgroundColor(Color.BLUE)
            4 -> holder.imageView.setBackgroundColor(Color.CYAN)
            5 -> holder.imageView.setBackgroundColor(Color.GREEN)
            6 -> holder.imageView.setBackgroundColor(Color.BLACK)
            7 -> holder.imageView.setBackgroundColor(Color.RED)
            8 -> holder.imageView.setBackgroundColor(Color.BLUE)
            9 -> holder.imageView.setBackgroundColor(Color.CYAN)
            10 -> holder.imageView.setBackgroundColor(Color.GREEN)
        }
    }

    override fun getItemCount(): Int {
        return imageList.size
    }
}