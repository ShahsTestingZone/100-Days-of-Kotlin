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

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.android.trackmysleepquality.R
import com.example.android.trackmysleepquality.database.SleepDatabase
import com.example.android.trackmysleepquality.databinding.FragmentSleepTrackerBinding
import com.google.android.material.snackbar.Snackbar

private const val TAG = "SleepTrackerFragment"
/**
 * A fragment with buttons to record start and end times for sleep, which are saved in
 * a database. Cumulative data is displayed in a simple scrollable TextView.
 * (Because we have not learned about RecyclerView yet.)
 */
class SleepTrackerFragment : Fragment() {

    /**
     * Called when the Fragment is ready to display content to the screen.
     *
     * This function uses DataBindingUtil to inflate R.layout.fragment_sleep_tracker.
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Get a reference to the binding object and inflate the fragment views.
        val binding: FragmentSleepTrackerBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_sleep_tracker, container, false)

        /** Create an instance of the ViewModel Factory.*/
        //You need a reference to the app that this fragment is attached to, to pass into the view-model factory provider.
        val application = requireNotNull(this.activity).application
        //The requireNotNull Kotlin function throws an IllegalArgumentException if the value is null.

        // Reference your data source via a reference to the DAO.
        val dataSource = SleepDatabase.getInstance(application).sleepDatabaseDao
        // the above returns a SleepDatabaseDoa - you could rename the variable to sleepDao

        val viewModelFactory = SleepTrackerViewModelFactory(dataSource, application)

        /** Get a reference to the ViewModel associated with this fragment.*/
        val sleepTrackerViewModel = ViewModelProvider(this, viewModelFactory)[SleepTrackerViewModel::class.java]

        /** Data Binding*/
        // Set the current activity as the lifecycle owner of the binding
        binding.lifecycleOwner = this
        // Assign the sleepTrackerViewModel binding variable to the sleepTrackerViewModel
        binding.sleepTrackerViewModel = sleepTrackerViewModel


        sleepTrackerViewModel.navigateToSleepQuality.observe(this, Observer {night ->
            night?.let {
                this.findNavController().navigate(
                    SleepTrackerFragmentDirections
                        .actionSleepTrackerFragmentToSleepQualityFragment(night.nightId))
                sleepTrackerViewModel.doneNavigating()
            }
            //let is often used for executing a code block only with non-null values.
            // https://kotlinlang.org/docs/scope-functions.html#let
        })

        sleepTrackerViewModel.showSnackBarEvent.observe(this, Observer {
            if (it == true) { // Observed state is true.
                Snackbar.make(
                    requireActivity().findViewById(android.R.id.content),
                    getString(R.string.cleared_message),
                    Snackbar.LENGTH_SHORT // How long to display the message.
                ).show()
                sleepTrackerViewModel.doneShowingSnackbar()
            }
        })



        return binding.root
    }
}
