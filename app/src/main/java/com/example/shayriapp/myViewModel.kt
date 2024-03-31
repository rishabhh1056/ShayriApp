package com.example.shayriapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class myViewModel(application: Application):AndroidViewModel(application) {
    public var shayariList = ArrayList<DataEntry>()

    fun getData():ArrayList<DataEntry>
    {
        shayariList =SampelData.data as ArrayList<DataEntry>
        return shayariList
    }
}