package com.al4apps.travelers.presentation.documentation

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.databinding.FragmentPrivacyPolicyBinding
import com.al4apps.travelers.presentation.utils.AbstractFragment
import com.al4apps.travelers.presentation.utils.readPrivacyPolicy

class PrivacyPolicyFragment :
    AbstractFragment<FragmentPrivacyPolicyBinding>(FragmentPrivacyPolicyBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.privacyText.text = readPrivacyPolicy(requireContext())
        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }
        binding.upButton.setOnClickListener {
            binding.scrollView.smoothScrollTo(0, 0)
        }
    }
}