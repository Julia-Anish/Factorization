package com.example.factorisationnew



class Main {
    fun factor(x: Int): Array<Int> {
        var primeNumbersArr = emptyArray<Int>()     //массив с простыми числами от 2-ух до х

        loop@ for (i in 2..x) {
            for (j in 2 until i) {                          //то, на что мы делим, чтобы вычислить простое число
                if (i % j == 0 && i != j) continue@loop     //если остаток = 0, значить число делится еще на что-то помимо себя и 1.
            }                                               // i != j т.к. абсолютно все числа делятся на самих себя
            primeNumbersArr += i
        }
        println("Простые числа от 2 до $x " + primeNumbersArr.contentToString())

        var i = 0
        var xCurrent: Double = x.toDouble()         //продублировали переменную и привели к double, т.к. при последнем делении некоторых чисел получалась единица с десятичным знаком, которая по сути больше единицы, но программа ее приравнивала к единице
        var factorArr = emptyArray<Int>()           //массив с множителями х
        while (xCurrent>1.0) {                      //для 1 нет простого числа

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
        println("Множители числа $x =" + factorArr.contentToString())
        return factorArr



    }

    fun <T> timeIt(message: String , block: () -> T): T {
        val start = System.currentTimeMillis()
        val runtime = block()
        val end = System.currentTimeMillis()
        println("$message: ${end - start} ms")
        return runtime
    }


}




