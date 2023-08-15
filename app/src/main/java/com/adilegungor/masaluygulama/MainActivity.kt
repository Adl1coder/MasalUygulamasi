package com.adilegungor.masaluygulama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewbinding.ViewBinding
import com.adilegungor.masaluygulama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.LoginBtn.setOnClickListener{
startActivity(Intent(this,LoginActivity::class.java))
        }
        binding.skipBtn.setOnClickListener {
startActivity(Intent(this,DashboardUserActivity::class.java))
        }
    }

}