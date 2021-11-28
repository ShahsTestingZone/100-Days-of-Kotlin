package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/*
* The ViewModel is destroyed when the associated fragment is detached, or when the activity is finished.
* Right before the ViewModel is destroyed, the onCleared() callback is called to clean up the resources.
* */

private const val TAG = "GameViewModel"

class GameViewModel : ViewModel() {

    // The current word
//    var word = ""
    // The current score
//    var score = 0

    /** setting up the Live Data part 1 */
    // The current word before encapsulation - part 1
//    val word = MutableLiveData<String>()

    /** After encapsulation */
    /*
   * A backing property allows you to return something from a getter other
   * than the exact object. In this task, you implement a backing property for the score
   * and word objects in the GuessTheWord app.
   */
    private val _word = MutableLiveData<String>()
    val word: LiveData<String>
    get()=_word

    // The current score
//    val score = MutableLiveData<Int>()

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
    get() = _score

    // Event which triggers the end of the game
    private val _eventGameFinish = MutableLiveData<Boolean>()
    val eventGameFinish: LiveData<Boolean>
        get() = _eventGameFinish


    // The list of words - the front of the list is the next word to guess
    private lateinit var wordList: MutableList<String>

    /**
     * Resets the list of words and randomizes the order
     */
    private fun resetList() {
        wordList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
        wordList.shuffle()
    }

    init {
        // setting up the live data part 1
        // initiate values to default values
        _word.value = ""
        _score.value = 0
        // update all word variables to now use the value attribute = word.value
        //think of word as an object and value as one of its variables with stored information.

        resetList()
        nextWord()
        Log.d(TAG, "GameViewModel created!")
    }

    /**
     * Moves to the next word in the list
     */
    private fun nextWord() {
        if (wordList.isNotEmpty()) {
            //Select and remove a word from the list
            _word.value = wordList.removeAt(0)
        }else {
            //No more words is the list
            onGameFinish()
        }

    }

    /** Methods for buttons presses **/

    fun onSkip() {
//        score--
        _score.value = (score.value)?.minus(1)
        //store.value can be null as it is a mutable live object.

        nextWord()
    }

    fun onCorrect() {
//        score++
        _score.value = (score.value)?.plus(1)
        nextWord()
    }
    /** Method for the game completed event **/
    fun onGameFinish() {
        _eventGameFinish.value = true
    }

    fun onGameFinishComplete() {
        _eventGameFinish.value = false
    }

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG, "GameViewModel destroyed!")
    }


}