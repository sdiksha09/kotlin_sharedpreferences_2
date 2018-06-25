package com.example.shipra.sharedpreferences_kotlin_example

import android.content.Context

class myPreferences(context: Context){

    val PREFERENCE_NAME="sharedPreferencesExample"
    val PREFERENCE_LOGIN_COUNT="LOGIN_COUNT"

    val preference= context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE)

    fun getLoginCount(): Int {
        return preference.getInt(PREFERENCE_LOGIN_COUNT, 0)
    }


    fun setLoginCount(count:Int){

        val editor=preference.edit()
        editor.putInt(PREFERENCE_LOGIN_COUNT,count)
        editor.apply()
    }
}