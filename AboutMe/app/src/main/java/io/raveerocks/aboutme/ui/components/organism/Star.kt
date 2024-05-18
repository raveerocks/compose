package io.raveerocks.aboutme.ui.components.organism

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import io.raveerocks.aboutme.R
import io.raveerocks.aboutme.ui.theme.starModifier

@Composable
fun Star() {
    Image(
        painter = painterResource(id = R.drawable.baseline_star_24),
        contentDescription = stringResource(R.string.yellow_star),
        modifier = starModifier(Modifier)
    )
}


@Preview(showBackground = true)
@Composable
fun StarPreview() {
    Star()
}