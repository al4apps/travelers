package com.al4apps.travelers.presentation.registration

import android.os.Bundle
import android.view.View
import com.al4apps.travelers.databinding.FragmentRegistrationBinding
import com.al4apps.travelers.presentation.dialogs.utils.showDialog
import com.al4apps.travelers.presentation.utils.AbstractFragment

class RegistrationFragment :
    AbstractFragment<FragmentRegistrationBinding>(FragmentRegistrationBinding::inflate),
    DialogRegistrationFinishListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.registerButton.setOnClickListener {
            showDialog(DialogRegistrationFinish::class.java)
        }
        initPhoneTextField()
    }

    private fun initPhoneTextField() {
        binding.phoneBlock.menuStartIcon.setOnClickListener {
            binding.phoneBlock.menuLayoutCard.visibility = View.VISIBLE
        }
        binding.phoneBlock.menuTj.setOnClickListener {
            binding.phoneBlock.menuLayoutCard.visibility = View.GONE
        }
        binding.phoneBlock.menuUz.setOnClickListener {
            binding.phoneBlock.menuLayoutCard.visibility = View.GONE
        }
        binding.phoneBlock.menuKg.setOnClickListener {
            binding.phoneBlock.menuLayoutCard.visibility = View.GONE
        }
    }

    override fun onCancelClicked() {
    }

    override fun onConfirmClicked() {
    }
}