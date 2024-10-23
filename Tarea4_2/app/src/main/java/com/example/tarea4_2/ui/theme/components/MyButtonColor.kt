package com.example.tarea4_2.ui.theme.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButtonColor(textP : String, color : Color){
    var background by remember { mutableStateOf(Color.DarkGray) }
    var colorText by remember { mutableStateOf(Color.White) }
    var text by remember { mutableStateOf("Botón sin pulsar") }
    var shape by remember { mutableStateOf(RoundedCornerShape(20.dp)) }
    var borde by remember { mutableStateOf(BorderStroke(1.dp,Color.Black)) }
    Button(onClick = {
        background = color
        colorText = Color.Black
        text = textP
        shape = RoundedCornerShape(4.dp)
        borde = BorderStroke(3.dp,Color.Black)
    },
        colors = ButtonDefaults.buttonColors(
            containerColor = background,
            contentColor = colorText),
        border = borde,
        shape = shape
    )
    {
        Text(text)
    }
}