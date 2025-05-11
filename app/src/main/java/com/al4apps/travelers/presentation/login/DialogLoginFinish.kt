package com.al4apps.travelers.presentation.login

import android.os.Bundle
import android.view.View
import com.al4apps.travelers.databinding.DialogLoginFinishBinding
import com.al4apps.travelers.presentation.dialogs.utils.AbstractDialogFragment
import com.al4apps.travelers.presentation.dialogs.utils.DialogListener

interface DialogLoginFinishListener : DialogListener {
    fun onConfirmClicked()
    fun onCancelClicked()

}
class DialogLoginFinish : AbstractDialogFragment<DialogLoginFinishBinding, DialogLoginFinishListener>(
    false,
    DialogLoginFinishBinding::inflate,
    DialogLoginFinishListener::class.java
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.cancelButton.setOnClickListener {
            dialogListener.onCancelClicked()
            dismiss()
        }
        binding.confirmButton.setOnClickListener {
            dialogListener.onConfirmClicked()
        }
    }

}