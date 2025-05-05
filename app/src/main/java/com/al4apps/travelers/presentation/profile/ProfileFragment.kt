package com.al4apps.travelers.presentation.profile

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.R
import com.al4apps.travelers.databinding.FragmentProfileBinding
import com.al4apps.travelers.presentation.dialogs.AccountExitDialog
import com.al4apps.travelers.presentation.dialogs.AccountExitDialogListener
import com.al4apps.travelers.presentation.dialogs.utils.showDialog
import com.al4apps.travelers.presentation.utils.AbstractFragment

class ProfileFragment : AbstractFragment<FragmentProfileBinding>(FragmentProfileBinding::inflate),
    AccountExitDialogListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.authInfoBlock.usernameText.text = "Эшматов Тошмат"
        binding.authInfoBlock.userPhoneText.text = "+992 98 100 5050"

        initNavigation()

        switchBlocksVisibility(true)
    }

    private fun switchBlocksVisibility(isAuthorized: Boolean) {
        binding.unauthorizedBlock.root.visibility = if (isAuthorized) View.GONE else View.VISIBLE
        binding.scrollAuthLayout.visibility = if (isAuthorized) View.VISIBLE else View.GONE

    }

    private fun initNavigation() {
        with(binding) {
            unauthorizedBlock.apply {
                registerButton.setOnClickListener { navigateTo(R.id.action_profileFragment_to_registrationFragment) }
                loginButton.setOnClickListener { navigateTo(R.id.action_profileFragment_to_loginFragment) }
            }

            authInfoCard.setOnClickListener { navigateTo(R.id.action_profileFragment_to_profileEditFragment) }
            myCarsCard.setOnClickListener { navigateTo(R.id.action_profileFragment_to_myCarsFragment) }
            myTripsCard.setOnClickListener { navigateTo(R.id.action_profileFragment_to_myTripsFragment) }
            settingsCard.setOnClickListener { navigateTo(R.id.action_profileFragment_to_settingsFragment) }
            helpCard.setOnClickListener { navigateTo(R.id.action_profileFragment_to_helpFragment) }
            privacyPolicyCard.setOnClickListener { navigateTo(R.id.action_profileFragment_to_privacyPolicyFragment) }
            userAgreementCard.setOnClickListener { navigateTo(R.id.action_profileFragment_to_userAgreementFragment) }
            logoutCard.setOnClickListener { showDialog(AccountExitDialog::class.java) }
        }
    }

    private fun navigateTo(actionId: Int) {
        findNavController().navigate(actionId)
    }

    override fun onExit() {
    }

    override fun onCancel() {
    }
}