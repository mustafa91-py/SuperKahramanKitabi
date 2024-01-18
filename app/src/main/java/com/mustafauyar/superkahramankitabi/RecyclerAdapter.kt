package com.mustafauyar.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class RecyclerAdapter(
    val kahramanHashMap : HashMap<String,Int>) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>(){

    class SuperKahramanVH(itemView:View) :RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
    val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
    return SuperKahramanVH(itemView)
    }

    override fun getItemCount(): Int {
        return kahramanHashMap.size

    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        val kahramanListesi = kahramanHashMap.keys.toList()
        holder.itemView.findViewById<TextView>(R.id.recyclerViewTextView).text = kahramanListesi[position]

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("kahraman",kahramanListesi[position])
            intent.putExtra("kahramanGorsel", kahramanHashMap[kahramanListesi[position]])

            holder.itemView.context.startActivity(intent)
        }
    }
}