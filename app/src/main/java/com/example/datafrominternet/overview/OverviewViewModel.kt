package com.example.datafrominternet.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.datafrominternet.internet.Api
import kotlinx.coroutines.launch

class OverviewViewModel: ViewModel() {
    private var _numberOfCountry = MutableLiveData<String>()
            val numberOfCountry: LiveData<String> = _numberOfCountry

    init {
        getNumberOfCountry()
    }

    private fun getNumberOfCountry() {
        viewModelScope.launch {
//            try {
                var result = Api.retrofitService.getCountry()
                _numberOfCountry.value = result.toString()
//            }catch (e: Exception) {
                //_numberOfCountry.value = "Failure: ${e.message}"
//            }

        }
    }
}