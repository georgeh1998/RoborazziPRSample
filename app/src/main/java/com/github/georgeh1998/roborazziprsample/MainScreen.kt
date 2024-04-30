package com.github.georgeh1998.roborazziprsample

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        repeat(19) {
            Text(text = "Text $it")
        }
    }
}