package com.mod72.simplenavigation

import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ToScreen2Button(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Screen 2")
    }
}

@Composable
fun ToScreen3Button(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Screen 3")
    }
}

@Composable
fun ToHomeButton(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Home")
    }
}