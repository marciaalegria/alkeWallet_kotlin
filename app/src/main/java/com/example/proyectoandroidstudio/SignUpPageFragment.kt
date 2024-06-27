package com.example.proyectoandroidstudio

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.proyectoandroidstudio.databinding.FragmentSignUpPageBinding


class SignUpPageFragment : Fragment() {
    private lateinit var binding: FragmentSignUpPageBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignUpPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(view)

        //navegacion

        val buttonCrearCuenta = binding.buttonCrearCuenta

        val buttonYaTieneCuenta = binding.buttonYaTieneCuenta

        buttonCrearCuenta.setOnClickListener {
            navController.navigate(R.id.action_signUpPageFragment_to_homePageFragment)
        }
        buttonYaTieneCuenta.setOnClickListener {
            navController.navigate(R.id.action_signUpPageFragment_to_profileFragment)
        }

    }
}