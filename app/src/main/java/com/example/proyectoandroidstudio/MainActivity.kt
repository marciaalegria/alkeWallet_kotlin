package com.example.proyectoandroidstudio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.proyectoandroidstudio.SplashFragment.Companion.LOGO_BUNDLE
import com.example.proyectoandroidstudio.SplashFragment.Companion.NAME_BUNDLE

import com.example.proyectoandroidstudio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle= bundleOf(LOGO_BUNDLE to "PRIMER DATO",
            NAME_BUNDLE to "segundo dato")

        // Carga el fragmento si no está añadido
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<SplashFragment>(R.id.fragment_container_view, args = bundle)

            }
        }


    }
}
