package com.example.pvlapp

import android.content.Context
import android.hardware.Sensor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class mySensorAdapter(context: Context, itemlayout: Int,items: List<Sensor>) : ArrayAdapter<Sensor>(context, itemlayout, items) {

    var itemLayout: Int
    var inflator: LayoutInflater
    init {
        this.itemLayout = itemlayout
        this.inflator = LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup) : View?{
        var convertView: View? = convertView
        if(convertView == null){
            convertView = inflator.inflate(itemLayout, parent, false)


        }
        var p: Sensor = this.getItem(position)
        var text1: TextView? = convertView?.findViewById(android.R.id.text1)
        text1?.setText(p.name)

        if(itemLayout != android.R.layout.simple_list_item_1){
            var text2: TextView? = convertView?.findViewById(android.R.id.text2)
            text2?.setText(p.vendor)
        }
        return convertView

    }




}