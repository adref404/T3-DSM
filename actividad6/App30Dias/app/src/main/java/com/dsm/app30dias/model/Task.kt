package com.dsm.app30dias.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Task(
    val num: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val name: Int,
    @StringRes val description: Int,
)