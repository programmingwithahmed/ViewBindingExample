package com.programmingwithahmed.viewbindingexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.programmingwithahmed.viewbindingexample.databinding.RecyclerItemUserBinding

class UsersAdapter(private val users: ArrayList<User>) : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RecyclerItemUserBinding
            .inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(users[position])
    }

    override fun getItemCount(): Int {
        return users.size
    }


    class ViewHolder(val binding: RecyclerItemUserBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindItems(user: User) {

            binding.tvName.text = user.name
            binding.tvAge.text = "${user.age}"
        }
    }
}