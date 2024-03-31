package com.example.shayriapp

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shayriapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private  var shayariList = ArrayList<DataEntry>()
    private lateinit var myViewModel: myViewModel
    private val RvAdapter by lazy {
        RvAdapter(this,shayariList)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)
        myViewModel = ViewModelProvider(this).get(myViewModel::class.java)
        binding.rv.layoutManager = LinearLayoutManager(this)
        RvAdapter.shayariList = myViewModel.getData()
        binding.rv.adapter = RvAdapter
//        setSupportActionBar(binding.toolbar)



        binding.fab.setOnClickListener { view ->
            startActivity(Intent(this, AddAdded::class.java))
        }
    }






}