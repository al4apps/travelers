package com.al4apps.travelers.presentation.newtrip

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.R
import com.al4apps.travelers.databinding.FragmentNewTripStep1Binding
import com.al4apps.travelers.presentation.dialogs.utils.trip1
import com.al4apps.travelers.presentation.utils.AbstractFragment
import com.al4apps.travelers.presentation.utils.formatTime
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat

class NewTripStep1Fragment : AbstractFragment<FragmentNewTripStep1Binding>(
    FragmentNewTripStep1Binding::inflate
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_newTripStep1Fragment_to_newTripStep2Fragment)
        }
        val addressMain = trip1.pointFrom.village ?: trip1.pointFrom.city ?: ""
        val addressSecondary = buildString {
            append(trip1.pointFrom.country)
            append(", ")
            append(trip1.pointFrom.region ?: "")
            append(", ")
            append(trip1.pointFrom.city ?: "")
            append(", ")
            append(trip1.pointFrom.street ?: "")
        }
        with(binding.addressBlock) {
            addressText.text = addressMain
            addressSecondaryInfoText.text = addressSecondary
        }
        val date = buildString {
            append(trip1.startDateTime.date.dayOfWeek)
            append(", ")
            append(trip1.startDateTime.date.day)
            append(" ")
            append(trip1.startDateTime.date.month)
        }
        val timePicker = MaterialTimePicker.Builder()
            .setTimeFormat(TimeFormat.CLOCK_24H)
            .setHour(9)
            .setMinute(0)
            .setInputMode(MaterialTimePicker.INPUT_MODE_KEYBOARD)
            .build()

        timePicker.addOnPositiveButtonClickListener {
            val hour = timePicker.hour
            val minute = timePicker.minute
            val time = formatTime(hour, minute)
            binding.dateTimeBlock.pickTimeButton.text = time

        }
        with(binding.dateTimeBlock) {
            dateInfoButton.text = date
            pickTimeButton.setOnClickListener {
                timePicker.show(childFragmentManager, "timePicker")
            }
        }
    }
}