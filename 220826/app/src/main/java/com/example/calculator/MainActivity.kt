package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)

        binding.num7Btn.setOnClickListener {
            binding.text.text = binding.num7Btn.text.toString()

            val result = binding.edit.text.toString() + binding.num7Btn.text.toString()
            binding.edit.setText(result)
        }
    }
}