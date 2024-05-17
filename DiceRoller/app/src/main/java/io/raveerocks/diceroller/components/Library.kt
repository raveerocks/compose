package io.raveerocks.diceroller.components

import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import io.raveerocks.diceroller.R

@Composable
fun LabeledButton(modifier: Modifier = Modifier, label: String = "Button", onClick: () -> Unit) {
    Button(onClick = onClick, modifier = modifier) {
        Text(
            label, fontFamily = FontFamily(
                Font(R.font.bebas_neue)
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LabeledButtonPreview() {
    LabeledButton(onClick = {})
}

@Composable
fun ImagePainter(
    modifier: Modifier = Modifier,
    imageResource: Int,
    contentDescription: String = ""
) {
    Image(
        painter = painterResource(imageResource),
        contentDescription = contentDescription,
        modifier
    )
}

@Preview(showBackground = true)
@Composable
fun ImagePainterPreview() {
    ImagePainter(imageResource = R.drawable.dice_1)
}

