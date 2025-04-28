package com.al4apps.travelers.presentation.dialogs.utils

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.viewbinding.ViewBinding
import com.al4apps.travelers.R


interface DialogListener

abstract class AbstractDialogFragment<T : ViewBinding, L : DialogListener>(
    private val isDialogCancelable: Boolean? = null,
    private val inflate: (
        inflater: LayoutInflater,
        root: ViewGroup?,
        attachToRoot: Boolean,
    ) -> T,
    private val listenerClass: Class<L>? = null,
) : DialogFragment() {

    private var _binding: T? = null
    protected val binding: T
        get() = _binding!!

    protected lateinit var dialogListener: L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.FullScreenDialog)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        isDialogCancelable?.let { isCancelable = it }
        _binding = inflate.invoke(inflater, container, false)
        return binding.root
    }

    @Suppress("UNCHECKED_CAST")
    override fun onAttach(context: Context) {
        super.onAttach(context)
        listenerClass?.let {
            try {
                dialogListener = requireParentFragment() as L
            } catch (e: ClassCastException) {
                throw ClassCastException(
                    "${requireParentFragment()} must implement ${it.name}"
                )
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}