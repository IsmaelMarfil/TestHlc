package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(-1, Calculadora.sumar(-2, 1));
        assertEquals(0, Calculadora.sumar(0, 0));
    }
    @Test
    public void testRestar(){
        assertEquals(2, Calculadora.restar(5, 3));
        assertEquals(-1, Calculadora.restar(4, 5));
        assertEquals(0, Calculadora.restar(5, 5));
    }

    @Test
    public void testMultiplicar(){
        assertEquals(4, Calculadora.multiplicar(2, 2));
        assertEquals(-4, Calculadora.multiplicar(2, (-2)));
        assertEquals(0, Calculadora.multiplicar(2, 0));
    }
    @Test
    public void testDividir(){
        assertEquals(2.0, Calculadora.dividir(4, 2),0);
        assertEquals(-2.0, Calculadora.dividir(4, -2),0);
    }

    /* Realiza a continuación el resto de tests para el resto de funciones */
}