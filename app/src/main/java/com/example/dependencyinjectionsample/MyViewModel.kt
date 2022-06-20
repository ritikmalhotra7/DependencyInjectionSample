package com.example.dependencyinjectionsample

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionsample.domain.repository.MyRepository
import dagger.Binds
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named


@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository : MyRepository
):ViewModel() {
    var vm = "hello"
}