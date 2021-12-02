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

package com.example.android.trackmysleepquality.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SleepDatabaseDao {
    @Insert
    fun insert(night: SleepNight)

    @Update
    fun update(night: SleepNight)

    @Query ("SELECT * from daily_sleep_quality_table WHERE nightId = :key")
    fun get(key: Long): SleepNight?
    //Notice the :key. You use the colon notation in the query to reference arguments in the function.

    @Query("DELETE FROM daily_sleep_quality_table")
    fun clear()

    @Delete
    fun delete(night: SleepNight)
    /*The @Delete annotation deletes one item, and you could use @Delete and supply a list of nights to delete. The drawback
    is that you need to fetch or know what's in the table. The @Delete annotation is great for deleting specific entries, but
    not efficient for clearing all entries from a table.
    */

    @Query("SELECT * FROM daily_sleep_quality_table ORDER BY nightId DESC LIMIT 1")
    fun getTonight(): SleepNight?
    /* Make the SleepNight returned by getTonight() nullable, so that the function can handle the case where the table is empty.
    (The table is empty at the beginning, and after the data is cleared.)
    */

    @Query("SELECT * FROM daily_sleep_quality_table ORDER BY nightId DESC")
    fun getAllNights(): LiveData<List<SleepNight>>
    /*Have getAllNights() return a list of SleepNight entities as LiveData. Room keeps this LiveData updated for you,
    which means you only need to explicitly get the data once.
    */


}
