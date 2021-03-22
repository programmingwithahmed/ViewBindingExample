package com.programmingwithahmed.viewbindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programmingwithahmed.viewbindingexample.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, HomeFragment.newInstance()).commit()
        }



    }
}