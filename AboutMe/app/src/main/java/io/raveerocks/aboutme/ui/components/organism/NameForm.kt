package io.raveerocks.aboutme.ui.components.organism

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import io.raveerocks.aboutme.R
import io.raveerocks.aboutme.ui.components.molecule.DoneButton
import io.raveerocks.aboutme.ui.components.molecule.NameTextField


@Composable
fun NameForm(onSubmit: (String) -> Unit) {
    var name by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = dimensionResource(R.dimen.small_padding))
            .padding(top = dimensionResource(R.dimen.layout_margin))
    ) {
        NameTextField(name, onNameChange = { name = it })
        DoneButton({ onSubmit(name) })
    }
}

@Preview(showBackground = true)
@Composable
fun NameTextFieldButtonPreview() {
    NameForm({})
}