package com.example.homework18_11_25

import android.R.drawable.ic_menu_delete
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.TextView

class StudentAdapter(val i: List<StudentModel>): BaseAdapter() {
    override fun getCount() = i.size
    override fun getItem(pos: Int) = i[pos]
    override fun getItemId(pos: Int) = pos.toLong()

    override fun getViewTypeCount(): Int {
        return super.getViewTypeCount()
    }

    override fun getView(
        pos: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null){
            view = LayoutInflater.from(parent?.context).inflate(R.layout.item_student, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        viewHolder.viewMSSV.text = i[pos].mssv
        viewHolder.viewName.text = i[pos].name
        viewHolder.viewBtnDel.setImageResource(ic_menu_delete)
        return view
    }
    class ViewHolder(itemView: View){
        val viewMSSV: TextView
        val viewName: TextView
        val viewBtnDel: ImageButton
        init{
            viewMSSV = itemView.findViewById<TextView>(R.id.textMSSV)
            viewName = itemView.findViewById<TextView>(R.id.textName)
            viewBtnDel = itemView.findViewById<ImageButton>(R.id.btnDel)
        }
    }
}