package com.dsm.app30dias.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Task(
    val day: Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val imageRes: Int
)