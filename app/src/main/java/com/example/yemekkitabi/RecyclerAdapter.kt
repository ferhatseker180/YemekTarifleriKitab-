package com.example.yemekkitabi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(val yemekListesi : ArrayList<String>, val idListesi : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.YemekHolder>() {

    class YemekHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YemekHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_row,parent,false)
        return YemekHolder(view)
    }

    override fun onBindViewHolder(holder: YemekHolder, position: Int) {

        holder.itemView.recyler_row_text.text = yemekListesi[position]

    }

    override fun getItemCount(): Int {

        return yemekListesi.size
    }
}