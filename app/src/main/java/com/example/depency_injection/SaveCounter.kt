package com.example.dependecy_injection

import android.content.Context

class SaveCounter(context: Context) {
    private val pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    var counter: Int
        get() = pref.getInt(COUNTER, 0)
        set(value) {
            pref.edit().putInt(COUNTER, value).apply()
        }

    companion object {
        const val PREF_NAME = "data-counter"
        const val COUNTER = "counter"
    }
}
