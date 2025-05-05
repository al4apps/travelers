package com.al4apps.travelers.presentation.dialogs

import android.os.Bundle
import android.view.View
import com.al4apps.travelers.databinding.DialogAccountExitBinding
import com.al4apps.travelers.presentation.dialogs.utils.AbstractDialogFragment
import com.al4apps.travelers.presentation.dialogs.utils.DialogListener

interface AccountExitDialogListener : DialogListener {
    fun onExit()
    fun onCancel()
}

class AccountExitDialog : AbstractDialogFragment<DialogAccountExitBinding, AccountExitDialogListener>(
    isDialogCancelable = true,
    inflate = DialogAccountExitBinding::inflate,
    listenerClass = AccountExitDialogListener::class.java
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialogListener = requireParentFragment() as AccountExitDialogListener
        binding.exitButton.setOnClickListener {
            dialogListener.onExit()
            dismiss()
        }
        binding.cancelButton.setOnClickListener {
            dialogListener.onCancel()
            dismiss()
        }
    }
}