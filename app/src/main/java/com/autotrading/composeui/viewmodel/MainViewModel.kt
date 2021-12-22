package com.autotrading.composeui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.autotrading.composeui.interfaces.ApiService
import com.autotrading.composeui.model.Schools
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    var schoolListResponse:List<Schools.SchoolsItem> by mutableStateOf(listOf())
    var errorMessage: String by mutableStateOf("")
    fun getSchoolList() {
        viewModelScope.launch {
            val apiService = ApiService.getInstance()
            try {
                val schoolList = apiService.getAllSchools()
                schoolListResponse=schoolList
            }
            catch (e: Exception) {
                errorMessage = e.message.toString()
            }
        }
    }
}