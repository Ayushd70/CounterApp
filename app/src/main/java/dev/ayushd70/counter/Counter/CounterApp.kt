package dev.ayushd70.counter.Counter

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CounterApp() {
  Scaffold(
      topBar = { TopAppBar(title = { Text(text = "Compose Counter App") }) },
      floatingActionButton = {
        FloatingActionButton(onClick = { /*TODO*/}) {
          Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
        }
      },
      content = {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize(),
        ) {
          Text(text = "You have pressed the button this many times")
          Text(text = "4", style = MaterialTheme.typography.h4)
        }
      })
}
