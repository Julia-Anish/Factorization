package com.example.factorisationnew

import java.util.*

class Main {
    fun factor(x: Int): Array<Int> {
        var primeNumbersArr = emptyArray<Int>()

        loop@ for (i in 2..x) {
            for (j in 2..i - 1) {
                if (i % j == 0 && i != j) continue@loop
            }
            primeNumbersArr += i
        }
        println(primeNumbersArr.contentToString())

        var i = 0
        var xCurrent: Double = x.toDouble()
        var factorArr = emptyArray<Int>()
        while (true) {

            var resDiv = xCurrent / primeNumbersArr[i]
            if (resDiv == 1.0) {
                factorArr += primeNumbersArr[i]
                break

            } else if (xCurrent % primeNumbersArr[i] == 0.0) {
                factorArr += primeNumbersArr[i]
                i = 0
                xCurrent = resDiv
            } else {
                i++
            }
        }

        return factorArr
        println(factorArr.contentToString())


    }
    fun main(args: Array<String>){
        println(factor(84).contentToString())
    }
}




