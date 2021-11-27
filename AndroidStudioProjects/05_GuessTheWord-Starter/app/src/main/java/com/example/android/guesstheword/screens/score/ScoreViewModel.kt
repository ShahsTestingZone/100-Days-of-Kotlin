package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.android.guesstheword.screens.game.GameFragmentDirections

private const val TAG = "ScoreViewModel"

class ScoreViewModel(finalScore:Int): ViewModel() {

    var score = finalScore

    init{
        Log.d(TAG, " Final Score is $finalScore")
    }
}