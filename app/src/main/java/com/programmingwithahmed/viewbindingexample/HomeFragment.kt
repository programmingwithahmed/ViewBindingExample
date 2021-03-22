package com.programmingwithahmed.viewbindingexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.programmingwithahmed.viewbindingexample.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentHomeBinding.inflate(inflater)

        binding.apply {

            btnPrint.setOnClickListener {
                Toast.makeText(requireActivity(), etName.text.toString(), Toast.LENGTH_LONG).show()
            }

            layoutCommon.btnCommon.setOnClickListener {

                Toast.makeText(requireActivity(), "بخ", Toast.LENGTH_LONG).show()

            }

        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()

    }
}