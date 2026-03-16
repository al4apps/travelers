package com.al4apps.travelers.presentation.search

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.al4apps.travelers.R
import com.al4apps.travelers.databinding.FragmentSearchBinding
import com.al4apps.travelers.presentation.dialogs.DialogBottomSheetAddressFragment
import com.al4apps.travelers.presentation.dialogs.utils.showDialog
import com.al4apps.travelers.presentation.utils.AbstractFragment
import com.google.android.material.bottomsheet.BottomSheetBehavior

class SearchFragment : AbstractFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate) {

    private lateinit var addressBottomSheet: BottomSheetBehavior<ConstraintLayout>
//    private val backPressedCallbackWithBottomSheet = object : OnBackPressedCallback(true) {
//        override fun handleOnBackPressed() {
//            if (addressBottomSheet.state == BottomSheetBehavior.STATE_EXPANDED) {
//                addressBottomSheet.state = BottomSheetBehavior.STATE_HIDDEN
//                return
//            } else {
//                remove()
//                requireActivity().onBackPressedDispatcher.onBackPressed()
//            }
//        }
//
//    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = super.onCreateView(inflater, container, savedInstanceState)
//        addressBottomSheet = BottomSheetBehavior.from(binding.addressBottomSheet)
//        addressBottomSheet.apply {
//            state = BottomSheetBehavior.STATE_HIDDEN
//            isDraggable = false
//            addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
//                override fun onStateChanged(bottomSheet: View, newState: Int) {
//                    if (newState == BottomSheetBehavior.STATE_EXPANDED) {
//
//                    }
//                }
//
//                override fun onSlide(bottomSheet: View, slideOffset: Float) {}
//            })
//        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.searchButton.setOnClickListener {
            val action = R.id.action_searchFragment_to_searchResultsFragment
            findNavController().navigate(action)
        }
        initFormListeners()
//        requireActivity().onBackPressedDispatcher.addCallback(
//            viewLifecycleOwner, backPressedCallbackWithBottomSheet
//        )
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun initFormListeners() {
        binding.formBlock.fromEditText.setOnTouchListener { _, motionEvent ->
            onAddressClicked(motionEvent)
            true
        }
        binding.formBlock.destInputLayout.setOnTouchListener { _, motionEvent ->
            onAddressClicked(motionEvent)
            true
        }
    }

    private fun onAddressClicked(motionEvent: MotionEvent) {
        if (motionEvent.action == MotionEvent.ACTION_DOWN) {
//            addressBottomSheet.state = BottomSheetBehavior.STATE_EXPANDED
            showDialog(
                DialogBottomSheetAddressFragment::class.java,
                DialogBottomSheetAddressFragment.TAG
            )
        }
    }
}