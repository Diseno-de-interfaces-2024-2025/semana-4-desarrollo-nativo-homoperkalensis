package com.example.tarea4.ui.theme.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit

@Composable
fun MyText(texto : String, TextUnit : TextUnit, Color : Color, modifier : Modifier = Modifier ){
    Text(texto, color = Color, fontSize = TextUnit, modifier = modifier)
}

