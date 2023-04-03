package com.example.testing_with_mockitof_kotlin

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

// @RunWith attache un runner avec la classe de test pour initialiser les données
// de test
@RunWith(MockitoJUnitRunner::class)
class CalculatorApplicationTester {
    //@InjectMocks annotation est utilisée pour créer et injecter l'objet fictif
    @InjectMocks
    var calculatorApplication = CalculatorApplication()

    //@Mock annotation est utilisée pour créer l'objet fictif à injecter
    @Mock
    var calcService: CalculatorService? = null
    @Test
    fun testAdd() {
// ajouter le comportement de calcService pour additionner deux nombres
        `when`(calcService!!.add(10.0, 20.0)).thenReturn(30.00)
        // tester la fonctionnalité d'ajout
        Assert.assertEquals(calculatorApplication.add(10.0, 20.0), 30.0, 0.0)
    }
}