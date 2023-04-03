package com.example.testing_with_mockitof_kotlin


class CalculatorApplication {
    private var calcService: CalculatorService? = null
    fun setCalculatorService(calcService: CalculatorService?) {
        this.calcService = calcService
    }

    fun add(input1: Double, input2: Double): Double {
        return calcService!!.add(input1, input2)
    }

    fun sous(input1: Double, input2: Double): Double {
        return calcService!!.sous(input1, input2)
    }

    fun multi(input1: Double, input2: Double): Double {
        return calcService!!.multi(input1, input2)
    }

    fun div(input1: Double, input2: Double): Double {
        return calcService!!.div(input1, input2)
    }
}