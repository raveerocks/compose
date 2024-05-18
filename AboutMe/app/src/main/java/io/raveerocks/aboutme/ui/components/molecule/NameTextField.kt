package io.raveerocks.aboutme.ui.components.molecule

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import io.raveerocks.aboutme.R
import io.raveerocks.aboutme.ui.components.atom.SingleLineTextField

@Composable
fun NameTextField(name: String, onNameChange: (String) -> Unit) {
    SingleLineTextField(
        value = name,
        onValueChange = onNameChange,
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        placeholder = stringResource(R.string.what_is_your_name)
    )
}

@Preview(showBackground = true)
@Composable
fun NameTextFieldButtonPreview() {
    NameTextField("Name", {})
}