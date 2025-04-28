package com.al4apps.travelers.presentation.newtrip

import android.os.Bundle
import android.view.View
import com.al4apps.travelers.databinding.FragmentNewTripStep4Binding
import com.al4apps.travelers.presentation.utils.AbstractFragment

class NewTripStep4Fragment: AbstractFragment<FragmentNewTripStep4Binding>(
    FragmentNewTripStep4Binding::inflate
) {

    private var price = 120
    private val step = 10
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding.priceBlock) {
            valueEditText.setText(price.toString())
            plusButton.setOnClickListener {
                price += step
                valueEditText.setText(price.toString())
            }
            minusButton.setOnClickListener {
                price -= step
                valueEditText.setText(price.toString())
            }
        }
    }
}