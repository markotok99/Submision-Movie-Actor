package com.aryanto.movieactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aryanto.movieactor.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setView()
    }

    private fun setView() {
        binding.apply {
            ivAboutPhoto.setImageResource(R.drawable.person_24)
            tvNameAbout.text = "Author name"
            tvEmailAbout.text = "Author.example@email.com"
        }
    }
}