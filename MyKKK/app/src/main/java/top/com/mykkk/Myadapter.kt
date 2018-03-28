package top.com.mykkk

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
/**
 * Created by ttop on 2018/3/28.
 */
class Myadapter(var context: Context,  var mdata: ArrayList<String>) : RecyclerView.Adapter<Myadapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder? {
        val view = LayoutInflater.from(context).inflate(R.layout.mykkk_item_recycler_layout, null)
        val holder = MyHolder(view)
        return holder
    }

    override fun getItemCount(): Int = mdata .size

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {
        holder?.item_show?.setText(""+ mdata [position])
    }

    class MyHolder( v:View): RecyclerView.ViewHolder(v) {
         var item_show:TextView
        init {
             item_show = v.findViewById<TextView>(R.id.item_show)
        }

    }
}