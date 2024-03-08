package com.aryanto.movieactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aryanto.movieactor.databinding.ActivityHomeBinding
import com.aryanto.movieactor.databinding.ActivitySplashBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var homeAdapter: HomeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setAdapter()
    }

    private fun setAdapter() {
        binding.apply {
            homeAdapter = HomeAdapter(personList)
            rvHome.layoutManager = LinearLayoutManager(this@HomeActivity)
            rvHome.adapter = homeAdapter
        }
    }
}