package com.blankspace.farmingapp.viewmodel

import androidx.lifecycle.LiveData

interface AuthListener {

    fun onStarted()
    fun onSuccess(authRepo: LiveData<String>)
    fun onFailure(message: String)

}