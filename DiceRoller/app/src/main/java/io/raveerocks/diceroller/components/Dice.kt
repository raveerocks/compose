package io.raveerocks.diceroller.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.raveerocks.diceroller.R

@Composable
fun Dice(diceImageResource: Int) {
    ImagePainter(imageResource = diceImageResource)
}

@Preview(showBackground = true)
@Composable
fun DicePreview() {
    Dice(R.drawable.dice_1)
}
