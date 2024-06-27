package com.example.proyectoandroidstudio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SplashFragment : Fragment() {
    companion object {
        const val LOGO_BUNDLE = "logo_bundle"
        const val NAME_BUNDLE = "name_bundle"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_splash, container, false)
        val imageNavigate = root.findViewById<ImageView>(R.id.imageNavigate)
        imageNavigate.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_loginSignUpFragment)
        }
        return root
    }
}


