package com.programmingwithahmed.viewbindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.programmingwithahmed.viewbindingexample.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val users = arrayListOf(
            User("Ahmed", 30),
            User("Ali", 40),
            User("Mohammed", 52),
            User("Hamada", 30),
            User("Ibrahim", 25),
            User("Omr", 22),
            User("Omr", 22),
            User("Omr", 22),
            User("Omr", 22),
            User("Omr", 22),
            User("Omr", 22),
        )

        binding.apply {

            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity3)
            val adapter = UsersAdapter(users)
            recyclerView.adapter = adapter

        }


    }

}