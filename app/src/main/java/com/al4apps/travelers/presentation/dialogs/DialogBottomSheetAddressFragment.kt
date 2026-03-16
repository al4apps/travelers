package com.al4apps.travelers.presentation.dialogs

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.al4apps.travelers.R
import com.al4apps.travelers.databinding.DialogBottomSheetAddressBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class DialogBottomSheetAddressFragment : BottomSheetDialogFragment() {

    private var _binding: DialogBottomSheetAddressBinding? = null
    private val binding: DialogBottomSheetAddressBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.FullScreenBottomSheetDialog)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        _binding = DialogBottomSheetAddressBinding.inflate(LayoutInflater.from(context))
        val bottomSheetDialog = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
        bottomSheetDialog.setContentView(binding.root)
        bottomSheetDialog.behavior.state = BottomSheetBehavior.STATE_EXPANDED
        return bottomSheetDialog
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog as? BottomSheetDialog ?: return
        val bottomSheet = dialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet) ?: return
//        bottomSheet.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
//        val behavior = BottomSheetBehavior.from(bottomSheet)
//        behavior.state = BottomSheetBehavior.STATE_EXPANDED
    }

    companion object {
        const val TAG = "DialogBottomSheetAddressFragment"
    }
}