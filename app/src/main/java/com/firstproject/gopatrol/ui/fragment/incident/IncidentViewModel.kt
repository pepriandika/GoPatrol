package com.firstproject.gopatrol.ui.incident

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class IncidentViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is incident Fragment"
    }
    val text: LiveData<String> = _text
}