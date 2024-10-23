package com.example.ejercicio4.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MyApp(){
    var nombre by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var direccion by remember { mutableStateOf("") }
    var pais by remember { mutableStateOf("") }
    var nombre2 by remember { mutableStateOf("") }
    var email2 by remember { mutableStateOf("") }
    var direccion2 by remember { mutableStateOf("") }
    var pais2 by remember { mutableStateOf("") }
Column() {
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .background(Color.Green)
            .fillMaxSize()
            .weight(1f),

        //.height(80.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(15.dp))
        for (i in 1..10) {
            Box(modifier = Modifier.clip(RoundedCornerShape(30.dp)).background(Color.Blue).size(60.dp))
            Spacer(modifier = Modifier.width(10.dp))
        }
    }
    Box(
        modifier = Modifier
            .weight(3f)
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .padding(15.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.Cyan)
                    .weight(1f)
                    .fillMaxSize()
            )
            Box(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .weight(1f)
                    .padding(15.dp)
            ) {
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec hendrerit turpis at metus laoreet lacinia. Sed porttitor enim dapibus gravida congue. Vivamus sodales condimentum euismod. Nam eleifend ultrices nisi, ac viverra tortor rutrum non. Phasellus et congue odio. Nullam ac arcu et velit dictum convallis. Praesent pellentesque tellus vel velit laoreet sollicitudin. Aenean dignissim elit augue, nec malesuada ipsum dignissim nec. Donec sit amet sagittis nulla.\n" +
                            "\n" +
                            "Donec tempus elit sit amet diam cursus, vel faucibus justo porttitor. Sed consectetur urna iaculis est egestas, non rutrum urna euismod. Curabitur eu ex vel purus rhoncus imperdiet. Curabitur mattis metus sit amet sapien finibus faucibus. Nam leo mauris, tempus non faucibus eget, cursus at massa. Nam fringilla finibus turpis a vulputate. Donec vitae mi ut leo iaculis sagittis vel a sem. Vivamus eget velit elementum, dignissim nunc vitae, pellentesque massa. Mauris ornare, dui sed congue condimentum, velit orci dictum enim, vel rutrum nibh turpis volutpat justo. In condimentum libero ut dolor feugiat, at tempus velit auctor. Suspendisse potenti. Donec lobortis dolor tortor, vel egestas sem volutpat id. Nulla tristique dignissim sem at ultricies.\n" +
                            "\n" +
                            "Fusce vitae ipsum nisi. Curabitur ac maximus lacus. Sed sit amet porta mi. Donec id purus at sapien congue mollis. Vestibulum eget mi suscipit, pellentesque metus sit amet, blandit risus. Etiam interdum sem non turpis rutrum, nec convallis eros bibendum. Phasellus nec nisi sodales, tempus massa sed, consectetur mi. Maecenas non pretium mauris. Mauris sollicitudin enim ante, id facilisis leo tristique eu. Proin tincidunt ultricies ullamcorper."

                )
            }

        }
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .weight(1f),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Formulario",
            fontSize = 40.sp)
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .weight(4f)
    ){
        Row(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.weight(1f)) {
                TextField(
                    value = nombre,
                    onValueChange = { nombre = it },
                    label = { Text("Nombre") },
                    modifier = Modifier
                        .weight(1f)
                        .padding(bottom =10.dp)
                )
                TextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") },
                    modifier = Modifier
                        .weight(1f)
                        .padding(bottom = 10.dp)
                )
                TextField(
                    value = direccion,
                    onValueChange = { direccion = it },
                    label = { Text("Dirección") },
                    modifier = Modifier
                        .weight(1f)
                        .padding(bottom = 10.dp)
                )
                TextField(
                    value = pais,
                    onValueChange = { pais = it },
                    label = { Text("País") },
                    modifier = Modifier
                        .weight(1f)
                        .padding(bottom = 10.dp)
                )
            }
            Column(modifier = Modifier.weight(1f)){
                Box(modifier = Modifier.weight(1f).fillMaxSize(), contentAlignment = Alignment.Center){Text(text = nombre2)}
                Box(modifier = Modifier.weight(1f).fillMaxSize(), contentAlignment = Alignment.Center){Text(text = email2)}
                Box(modifier = Modifier.weight(1f).fillMaxSize(), contentAlignment = Alignment.Center){Text(text = direccion2)}
                Box(modifier = Modifier.weight(1f).fillMaxSize(), contentAlignment = Alignment.Center){Text(text = pais2)}
            }
        }
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .weight(1f),
        contentAlignment = Alignment.Center
    ){
        Button(onClick = {
            nombre2 = nombre
            email2 = email
            direccion2 = direccion
            pais2 = pais
        }) {
            Text(text = "Actualizar")
        }
    }
}
}