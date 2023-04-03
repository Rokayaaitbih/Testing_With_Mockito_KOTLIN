package com.example.testing_with_mockitof_kotlin


interface CalculatorService {
    fun add(input1: Double, input2: Double): Double
    fun sous(input1: Double, input2: Double): Double
    fun multi(input1: Double, input2: Double): Double
    fun div(input1: Double, input2: Double): Double
}