package com.max.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.max.weatherapp.databinding.ActivityMainBinding
import com.max.weatherapp.fragments.MainFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeHolder, MainFragment.newInstance())
            .commit()
    }
}