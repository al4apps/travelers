package com.al4apps.travelers.presentation.profile

import android.os.Bundle
import android.view.View
import com.al4apps.travelers.databinding.FragmentProfileEditBinding
import com.al4apps.travelers.presentation.utils.AbstractFragment

class ProfileEditFragment: AbstractFragment<FragmentProfileEditBinding>(
    FragmentProfileEditBinding::inflate
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            nameEditText.setText("Тошмат Эшматов")
            phoneEditText.setText("99 999 99 99")
            whatsappTextFieldBlock.phoneEditText.setText("+992 99 999 99 99")

        }
    }
}