package com.example.proyectoandroidstudio

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import com.example.proyectoandroidstudio.databinding.FragmentLoginSignUpPageBinding


class LoginSignUpFragment : Fragment() {
    private lateinit var binding: FragmentLoginSignUpPageBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginSignUpPageBinding.inflate(inflater, container, false)

        return   binding.root  }

    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController(view)

        //navegacion

        val button = binding.button

        val button2 = binding.button2

        button.setOnClickListener {
            navController.navigate(R.id.action_loginSignUpFragment_to_signUpPageFragment)
        }

        button2.setOnClickListener {
            navController.navigate(R.id.action_loginSignUpFragment_to_loginPageFragment)
        }
    }

}