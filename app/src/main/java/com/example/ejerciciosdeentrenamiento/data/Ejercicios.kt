package com.example.ejerciciosdeentrenamiento.data

import com.example.ejerciciosdeentrenamiento.R
import com.example.ejerciciosdeentrenamiento.model.Ejercicio

class Ejercicios() {
    fun ejerciciosEntrenamiento(): List<Ejercicio> {
        return listOf<Ejercicio>(
            Ejercicio(R.string.ejercicio1, R.drawable.flexiones, R.string.descripcion1),
            Ejercicio(R.string.ejercicio2, R.drawable.sentadillas, R.string.descripcion2),
            Ejercicio(R.string.ejercicio3, R.drawable.plancha_lateral, R.string.descripcion3),
            Ejercicio(R.string.ejercicio4, R.drawable.zancadas, R.string.descripcion4),
            Ejercicio(R.string.ejercicio5, R.drawable.burpee, R.string.descripcion5),
            Ejercicio(R.string.ejercicio6, R.drawable.abdominales, R.string.descripcion6),
            Ejercicio(R.string.ejercicio7, R.drawable.saltos_en_tijera, R.string.descripcion7),
            Ejercicio(R.string.ejercicio8, R.drawable.elevacion_talones, R.string.descripcion8),
            Ejercicio(R.string.ejercicio9, R.drawable.dominadas, R.string.descripcion9),
            Ejercicio(R.string.ejercicio10, R.drawable.elevacion_piernas, R.string.descripcion10),
            Ejercicio(R.string.ejercicio11, R.drawable.plancha, R.string.descripcion11),
            Ejercicio(R.string.ejercicio12, R.drawable.moutain, R.string.descripcion12)
        )
    }
}