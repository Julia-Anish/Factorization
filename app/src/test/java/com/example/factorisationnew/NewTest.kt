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

    @Test
    fun test3 (){
        val newTest = Main()
        Assertions.assertEquals("[]", newTest.factor(1).contentToString())
    }

    @Test
    fun test4 (){
        val newTest = Main()
        Assertions.assertEquals("[3, 5, 37]", newTest.factor(555).contentToString())
    }

    @Test
    fun test5 (){
        val newTest = Main()
        Assertions.assertEquals("[2, 7, 13, 41]", newTest.factor(7462).contentToString())

    }
}
