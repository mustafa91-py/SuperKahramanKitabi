package com.mustafauyar.superkahramankitabi

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class RecyclerAdapter(
    val kahramanListesi : ArrayList<String>,
    val kahramanBitmaps:ArrayList<Bitmap> ) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>(){

    class SuperKahramanVH(itemView:View) :RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
    val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
    return SuperKahramanVH(itemView)
    }

    override fun getItemCount(): Int {
        return kahramanListesi.size

    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.recyclerViewTextView).text = kahramanListesi[position]
    }
}