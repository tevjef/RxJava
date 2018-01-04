package me.tevjef

import io.reactivex.Observable

fun main(args: Array<String>) {
    // Compile time failure when fromIterable is annotated with io.reactivex.annotations.NonNull
    Observable.fromIterable<Int>(null)
}