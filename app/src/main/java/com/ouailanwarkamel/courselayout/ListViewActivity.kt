package com.ouailanwarkamel.courselayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val arrayAdapter: ArrayAdapter<String>
        val users = arrayOf(
            "Amel Hamodi", "Lamia mekid", "Nour",  "Fadhla", "Fatima" )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.userlist)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter
    }
}


