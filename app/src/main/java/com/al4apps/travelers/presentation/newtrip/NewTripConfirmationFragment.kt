package com.al4apps.travelers.presentation.newtrip

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.R
import com.al4apps.travelers.databinding.FragmentNewTripConfirmationBinding
import com.al4apps.travelers.presentation.utils.AbstractFragment

class NewTripConfirmationFragment: AbstractFragment<FragmentNewTripConfirmationBinding>(
    FragmentNewTripConfirmationBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_newTripConfirmationFragment_to_newTripConfirmation2Fragment)

        }
    }
}