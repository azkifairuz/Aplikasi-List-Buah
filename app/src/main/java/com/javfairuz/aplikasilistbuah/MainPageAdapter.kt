package com.javfairuz.aplikasilistbuah

import android.content.Intent
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MainPageAdapter(private val listFruit: ArrayList<Fruit>,private val context: Context): RecyclerView.Adapter<MainPageAdapter.MainPagHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainPagHolder {
       val view: View = LayoutInflater.from(parent.context).inflate(R.layout.main_page,parent,false)
        return  MainPagHolder(view)
    }

    override fun onBindViewHolder(holder: MainPagHolder, position: Int) {
        val fruit = listFruit[position]

       Glide.with(holder.itemView.context)
           .load(fruit.image)
           .apply(RequestOptions().override(100,100))
           .into(holder.imgPhoto)
        holder.tvName.text = fruit.name
        holder.tvDetail.text = fruit.detail
        holder.btnDetail.setOnClickListener{
            val moveIntent = Intent(context,DetailActivity::class.java)
            moveIntent.putExtra(DetailActivity.EXTRA_NAME,fruit.name)
            moveIntent.putExtra(DetailActivity.EXTRA_DESK,fruit.detail)
            moveIntent.putExtra(DetailActivity.EXTRA_IMG,fruit.image)
            context.startActivity(moveIntent)
            Toast.makeText(holder.itemView.context, "kamu pilih " +fruit.name, Toast.LENGTH_SHORT).show()
        }
        holder.itemView.setOnClickListener{
            val moveIntent = Intent(context,DetailActivity::class.java)
            moveIntent.putExtra(DetailActivity.EXTRA_NAME,fruit.name)
            moveIntent.putExtra(DetailActivity.EXTRA_DESK,fruit.detail)
            moveIntent.putExtra(DetailActivity.EXTRA_IMG,fruit.image)
            context.startActivity(moveIntent)
            Toast.makeText(holder.itemView.context, "kamu pilih " +fruit.name, Toast.LENGTH_SHORT).show()
        }



    }

    override fun getItemCount() = listFruit.size

    inner class MainPagHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.imgPhoto)
        var tvName: TextView = itemView.findViewById(R.id.tvName)
        var tvDetail: TextView = itemView.findViewById(R.id.tvDetile)
        var btnDetail: Button = itemView.findViewById(R.id.btnDetile)


    }

}


