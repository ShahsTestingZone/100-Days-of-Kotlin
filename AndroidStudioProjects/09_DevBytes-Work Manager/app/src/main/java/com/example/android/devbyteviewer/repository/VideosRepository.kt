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

package com.example.android.devbyteviewer.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.android.devbyteviewer.database.VideosDatabase
import com.example.android.devbyteviewer.database.asDomainModel
import com.example.android.devbyteviewer.domain.DevByteVideo
import com.example.android.devbyteviewer.network.DevByteNetwork
import com.example.android.devbyteviewer.network.asDatabaseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import timber.log.Timber

/**
 * Repository for fetching devbyte videos from the network and storing them on disk
 */
class VideosRepository(private val database: VideosDatabase) {
    //Initialize the videos object, using database.videoDao. Call the getVideos() DAO method. Because the getVideos()
    // method returns a list of database objects, not a list of DevByteVideo objects, Android Studio throws a "type mismatch" error.

    //take the database objects and convert them to normal dataclass objects to be used in the viewmodel and live data binding.
    // Network objects and database objects won't work.
    val videos: LiveData<List<DevByteVideo>> = Transformations.map(database.videoDao.getVideos()) {
        it.asDomainModel()
        //The Transformations.map method uses a conversion function to convert one LiveData object into another LiveData object.
        // The transformations are only calculated when an active activity or a fragment is observing the returned LiveData propert
    }


    /**
     * Refresh the videos stored in the offline cache.
     *
     * This function uses the IO dispatcher to ensure the database insert database operation
     * happens on the IO dispatcher. By switching to the IO dispatcher using `withContext` this
     * function is now safe to call from any thread including the Main thread.
     *
     */
    suspend fun refreshVideos() {
        withContext(Dispatchers.IO) {
            Timber.d("refresh videos is called");
            //download new objects using retrofit from network
            val playlist = DevByteNetwork.devbytes.getPlaylist()
            //convert network objects to database objects.
            database.videoDao.insertAll(playlist.asDatabaseModel())

        }
    }

}