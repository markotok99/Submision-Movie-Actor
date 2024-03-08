package com.aryanto.movieactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aryanto.movieactor.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setView()
    }

    private fun setView() {
        binding.apply {
            val dataPerson = intent.getParcelableExtra<Person>("person")

            if (dataPerson != null){
                ivDetail.setImageResource(dataPerson.photo)
                tvDetailName.text = dataPerson.name
                tvDetailDescription.text = dataPerson.desc
            }
        }
    }
}