package com.al4apps.travelers.presentation.documentation

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.databinding.FragmentUserAgreementBinding
import com.al4apps.travelers.presentation.utils.AbstractFragment
import com.al4apps.travelers.presentation.utils.readPrivacyPolicy

class UserAgreementFragment :
    AbstractFragment<FragmentUserAgreementBinding>(FragmentUserAgreementBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.agreementText.text = readPrivacyPolicy(requireContext())
        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }
        binding.upButton.setOnClickListener {
            binding.scrollView.smoothScrollTo(0, 0)
        }
    }
}