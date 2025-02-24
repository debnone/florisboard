/*
 * Copyright (C) 2020 Patrick Goldinger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.patrickgold.florisboard.ime.media.emoticon

import android.content.Context

typealias EmoticonLayoutDataArrangement = List<List<EmoticonKeyData>>
data class EmoticonLayoutData(
    var type: String,
    var name: String,
    var direction: String,
    var arrangement: EmoticonLayoutDataArrangement = listOf()
) {
    companion object {
        fun fromJsonFile(context: Context, path: String): EmoticonLayoutData? {
            /*val rawJsonData: String = try {
                context.assets.open(path).bufferedReader().use { it.readText() }
            } catch (e: Exception) {
                null
            } ?: return null
            val moshi = Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build()
            val layoutAdapter = moshi.adapter(EmoticonLayoutData::class.java)
            return layoutAdapter.fromJson(rawJsonData)*/
            return null
        }
    }
}
