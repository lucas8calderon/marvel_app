package com.example.marvel_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.marvel_app.R
import com.example.marvel_app.model.character.CharacterModel


class CharacterItemAdapter(private val itemList: List<CharacterModel>) :
    RecyclerView.Adapter<CharacterItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: CharacterModel) {
            val textViewTitle = itemView.findViewById<TextView>(R.id.textViewName)
            textViewTitle.text = item.name

        }
    }
}
