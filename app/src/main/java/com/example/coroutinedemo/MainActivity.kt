package com.example.coroutinedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
 import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {

    private val customDispatcher = Executors.newSingleThreadExecutor().asCoroutineDispatcher()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runDispatcherTest("Main", Dispatchers.Main)
        runDispatcherTest("Default", Dispatchers.Default)
        runDispatcherTest("IO", Dispatchers.IO)
        runDispatcherTest("Unconfined", Dispatchers.Unconfined)
        runDispatcherTest("Custom", customDispatcher)
    }


    private fun runDispatcherTest(name: String, dispatcher: CoroutineDispatcher) {
        val startTime = System.currentTimeMillis()

        repeat(10) { index ->
            CoroutineScope(dispatcher).launch {
                delay(1000) // simulate some work
                val time = System.currentTimeMillis() - startTime
                println("$name → Task $index completed in $time ms on [${Thread.currentThread().name}]")
            }
        }
    }

}