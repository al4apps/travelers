package com.al4apps.travelers.presentation.search

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.R
import com.al4apps.travelers.databinding.FragmentSearchBinding
import com.al4apps.travelers.presentation.utils.AbstractFragment

class SearchFragment : AbstractFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.searchButton.setOnClickListener {
            val action = R.id.action_searchFragment_to_searchResultsFragment
            findNavController().navigate(action)
        }
    }
}