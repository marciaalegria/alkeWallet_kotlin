package com.example.proyectoandroidstudio

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlin.math.log


class SplashFragment : Fragment() {
    private var logo_bundle: String? = null
    private var name_bundle: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            logo_bundle = it.getString(LOGO_BUNDLE)
            name_bundle = it.getString(NAME_BUNDLE)
            Log.i("yta", logo_bundle.orEmpty())
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    companion object {
         const val LOGO_BUNDLE = "logo_bundle"
         const val NAME_BUNDLE = "name_bundle"
        @JvmStatic
        fun newInstance(logo: String, name: String) =
            SplashFragment().apply {
                arguments = Bundle().apply {
                    putString(LOGO_BUNDLE, logo)
                    putString(NAME_BUNDLE, name)
                }
            }
    }
}