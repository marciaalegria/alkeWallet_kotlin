package com.example.proyectoandroidstudio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup





class LoginSignUpFragment : Fragment() {
    private var email: String? = null
    private var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            email = it.getString(EMAIL_BUNDLE)
            password = it.getString(PASSWORD_BUNDLE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_sign_up, container, false)
    }

    companion object {
         const val EMAIL_BUNDLE = "email_bundle"
         const val PASSWORD_BUNDLE = "password_bundle"

        @JvmStatic
        fun newInstance(email: String, password: String) =
            LoginSignUpFragment().apply {
                arguments = Bundle().apply {
                    putString(EMAIL_BUNDLE, email)
                    putString(PASSWORD_BUNDLE, password)
                }
            }
    }
}