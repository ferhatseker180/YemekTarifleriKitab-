package com.example.yemekkitabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val menuInflater = getMenuInflater().inflate(R.menu.yemek_ekle,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_ekle) {
            val action = ListeFragmentDirections.actionListeFragmentToTarifFragment("menudengeldim",0)
            Navigation.findNavController(this,R.id.fragment).navigate(action)
        }
        return super.onOptionsItemSelected(item)
    }
}