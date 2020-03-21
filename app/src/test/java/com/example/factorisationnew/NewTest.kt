package com.example.factorisationnew

import org.junit.Test
import org.junit.jupiter.api.Assertions


class NewTest {
    val newTest = Main()

    @Test
    fun test1() {
        val newTest = Main()
        Assertions.assertEquals("[2, 2, 3, 7]", newTest.factor(84).contentToString())
    }

    @Test
    fun test2 () {
        Assertions.assertEquals("[11]", Main().factor(11).contentToString())
    }

    @Test
    fun test3 () {
        Assertions.assertEquals("[]", Main().factor(1).contentToString())
    }

    @Test
    fun test4 () {
        Assertions.assertEquals("[3, 5, 37]", Main().factor(555).contentToString())
    }

    @Test
    fun test5 () {
        Assertions.assertEquals("[2, 7, 13, 41]", Main().factor(7462).contentToString())

    }


    @Test
    fun runtime(){
        val newTest = Main()
        newTest.timeIt("Runtime is") { newTest.factor(255)}
    }






}
