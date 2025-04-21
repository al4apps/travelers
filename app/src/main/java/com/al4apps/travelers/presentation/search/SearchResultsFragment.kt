package com.al4apps.travelers.presentation.search

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.databinding.FragmentSearchResultsBinding
import com.al4apps.travelers.presentation.utils.AbstractFragment

class SearchResultsFragment :
    AbstractFragment<FragmentSearchResultsBinding>(FragmentSearchResultsBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
        setupTabLayout()
    }

    private fun setupToolbar() {
        with(binding) {
            includedToolbar.toolbarTextAddressFrom.text = "Исфара"
            includedToolbar.toolbarTextAddressDest.text = "Худжанд"
            includedToolbar.arrowRight.visibility = View.VISIBLE
            includedToolbar.dateCountText.text = "Завтра, 1 пассажир"
            includedToolbar.searchToolbar.setNavigationOnClickListener {
                findNavController().navigateUp()
            }
        }
    }

    private fun setupTabLayout() {
        binding.tripTypeTabs.getTabAt(0)?.text = "Все"
        binding.tripTypeTabs.getTabAt(1)?.text = "Легковые"
        binding.tripTypeTabs.getTabAt(2)?.text = "Автобусы"
    }
}