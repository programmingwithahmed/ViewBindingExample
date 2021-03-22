package com.programmingwithahmed.viewbindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.programmingwithahmed.viewbindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.btnPrint.setOnClickListener {
//
//            Toast.makeText(this, binding.etName.text.toString(), Toast.LENGTH_LONG).show()
//
//        }

        binding.apply {

            btnPrint.setOnClickListener {
                Toast.makeText(this@MainActivity, binding.etName.text.toString(), Toast.LENGTH_LONG).show()
            }

        }


    }
}