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
 *
 */

package com.example.android.marsrealestate.network

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class MarsProperty(
    val id: String,
    @Json(name = "img_src") val imgSrcUrl: String,
    val type: String,
    val price: Double
)


/*
* Sometimes the key names in a JSON response can make confusing Kotlin properties, or may not match your coding style—for example, in the JSON file the img_src key uses an underscore,
* whereas Kotlin properties commonly use upper and lowercase letters ("camel case").
*
* To use variable names in your data class that differ from the key names in the JSON response, use the @Json annotation.
* In this example, the name of the variable in the data class is imgSrcUrl.
* The variable is mapped to the JSON attribute img_src using @Json(name = "img_src").
 */


