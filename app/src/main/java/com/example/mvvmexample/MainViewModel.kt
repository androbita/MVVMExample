package com.example.mvvmexample

import android.os.Handler
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

/**
 * created by : Prana Yanuar Dana
 * email : pranadana55@gmail.com
 **/
class MainViewModel : ViewModel() {
    val content = ObservableField<String>("Hello")

    init {
        Handler().postDelayed({
            content.set("Data binding awesome")
        }, 3_000)
    }
}