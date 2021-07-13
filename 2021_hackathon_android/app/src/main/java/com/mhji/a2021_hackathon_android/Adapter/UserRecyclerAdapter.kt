package com.mhji.a2021_hackathon_android.Adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mhji.a2021_hackathon_android.Network.PostAll
import com.mhji.a2021_hackathon_android.R


class UserRecyclerAdapter(val postList : ArrayList<PostAll>, val context : Context) : RecyclerView.Adapter<UserRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.main_item, parent ,false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return postList.count()
    }


    class ViewHolder (itemView: View? ) : RecyclerView.ViewHolder(itemView!!){

        val price = itemView?.findViewById<TextView>(R.id.item_price)
        val address  = itemView?.findViewById<TextView>(R.id.item_address)

        val phoneNumber =   itemView?.findViewById<TextView>(R.id.item_phone)

        fun bind(item : PostAll? , context: Context){

            price?.text = PostAll?.price
            address?.text = PostAll?.address.toString()

        }
        }

    }
}