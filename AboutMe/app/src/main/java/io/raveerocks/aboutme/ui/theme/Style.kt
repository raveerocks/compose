package io.raveerocks.aboutme.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import io.raveerocks.aboutme.R

@Composable
fun nameStyle(): TextStyle {
    return TextStyle(
        fontSize = dimensionResource(R.dimen.text_size).value.sp,
        color = Color.Black,
        fontFamily = FontFamily(Font(R.font.roboto, FontWeight.Normal)),
    )
}

@Composable
fun textModifier(modifier: Modifier): Modifier {
    return modifier
        .fillMaxWidth()
        .padding(top = dimensionResource(R.dimen.small_padding))
        .padding(top = dimensionResource(R.dimen.layout_margin))
}

@Composable
fun starModifier(modifier: Modifier): Modifier {
    return modifier
        .fillMaxWidth()
        .padding(top = dimensionResource(R.dimen.layout_margin))
}
