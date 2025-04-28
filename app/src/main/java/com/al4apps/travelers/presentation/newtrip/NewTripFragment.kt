package com.al4apps.travelers.presentation.newtrip

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.R
import com.al4apps.travelers.databinding.FragmentNewTripBinding
import com.al4apps.travelers.presentation.utils.AbstractFragment

class NewTripFragment : AbstractFragment<FragmentNewTripBinding>(FragmentNewTripBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tripFormBlock.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_newTripFragment_to_newTripStep1Fragment)
        }

    }
}