/*
 * Copyright (C) 2019 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.guesstheword.screens.score

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.android.guesstheword.R
import com.example.android.guesstheword.databinding.ScoreFragmentBinding

private const val TAG = "Score Fragment"
/**
 * Fragment where the final score is shown, after the game is over
 */
class ScoreFragment : Fragment() {

    // ViewModel - Part 1
    private lateinit var viewModel: ScoreViewModel
    private lateinit var viewModelFactory: ScoreViewModelFactory

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        // Inflate view and obtain an instance of the binding class.
        val binding: ScoreFragmentBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.score_fragment,
                container,
                false
        )
        //Initialise ViewModel Part 2
        viewModelFactory = ScoreViewModelFactory(ScoreFragmentArgs.fromBundle(requireArguments()).score)
        viewModel = ViewModelProvider(this, viewModelFactory)[ScoreViewModel::class.java]

        binding.scoreText.text = viewModel.score.toString()
//        Log.d (TAG, "Final Score of score2 is ${viewModel.score2}")

        return binding.root
    }
}

/*
*Note: In this app, it's not necessary to add a ViewModelFactory for the ScoreViewModel, because you can assign the
* score directly to the viewModel.score variable after you have initialisedn it.
*
*For example 
* viewModel.finalScore = ScoreFragmentArgs.fromBundle(requireArguments()).score
* //remove the constructor in the view model so its empty)
* class ScoreViewModel(): ViewModel()
*
* . But sometimes you need the data right when the viewModel is initialized
* and this is when you would use the factory method.
* */