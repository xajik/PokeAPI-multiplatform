package com.pokeapi.vm


import com.pokeapi.network.Main
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancelChildren

//Cannot import ViewModel
//actual open class BaseViewModel actual constructor(): ViewModel() {
//    actual val clientScope: CoroutineScope = viewModelScope
//    actual override fun onCleared() {
//        super.onCleared()
//    }
//}

actual open class BaseViewModel actual constructor() {

    private val viewModelJob = SupervisorJob()

    val viewModelScope: CoroutineScope = CoroutineScope(Main + viewModelJob)

    actual val clientScope: CoroutineScope = viewModelScope

    protected actual open fun onCleared() {
        viewModelJob.cancelChildren()
    }

}