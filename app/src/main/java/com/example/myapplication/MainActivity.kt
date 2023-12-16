package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        class ActivityAdapter :AppCompatActivity()
        {
            private lateinit var recyclerView: RecyclerView
            private lateinit var adapter: ActivityAdapter
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                val userList: List<Modalchat> =  listOf(
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say "),
                    Modalchat("Naseeb Sultan","3:45PM","Tears are words hearts cannot say ")


                )
                recyclerView = findViewById(R.id.rvid)
                recyclerView.layoutManager = LinearLayoutManager(this)
                recyclerView.adapter = Adapter_class(this,userList)

            }

        }



    }
}