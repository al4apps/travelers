package com.al4apps.travelers.presentation.profile

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.R
import com.al4apps.travelers.databinding.FragmentProfileBinding
import com.al4apps.travelers.presentation.utils.AbstractFragment

class ProfileFragment: AbstractFragment<FragmentProfileBinding>(FragmentProfileBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.unauthorizedBlock.registerButton.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_registrationFragment)
        }
        binding.unauthorizedBlock.loginButton.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_loginFragment)
        }
        binding.authInfoCard.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_profileEditFragment)
        }

        switchBlocksVisibility(true)
    }

    private fun switchBlocksVisibility(isAuthorized: Boolean) {
        binding.unauthorizedBlock.root.visibility = if (isAuthorized) View.GONE else View.VISIBLE
        binding.scrollAuthLayout.visibility = if (isAuthorized) View.VISIBLE else View.GONE

    }
}