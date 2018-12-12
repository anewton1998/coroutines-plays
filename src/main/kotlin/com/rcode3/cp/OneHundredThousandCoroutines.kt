package com.rcode3.cp

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    val jobs = List(100_000) {
        launch {
            delay(10000L)
            print(".")
        }
    }
    jobs.forEach { it.join() }
}