package io.raveerocks.diceroller.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.raveerocks.diceroller.R
import io.raveerocks.diceroller.ui.theme.DiceRollerTheme

@Composable
fun App() {
    DiceRollerTheme {
        DefaultAppLayout {
            Game(R.drawable.empty_dice)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AppPreview() {
    DiceRollerTheme {
        DefaultAppLayout(modifier = Modifier) {
            Game(R.drawable.dice_1)
        }
    }
}
