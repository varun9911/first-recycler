package com.example.recycler

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class pa(data: List<String>) : RecyclerView.Adapter<pa.ProgrammingViewHolder>() {
    var data:Array<String> = TODO()
    fun pa(data:Array<String>){
this.data=data
}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgrammingViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view:View=inflater.inflate(R.layout.item_layout,parent,false)
        return ProgrammingViewHolder(view)
    }
    override fun onBindViewHolder(holder:ProgrammingViewHolder,position: Int){
var title =data[position]
        holder.txt?.setText(title)
    }
    override fun getItemCount(): Int = data.size
     class ProgrammingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txt:TextView?=null
        val itemView:View=super.itemView
        init {
            val img:ImageView=itemView.findViewById(R.id.img)
            val txt:TextView=itemView.findViewById(R.id.txt)
        }
        fun ProgrammingViewHolder(itemView:View){
            super.itemView
            val img:ImageView=itemView.findViewById(R.id.img)
            val txt:TextView=itemView.findViewById(R.id.txt)

        }
    }


}