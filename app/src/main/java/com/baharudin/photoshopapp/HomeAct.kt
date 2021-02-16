package com.baharudin.photoshopapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

class HomeAct : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navigationFlow = supportFragmentManager.findFragmentById(R.id.fr_host) as NavHostFragment
        navController = navigationFlow.findNavController()


    }
}