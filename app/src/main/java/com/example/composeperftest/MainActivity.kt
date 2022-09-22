package com.example.composeperftest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicText
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val numbers = (0..999).toList()
    setContent {
      LazyColumn(modifier = Modifier.fillMaxHeight().fillMaxWidth()) {
        items(numbers) { number ->
          BasicText(text = "Text $number", modifier = Modifier.fillMaxWidth())
        }
      }
    }
  }
}