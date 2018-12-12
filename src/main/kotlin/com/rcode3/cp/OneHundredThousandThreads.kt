package com.rcode3.cp

import kotlin.concurrent.thread

fun main(args: Array<String>) {
    val jobs = List(100_000) {
        thread {
            Thread.sleep(10000L)
            print(".")
        }
    }
    jobs.forEach { it.join() }
}