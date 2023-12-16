package com.example.myapplication

import android.content.Context
import android.os.Handler
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessControlContext

class Adapter_class (private val context: Context,private val  list: List<Modalchat>): RecyclerView.Adapter<Adapter_class.ViewHolder>()
{
    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {
        fun bind(modalchat: Modalchat) {
name.text = modalchat.name
            time.text = modalchat.time
            detail.text = modalchat.detail
            image.text = modalchat.image


        }

        private val name: TextView = itemView.findViewById(R.id.name)
        private val time: TextView = itemView.findViewById(R.id.time)
        private val detail: TextView = itemView.findViewById(R.id.detail)
        private val image: TextView = itemView.findViewById(R.id.img)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_chat,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val currentitem = list[position]
        holder.bind(currentitem)

    }

}
