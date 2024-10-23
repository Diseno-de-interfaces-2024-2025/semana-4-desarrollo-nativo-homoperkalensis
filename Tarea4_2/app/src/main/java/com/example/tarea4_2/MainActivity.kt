package com.example.tarea4_2

import  androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.tarea4_2.ui.theme.Tarea4_2Theme
import com.example.tarea4_2.ui.theme.components.MybuttonText
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.padding
import com.example.tarea4_2.ui.theme.components.MyButtonColor


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarea4_2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        MybuttonText()
                        MyButtonColor("Pulsao", Color.Green)
                    }
                }
            }
        }
    }
}