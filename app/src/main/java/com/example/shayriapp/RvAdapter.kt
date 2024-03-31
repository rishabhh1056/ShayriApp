package com.example.shayriapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shayriapp.databinding.ItemModelBinding

class RvAdapter(val context: Context, var shayariList: List<DataEntry>):RecyclerView.Adapter<RvAdapter.myViewHolder>() {

    class myViewHolder(var binding: ItemModelBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view = ItemModelBinding.inflate(LayoutInflater.from(context),parent,false)
        return myViewHolder(view)
    }

    override fun getItemCount(): Int {
       return shayariList.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.binding.textView.text = shayariList.get(position).shayari
    }
}