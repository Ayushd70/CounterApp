package dev.ayushd70.counter.Counter

import android.graphics.drawable.Icon
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
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
        },
        
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription ="Add")
            }
        },
    ) {
    }
}

