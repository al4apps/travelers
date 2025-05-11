package com.al4apps.travelers.presentation.utils

import android.content.Context
import com.al4apps.travelers.R
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

fun readPrivacyPolicy(context: Context): String = readText(R.raw.privacy_policy_text, context)

fun readText(resourceId: Int, context: Context): String {
    val inputStream: InputStream = context.resources.openRawResource(resourceId)
    val reader = BufferedReader(InputStreamReader(inputStream))
    val text = StringBuilder()
    var line: String?
    reader.use { currentReader ->
        while ((currentReader.readLine().also { line = it }) != null) {
            text.append(line).append("\n")
        }
    }
    return text.toString()
}