package io.raveerocks.aboutme.ui.components.organism

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import io.raveerocks.aboutme.ui.theme.nameStyle

@Composable
fun Bio(bio: String) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Text(
            text = bio,
            style = nameStyle() + TextStyle(lineHeight = 30.sp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BioPreview() {
    Bio("Bio")
}