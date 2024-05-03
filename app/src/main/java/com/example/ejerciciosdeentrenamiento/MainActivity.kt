package com.example.ejerciciosdeentrenamiento

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejerciciosdeentrenamiento.data.Ejercicios
import com.example.ejerciciosdeentrenamiento.model.Ejercicio
import com.example.ejerciciosdeentrenamiento.ui.theme.EjerciciosDeEntrenamientoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjerciciosDeEntrenamientoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    EjerciciosApp()
                }
            }
        }
    }
}

@Composable
fun EjerciciosApp() {
    ListaEjercicios(
        lista = Ejercicios().ejerciciosEntrenamiento(),
    )
}

@Composable
fun ListaEjercicios(lista: List<Ejercicio>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(lista) {ejercicio ->
            EjercicioCard(
                ejercicio = ejercicio,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun EjercicioCard(ejercicio:Ejercicio, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(ejercicio.imagenId),
                contentDescription = stringResource(ejercicio.stringId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(ejercicio.stringId),
                modifier = Modifier.padding(top = 16.dp, start= 16.dp, end=16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = LocalContext.current.getString(ejercicio.descripcion),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}

@Preview
@Composable
private fun EjercicioCardPreview() {
    EjercicioCard(Ejercicio(R.string.ejercicio1, R.drawable.flexiones, R.string.descripcion1))
}