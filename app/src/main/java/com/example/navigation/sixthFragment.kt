package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class SixthFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sixth, container, false)

        view.findViewById<Button>(R.id.btnSete).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_sixthFragment_to_firstFragment)
        }

        return view
    }


}