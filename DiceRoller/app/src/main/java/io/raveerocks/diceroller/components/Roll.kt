package io.raveerocks.diceroller.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import io.raveerocks.diceroller.R
import java.util.Random

@Composable
fun Roll(onRoll: (Int) -> Unit) {
    fun rollDice() {
        val diceImageResource = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        onRoll(diceImageResource)
    }
    LabeledButton(onClick = { rollDice() }, label = stringResource(R.string.roll))
}

@Preview(showBackground = true)
@Composable
fun RollPreview() {
    Roll { }
}