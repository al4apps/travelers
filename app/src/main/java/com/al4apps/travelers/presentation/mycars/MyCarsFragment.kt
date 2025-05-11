package com.al4apps.travelers.presentation.mycars

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.R
import com.al4apps.travelers.databinding.FragmentMyCarsBinding
import com.al4apps.travelers.presentation.utils.AbstractFragment

class MyCarsFragment: AbstractFragment<FragmentMyCarsBinding>(FragmentMyCarsBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addCarButton.setOnClickListener {
            findNavController().navigate(R.id.action_myCarsFragment_to_newCarFragment)
        }
    }
}