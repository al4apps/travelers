package com.al4apps.travelers.presentation.dialogs.utils

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment


fun Fragment.showDialog(clazz: Class<out DialogFragment>, tag: String? = null) {
    val dialog = clazz.getConstructor().newInstance()
    dialog.show(childFragmentManager, tag)
}
