package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio4Test {
    @Test
    public void testCalcularFibonacciCasoBase() {
        int[] resultadoEsperado = { 0 };
        int[] resultadoObtenido = new int[] { Ejercicio4.calcularFibonacci(0) };
        assertArrayEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testCalcularFibonacciVariosNumeros() {
        int[] resultadoEsperado = { 0, 1, 1, 2, 3, 5, 8, 13, 21 };
        int[] resultadoObtenido = new int[resultadoEsperado.length];
        for (int i = 0; i < resultadoEsperado.length; i++) {
            resultadoObtenido[i] = Ejercicio4.calcularFibonacci(i);
        }
        assertArrayEquals(resultadoEsperado, resultadoObtenido);
    }
}