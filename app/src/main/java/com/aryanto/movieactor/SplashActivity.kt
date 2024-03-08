package com.aryanto.movieactor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.aryanto.movieactor.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showSplashScreen()
    }

    private fun showSplashScreen() {
        val handler = Handler()
        val delay: Long = 3000

        handler.postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }, delay)

        Thread{
            var progress = 0

            while (progress < 100){
                try {
                    Thread.sleep(delay/100)
                    progress++
                    binding.pBar.progress = progress
                } catch (e: InterruptedException){
                    e.printStackTrace()
                }
            }
        }.start()
    }
}