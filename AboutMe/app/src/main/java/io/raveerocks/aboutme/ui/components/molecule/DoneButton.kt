package io.raveerocks.aboutme.ui.components.molecule

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import io.raveerocks.aboutme.R
import io.raveerocks.aboutme.ui.components.atom.LabeledButton

@Composable
fun DoneButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    LabeledButton(
        onClick,
        modifier = modifier.fillMaxWidth(),
        label = stringResource(R.string.done)
    )
}

@Preview(showBackground = true)
@Composable
fun DoneButtonPreview() {
    DoneButton({})
}