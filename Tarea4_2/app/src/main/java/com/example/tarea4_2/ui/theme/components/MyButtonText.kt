package com.example.tarea4_2.ui.theme.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun MybuttonText(){
    var cambiarBoton by remember { mutableStateOf("Pulsa aqui") }
    Button(onClick = {cambiarBoton = "Botón pulsado"}) {
        Text(cambiarBoton)
    }
}
