package com.devrachit.navmath

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import com.devrachit.featurea.Screen2Fragment

class Screen1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController(view)
        view.findViewById<Button>(R.id.button_to_screen_2)?.setOnClickListener {
            navController.navigate(R.id.action_screen_1_to_screen_2)
        }
        val navigateToScreen3from2 :()->Unit = {
            navController.navigate(R.id.action_screen_2_to_screen_3)
        }
    }
}