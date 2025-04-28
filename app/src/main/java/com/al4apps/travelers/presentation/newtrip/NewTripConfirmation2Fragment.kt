package com.al4apps.travelers.presentation.newtrip

import android.os.Bundle
import android.view.View
import com.al4apps.travelers.databinding.FragmentNewTripConfirmation2Binding
import com.al4apps.travelers.presentation.dialogs.DialogNewTripConfirmationFinishFragment
import com.al4apps.travelers.presentation.dialogs.DialogNewTripConfirmationFinishListener
import com.al4apps.travelers.presentation.dialogs.utils.showDialog
import com.al4apps.travelers.presentation.utils.AbstractFragment
import com.al4apps.travelers.presentation.utils.toast

class NewTripConfirmation2Fragment: AbstractFragment<FragmentNewTripConfirmation2Binding>(
    FragmentNewTripConfirmation2Binding::inflate
), DialogNewTripConfirmationFinishListener {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButton.setOnClickListener {
            showDialog(DialogNewTripConfirmationFinishFragment::class.java)
        }
    }

    override fun onCreateClicked() {
        toast("Опубликовано")
    }

    override fun onEditClicked() {
        toast("Изменить")
    }
}