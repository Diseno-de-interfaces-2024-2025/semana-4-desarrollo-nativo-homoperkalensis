package com.example.ejercicio3.ui.theme.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Registro() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val USERNAME = "admin"
    val PASSWORD = "12345"
    var click by remember { mutableStateOf(false)}

    TextField(
        value = username,
        onValueChange = { username = it },
        label = { Text("Usuario") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp)
    )

    TextField(
        value = password,
        onValueChange = { password = it },
        label = { Text("Contraseña") },
        visualTransformation = PasswordVisualTransformation(),
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp)
    )
    if(click) {
        if (username == USERNAME && password == PASSWORD) {
            Text(
                text = "Usuario correcto",
                color = Color.Green
            )
        } else {
            Text(
                text = "Usuario incorrecto",
                color = Color.Red
            )
        }
    }
    Button(
        onClick = {
            click = true
        },
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF7C4DFF)),
        modifier = Modifier
            .padding(8.dp)
            .defaultMinSize(minWidth = 150.dp)
    ) {
        Text(
            text = "Acceder",
            fontSize = 16.sp,
            color = Color.White
        )
    }
}
