package com.al4apps.travelers.presentation.main

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.al4apps.travelers.databinding.FragmentMainBinding
import com.al4apps.travelers.presentation.utils.AbstractFragment

class MainFragment: AbstractFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        setupNavController()
    }

    private fun setupNavController() {
        val navHost = binding.mainFragmentContainerView.getFragment<NavHostFragment>()
        val navController = navHost.navController
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}