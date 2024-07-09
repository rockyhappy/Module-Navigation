package com.devrachit.featurea

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import com.devrachit.featureb.Screen3Fragment


class Screen2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController(view)
        Log.d("",navController.toString())
        view.findViewById<Button>(R.id.button_to_screen_3)?.setOnClickListener {
            navController.navigate(R.id.action_screen_2_to_screen_3)
        }
    }
}
