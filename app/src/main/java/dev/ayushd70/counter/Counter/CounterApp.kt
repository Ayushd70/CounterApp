package dev.ayushd70.counter.Counter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CounterApp() {

  val counter = remember { mutableStateOf(0) }

  Scaffold(
      topBar = { TopAppBar(title = { Text(text = "Compose Counter App") }) },
      floatingActionButton = {
        FloatingActionButton(onClick = { counter.value++ }) {
          Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
        }
      },
      content = {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp).fillMaxSize(),
        ) {
          Text(text = "You have pressed the button this many times", textAlign = TextAlign.Center)
          Text(
              text = "${counter.value}",
              textAlign = TextAlign.Center,
              style = MaterialTheme.typography.h4)
        }
      })
}
