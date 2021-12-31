package com.client.soulstudio.utils

import android.app.Activity
import android.graphics.Color
import android.view.View
import com.google.android.material.snackbar.Snackbar

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun showSnackBar(
    activity: Activity,
    message: String,
    action: String? = null,
    actionListener: View.OnClickListener? = null,
    duration: Int = Snackbar.LENGTH_SHORT
) {
    val snackBar = Snackbar.make(activity.findViewById(android.R.id.content), message, duration)
        .setTextColor(Color.WHITE)
    if (action != null && actionListener != null) {
        snackBar.setAction(action, actionListener)
    }
    snackBar.show()
}