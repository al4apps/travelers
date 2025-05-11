package com.al4apps.travelers.presentation.registration

import android.os.Bundle
import android.view.View
import com.al4apps.travelers.databinding.DialogRegistrationFinishBinding
import com.al4apps.travelers.presentation.dialogs.utils.AbstractDialogFragment
import com.al4apps.travelers.presentation.dialogs.utils.DialogListener

interface DialogRegistrationFinishListener : DialogListener {
    fun onCancelClicked()
    fun onConfirmClicked()
}
class DialogRegistrationFinish: AbstractDialogFragment<DialogRegistrationFinishBinding, DialogRegistrationFinishListener>(
    isDialogCancelable = false,
    inflate = DialogRegistrationFinishBinding::inflate,
    null) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialogListener = requireParentFragment() as DialogRegistrationFinishListener
        binding.cancelButton.setOnClickListener {
            dialogListener.onCancelClicked()
            dismiss()
        }
        binding.confirmButton.setOnClickListener {
            dialogListener.onConfirmClicked()
            dismiss()
        }
    }
}