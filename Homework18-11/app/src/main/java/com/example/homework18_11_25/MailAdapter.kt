package com.example.homework18_11_25

import android.R.drawable.star_off
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MailAdapter(val i: List<MailModel>): BaseAdapter() {
    override fun getCount() = i.size
    override fun getItem(pos: Int) = i[pos]
    override fun getItemId(pos: Int) = pos.toLong()

    override fun getView(
        pos: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {val view: View
        val viewHolder: MailAdapter.ViewHolder

        if (convertView == null){
            view = LayoutInflater.from(parent?.context).inflate(R.layout.item_mail, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else{
            view = convertView
            viewHolder = view.tag as MailAdapter.ViewHolder
        }
        viewHolder.viewDescription.text = i[pos].description
        viewHolder.viewUsername.text = i[pos].username
        viewHolder.viewTime.text = i[pos].time
        viewHolder.viewAvatar.setImageResource(i[pos].avatarResource)
        viewHolder.viewBtnStar.setImageResource(star_off)
        return view
    }
    class ViewHolder(itemView: View){
        val viewUsername: TextView
        val viewDescription: TextView
        val viewTime: TextView
        val viewBtnStar: ImageView
        val viewAvatar: ImageView
        init{
            viewDescription = itemView.findViewById<TextView>(R.id.textMailContent)
            viewUsername = itemView.findViewById<TextView>(R.id.textUsername)
            viewTime = itemView.findViewById<TextView>(R.id.textTime)
            viewAvatar = itemView.findViewById<ImageView>(R.id.imageAvatar)
            viewBtnStar = itemView.findViewById<ImageView>(R.id.btnStar)
        }
    }
}