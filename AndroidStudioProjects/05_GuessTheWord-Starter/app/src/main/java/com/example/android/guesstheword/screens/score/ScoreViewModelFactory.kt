package com.example.android.guesstheword.screens.score

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/*
*Note: In this app, it's not necessary to add a ViewModelFactory for the ScoreViewModel, because you can assign the
* score directly to the viewModel.score variable. But sometimes you need the data right when the viewModel is initialized.
* */

class ScoreViewModelFactory(private val finalScore: Int):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ScoreViewModel::class.java)) {
            return ScoreViewModel(finalScore) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}