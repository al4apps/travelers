package com.al4apps.travelers.presentation.newtrip

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.R
import com.al4apps.travelers.databinding.FragmentNewTripStep2Binding
import com.al4apps.travelers.presentation.dialogs.utils.trip1
import com.al4apps.travelers.presentation.utils.AbstractFragment

class NewTripStep2Fragment : AbstractFragment<FragmentNewTripStep2Binding>(
    FragmentNewTripStep2Binding::inflate
) {

    private var hh = 1
    private var min = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_newTripStep2Fragment_to_newTripStep3Fragment)
        }
        val addressMain = trip1.pointTo.village ?: trip1.pointTo.city ?: ""
        val addressSecondary = buildString {
            append(trip1.pointTo.country)
            append(", ")
            append(trip1.pointTo.region ?: "")
            append(", ")
            append(trip1.pointTo.city ?: "")
            append(", ")
            append(trip1.pointTo.street ?: "")
        }
        with(binding.addressBlock) {
            addressText.text = addressMain
            addressSecondaryInfoText.text = addressSecondary
            addressPointEditText.hint = getString(R.string.trip_confirm_address_end_point_field_hint)
        }
        with(binding.routeTimeBlock) {
            timeBlock.hourBlock.valueText.text = "$hh"
            timeBlock.minutesBlock.valueText.text = "0$min"
            timeBlock.hourBlock.staticText.text = "ч"
            timeBlock.minutesBlock.staticText.text = "мин"
            timeBlock.hourBlock.staticText.visibility = View.VISIBLE
            timeBlock.minutesBlock.staticText.visibility = View.VISIBLE
            timeBlock.hourBlock.plusButton.setOnClickListener {
                hh++
                timeBlock.hourBlock.valueText.text = "$hh"
            }
            timeBlock.hourBlock.minusButton.setOnClickListener {
                hh--
                timeBlock.hourBlock.valueText.text = "$hh"
            }
            timeBlock.minutesBlock.plusButton.setOnClickListener {
                min += 10
                timeBlock.minutesBlock.valueText.text = "$min"
            }
            timeBlock.minutesBlock.minusButton.setOnClickListener {
                min -= 10
                timeBlock.minutesBlock.valueText.text = "$min"
            }

        }
    }
}