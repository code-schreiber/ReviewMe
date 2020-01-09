package com.tokopedia.sample.utils

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
/**
 * Author errysuprayogi on 10,January,2020
 */

//@SuppressLint("StaticFieldLeak")
class UserPrefs private constructor(private val context: Context) {
    private val settings: SharedPreferences
    fun saveString(key: String?, value: String?) {
        settings.edit().putString(key, value).commit()
    }

    fun getString(key: String?, defaultValue: String?): String? {
        return settings.getString(key, defaultValue)
    }

    companion object {
        private var instance: UserPrefs? = null
        fun getInstance(context: Context): UserPrefs? {
            if (instance == null) {
                instance =
                    UserPrefs(context)
            }
            return instance
        }
    }

    init {
        settings = context.getSharedPreferences("MyPref", 0)
    }
}