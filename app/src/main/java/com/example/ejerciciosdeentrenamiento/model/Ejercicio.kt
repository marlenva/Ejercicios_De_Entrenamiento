package com.example.ejerciciosdeentrenamiento.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Ejercicio(
    @StringRes val stringId: Int,
    @DrawableRes val imagenId: Int,
    @StringRes val descripcion: Int
)
