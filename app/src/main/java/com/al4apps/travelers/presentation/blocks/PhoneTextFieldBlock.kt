package com.al4apps.travelers.presentation.blocks

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.al4apps.travelers.R
import com.al4apps.travelers.databinding.BlockPhoneTextFieldBinding

class PhoneTextFieldBlock(
    context: Context,
    attrs: AttributeSet
) : ConstraintLayout(context, attrs) {

    private lateinit var binding: BlockPhoneTextFieldBinding

    init {
        inflate(context, R.layout.block_phone_text_field, this)
        binding = BlockPhoneTextFieldBinding.bind(this)
    }
}