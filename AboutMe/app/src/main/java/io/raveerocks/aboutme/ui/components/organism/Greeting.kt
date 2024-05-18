package io.raveerocks.aboutme.ui.components.organism

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import io.raveerocks.aboutme.ui.theme.nameStyle
import io.raveerocks.aboutme.ui.theme.textModifier

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        style = nameStyle(),
        textAlign = TextAlign.Center,
        modifier = textModifier(modifier)
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting("Name")
}