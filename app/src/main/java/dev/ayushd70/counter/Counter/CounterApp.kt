package dev.ayushd70.counter.Counter

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun CounterApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Compose Counter App")
                }
            )
        }
    ) {
    }
}

