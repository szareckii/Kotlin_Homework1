package com.geekbrains.homework1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var model = Model()

    private val dataLiveData = MutableLiveData<String>()

    fun buttonClicked() {
        val data = model.getData()
        dataLiveData.value = data
    }

    fun getDataLiveData(): LiveData<String> = dataLiveData

}