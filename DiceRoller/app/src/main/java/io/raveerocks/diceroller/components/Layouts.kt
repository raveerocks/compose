package io.raveerocks.diceroller.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DefaultAppLayout(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
        content = content
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultAppLayoutPreview() {
    DefaultAppLayout {
        Text(text = "Preview")
    }
}

@Composable
fun CenterColumnLayout(modifier: Modifier = Modifier, content: @Composable ColumnScope.() -> Unit) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxWidth(),
        content = content
    )
}

@Preview(showBackground = true)
@Composable
fun CenterColumnLayoutPreview() {
    CenterColumnLayout {
        Text(text = "Preview")
    }
}
