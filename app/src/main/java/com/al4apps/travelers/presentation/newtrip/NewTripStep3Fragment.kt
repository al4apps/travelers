package com.al4apps.travelers.presentation.newtrip

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.R
import com.al4apps.travelers.databinding.FragmentNewTripStep3Binding
import com.al4apps.travelers.presentation.dialogs.utils.trip1
import com.al4apps.travelers.presentation.utils.AbstractFragment

class NewTripStep3Fragment : AbstractFragment<FragmentNewTripStep3Binding>(
    FragmentNewTripStep3Binding::inflate
) {

    var seatsCount: Short = 1
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_newTripStep3Fragment_to_newTripStep4Fragment)
        }
        with(binding.carBlock) {
            carModelText.text = buildString {
                append(trip1.driver?.car?.brand)
                append(" ")
                append(trip1.driver?.car?.model)
            }
        }
        with(binding.seatsCountBlock) {
            seatsCount = trip1.driver?.car?.seats ?: 1
            valueText.text = trip1.driver?.car?.seats.toString()
            plusButton.setOnClickListener {
                seatsCount++
                valueText.text = seatsCount.toString()
            }
            minusButton.setOnClickListener {
                seatsCount--
                valueText.text = seatsCount.toString()
            }
        }
    }
}