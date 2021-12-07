/*
 * Copyright 2019, The Android Open Source Project
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

package com.example.android.trackmysleepquality.sleeptracker

import android.app.Application
import android.provider.SyncStateContract.Helpers.update
import android.util.Log
import androidx.lifecycle.*
import com.example.android.trackmysleepquality.database.SleepDatabaseDao
import com.example.android.trackmysleepquality.database.SleepNight
import com.example.android.trackmysleepquality.formatNights
import kotlinx.coroutines.launch

/**
 * ViewModel for SleepTrackerFragment.
 */

private const val TAG = "SleepTrackerViewModel"
class SleepTrackerViewModel(
    val database: SleepDatabaseDao,
    application: Application
) : AndroidViewModel(application) {

    private var tonight = MutableLiveData<SleepNight?>()

    private val nights = database.getAllNights()

    private val _navigateToSleepQuality = MutableLiveData<SleepNight?>()
    val navigateToSleepQuality: LiveData<SleepNight?>
        get() = _navigateToSleepQuality

    private var _showSnackbarEvent = MutableLiveData<Boolean>()
    val showSnackBarEvent: LiveData<Boolean>
        get() = _showSnackbarEvent

    val nightsString = Transformations.map(nights) { nights ->
        formatNights(nights, application.resources)
    }

    // see comment for enable feature at end of file
    val startButtonVisible = Transformations.map(tonight) {
        it == null
        //The Start button should be enabled when tonight is null.
        // since this function is connected to 'android:enabled=' in xml it will control the widget

    }
    val stopButtonVisible = Transformations.map(tonight) {
        it != null
//        The Stop button should be enabled when tonight is not null.

    }
    var clearButtonVisible = Transformations.map(nights) {
        it?.isNotEmpty()
        //The Clear button should only be enabled if nights, and thus the database, contains sleep nights.

    }

    init {
        initializeTonight()
    }

    private fun initializeTonight() {
        viewModelScope.launch {
            tonight.value = getTonightFromDatabase()
        }
    }

    private suspend fun getTonightFromDatabase(): SleepNight? {
        var night = database.getTonight()
        if (night?.endTimeMilli != night?.startTimeMilli) {
            night = null
        }
        return night
    }

    fun onStartTracking() {
        viewModelScope.launch {
            val newNight = SleepNight()
            insert(newNight)
            tonight.value = getTonightFromDatabase()
        }
    }

    private suspend fun insert(night: SleepNight) {
        database.insert(night)
    }

    fun onStopTracking() {
        viewModelScope.launch {
            val oldNight = tonight.value ?: return@launch
            oldNight.endTimeMilli = System.currentTimeMillis()
            update(oldNight)
            _navigateToSleepQuality.value = oldNight
        }
        //In Kotlin, the return@label syntax specifies the function from which this statement returns, among several nested functions.
        //https://kotlinlang.org/docs/returns.html#return-to-labels


    }

    private suspend fun update(night: SleepNight) {
        database.update(night)
    }

    fun onClear() {
        viewModelScope.launch {
            clear()
            tonight.value = null
            _showSnackbarEvent.value = true
        }
    }

    private suspend fun clear() {
        database.clear()
    }
    fun doneNavigating() {
        _navigateToSleepQuality.value = null
    }

    fun doneShowingSnackbar() {
        _showSnackbarEvent.value = false
    }


}

//Tip: Setting the appearance of a disabled View
//The enabled attribute is not the same as the visibility attribute. The enabled attribute only determines whether the
// View is enabled, not whether the View is visible.
//The meaning of "enabled" varies by the subclass. A user can edit the text in an enabled EditText,
// but not in a disabled EditText. A user can tap an enabled Button, but can't tap a disabled one.

//The android:enabled property is a boolean value that indicates whether or not the button is enabled.
// (An enabled button can be tapped; a disabled button can't.) Give the property the value of a state
// variable that you'll define in a moment.

