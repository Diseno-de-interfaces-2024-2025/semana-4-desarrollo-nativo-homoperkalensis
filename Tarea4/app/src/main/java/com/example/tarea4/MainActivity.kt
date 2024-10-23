package com.example.tarea4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.tarea4.ui.theme.Tarea4Theme
import com.example.tarea4.ui.theme.components.MyText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarea4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyText("Hola buenas", 80.sp, Color.Red, modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
