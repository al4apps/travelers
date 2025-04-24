package com.al4apps.travelers.presentation.dialogs

import android.os.Bundle
import android.view.View
import com.al4apps.travelers.databinding.DialogNewTripConfirmationFinishBinding
import com.al4apps.travelers.presentation.dialogs.utils.AbstractDialogFragment
import com.al4apps.travelers.presentation.dialogs.utils.DialogListener

interface DialogNewTripConfirmationFinishListener : DialogListener {
    fun onCreateClicked()
    fun onEditClicked()
}

class DialogNewTripConfirmationFinishFragment :
    AbstractDialogFragment<DialogNewTripConfirmationFinishBinding, DialogNewTripConfirmationFinishListener>(
        isDialogCancelable = false,
        inflate = DialogNewTripConfirmationFinishBinding::inflate,
        listenerClass = DialogNewTripConfirmationFinishListener::class.java
    ) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialogListener = requireParentFragment() as DialogNewTripConfirmationFinishListener
        binding.publishButton.setOnClickListener {
            dialogListener.onCreateClicked()
            dismiss()
        }
        binding.editButton.setOnClickListener {
            dialogListener.onEditClicked()
            dismiss()
        }
    }

}