package io.raveerocks.diceroller.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.raveerocks.diceroller.R

@Composable
fun Game(initialDie: Int, modifier: Modifier = Modifier) {
    var diceImageResource by remember { mutableStateOf((initialDie)) }
    CenterColumnLayout(modifier) {
        Dice(diceImageResource)
        Roll { diceImageResource = it }
    }
}

@Preview(showBackground = true)
@Composable
fun GamePreview() {
    Game(R.drawable.dice_1)
}