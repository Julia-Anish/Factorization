package com.example.factorisationnew

import org.junit.Test
import org.junit.jupiter.api.Assertions

class NewTest {
    @Test
    fun test1(){
        val newTest = Main()
        Assertions.assertEquals("[2, 2, 3, 7]", newTest.factor(84).contentToString())

    }

    @Test
    fun test2 (){
        val newTest = Main()
        Assertions.assertEquals("[11]", newTest.factor(11).contentToString())

    }
}
