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

package com.example.android.guesstheword.screens.game

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.example.android.guesstheword.R
import com.example.android.guesstheword.databinding.GameFragmentBinding

/*Why use viewLifecycleOwner?
Fragment views get destroyed when a user navigates away from a fragment, even though the fragment itself is not destroyed.
This essentially creates two lifecycles, the lifecycle of the fragment, and the lifecycle of the fragment's view.
Referring to the fragment's lifecycle instead of the fragment view's lifecycle can cause subtle bugs when updating the fragment's view.
Therefore, when setting up observers that affect the fragment's view you should:
1. Set up the observers in onCreateView()
2. Pass in viewLifecycleOwner to observers
*/

private const val TAG = "GameFragment"

/**
 * Fragment where the game is played
 */
class GameFragment : Fragment() {

    private lateinit var binding: GameFragmentBinding

    // Initialise the ViewModel - Part 1
    private lateinit var viewModel: GameViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.game_fragment,
            container,
            false
        )

        // Initialise the ViewModel - Part 2
        Log.d(TAG, "Called ViewModelProvider.get")
        viewModel = ViewModelProvider(this)[GameViewModel::class.java]

        // Set the viewmodel for databinding - this allows the bound layout access
        // to all the data in the ViewModel
        binding.gameViewModel = viewModel

// Specify the fragment view as the lifecycle owner of the binding.
// This is used so that the binding can observe LiveData updates
        binding.lifecycleOwner = viewLifecycleOwner


        // Setting up the live data part 3
        //add Observer (view(of)Lifecycle) Object to the LiveData object
        /** Setting up LiveData observation relationship **/
        // removed as we are using LiveData to bind, see line 78 and xml file.
//        viewModel.score.observe(viewLifecycleOwner, { newScore ->
//            binding.scoreText.text = newScore.toString()
//        })

        // removed as we are using LiveData to bind, see line 78 and xml file.
//        viewModel.word.observe(viewLifecycleOwner, { newWord ->
//            binding.wordText.text = newWord
//        })
        // Observer for the Game finished event
        viewModel.eventGameFinish.observe(viewLifecycleOwner, { hasFinished ->
            if (hasFinished) gameFinished()
        })
        /*
        * Usually, LiveData delivers updates to the observers only when data changes.
        * An exception to this behavior is that observers also receive updates when the observer changes from an inactive to an active state.
        * This is why the game-finished toast is triggered repeatedly in your app. When the game fragment is re-created after a screen rotation,
        * it moves from an inactive to an active state.
        * The observer in the fragment is re-connected to the existing ViewModel and receives the current data.
        * The gameFinished() method is re-triggered via the next steps in the init block, and the toast displays.
        * Therefore you have to the eventGameFinish variable to false so it doesn't keep triggering.
        *
        * */

        /** Used Data Binding within the XML layout to bind with ViewModel - so below listeners are not required*/
//        binding.correctButton.setOnClickListener { onCorrect() }
//        binding.skipButton.setOnClickListener { onSkip() }
//        binding.endGameButton.setOnClickListener { onEndGame() }

//        updateScoreText()
//        updateWordText()
        return binding.root
    }
    /** Methods for updating the UI **/
    //Below code is now longer required since we updated the code to use live data and observe and act on
    // any changes and update the view.

//    private fun updateWordText() {
//        binding.wordText.text = viewModel.word.value
//    }

//    private fun updateScoreText() {
//        binding.scoreText.text = viewModel.score.value.toString()
//    }

    /** Used Data Binding within the XML layout to bind with ViewModel - so below functions are not required*/
    /** Methods for buttons presses **/
/*
    private fun onSkip() {
        viewModel.onSkip()
//        updateWordText() // not needed as we are using live data observes.
//        updateScoreText()
    }

    private fun onCorrect() {
        viewModel.onCorrect()
//        updateScoreText()
//        updateWordText()

    }

    private fun onEndGame() {
        gameFinished()
    }
*/
    /**
     * Called when the game is finished
     */
    private fun gameFinished() {
        Toast.makeText(activity, "Game has just finished", Toast.LENGTH_SHORT).show()
        val action = GameFragmentDirections.actionGameToScore()
        action.score = viewModel.score.value ?: 0
        NavHostFragment.findNavController(this).navigate(action)
        viewModel.onGameFinishComplete()

    }
}
