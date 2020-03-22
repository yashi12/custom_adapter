package com.example.customlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.teacherlist.*

class MainActivity : AppCompatActivity() {
    var t: teacher=teacher()
    var teachers : ArrayList<teacher> = t.randomteacher()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("error","done")
        val k:teacherAdapter = teacherAdapter()
        Log.d("error","done1")
        id_lvitems.adapter=k
        Log.d("error","done2")
    }
    inner class teacherAdapter(): BaseAdapter(){
        override fun getItem(p0: Int): teacher {
            return teachers.get(p0)
        }

        override fun getView(position: Int, p1: View, parent: ViewGroup): View {
            val itemview: View= layoutInflater.inflate(
                R.layout.teacherlist,
                parent,
                false
            )
            val tvname:TextView=itemview.findViewById(R.id.id_name)
            val tvcourse:TextView=itemview.findViewById(R.id.id_cource)
            tvname.text= getItem (position).name
            tvcourse.text=getItem(position).cource
            return itemview
        }



        override fun getItemId(p0: Int): Long {
            return 0
        }

        override fun getCount(): Int {
           return teachers.size
        }

    }
}
