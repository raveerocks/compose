package io.raveerocks.aboutme.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import io.raveerocks.aboutme.R
import io.raveerocks.aboutme.ui.components.organism.Bio
import io.raveerocks.aboutme.ui.components.organism.Greeting
import io.raveerocks.aboutme.ui.components.organism.NameForm
import io.raveerocks.aboutme.ui.components.organism.Star

@Composable
fun App() {

    var isFormSubmitted by remember { mutableStateOf(false) }
    var result by remember { mutableStateOf("") }

    fun submit(name: String) {
        result = name
        isFormSubmitted = true
    }

    Column(
        modifier = Modifier.padding(
            start = dimensionResource(R.dimen.padding), end = dimensionResource(R.dimen.padding)
        )
    ) {
        if (!isFormSubmitted) NameForm(onSubmit = { submit(it) }) else Greeting(result)
        Star()
        Bio(stringResource(R.string.bio))
    }
}
