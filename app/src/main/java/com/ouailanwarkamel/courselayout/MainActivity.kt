package com.ouailanwarkamel.courselayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_listview -> {
                startActivity(Intent(this, ListViewActivity::class.java))
                true
            }
            R.id.item_webView ->{
                startActivity(Intent(this, WebViewActivity::class.java))
                return true
            }
            R.id.item_tblayout ->{
                startActivity(Intent(this, TableLayout::class.java))
                return true
            }

            R.id.item_framelayout ->{
                startActivity(Intent(this, FrameLayoutActivity::class.java))
                return true
            }
            R.id.item_shap -> {
                startActivity(Intent(this, ShapActivity::class.java))
                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }


}