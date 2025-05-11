package com.al4apps.travelers.presentation.login

import android.os.Bundle
import android.view.View
import androidx.core.widget.doOnTextChanged
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.databinding.FragmentLoginBinding
import com.al4apps.travelers.presentation.dialogs.utils.showDialog
import com.al4apps.travelers.presentation.utils.AbstractFragment

class LoginFragment: AbstractFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate),
    DialogLoginFinishListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }
        binding.signInButton.setOnClickListener {
            showDialog(DialogLoginFinish::class.java)
        }
        binding.phoneBlock.phoneEditText.doOnTextChanged { text, start, before, count ->
            binding.signInButton.isEnabled = text != null && text.length > 8
        }
    }

    override fun onConfirmClicked() {

    }

    override fun onCancelClicked() {

    }
}