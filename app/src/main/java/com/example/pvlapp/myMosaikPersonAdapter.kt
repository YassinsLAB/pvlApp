package com.example.pvlapp
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class myMosaikPersonAdapter(context : Context,itemLayout : Int ,items : List<MosaikPerson>) : ArrayAdapter<MosaikPerson>(context,itemLayout,items){
    var itemLayout: Int
    var inflator: LayoutInflater
init {
    this.itemLayout = itemLayout
    this.inflator = LayoutInflater.from(context)
}

    override fun getView(position: Int, convertView: View?, parent: ViewGroup) : View?{
        var convertView: View? = convertView
        if(convertView == null){
            convertView = inflator.inflate(itemLayout, parent, false)


        }
        var p: MosaikPerson = this.getItem(position)
        var text1: TextView? = convertView?.findViewById(android.R.id.text1)
        text1?.setText(p.nickname)

        if(itemLayout != android.R.layout.simple_list_item_1){
            var text2: TextView? = convertView?.findViewById(android.R.id.text2)
            text2?.setText(p.haircolor)
        }
        return convertView

    }



}