package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio6Test {
    @Test
    public void testContarDigitosUnDigito() {
        int resultado = Ejercicio6.contarDigitos(5);
        assertEquals(1, resultado);
    }

    @Test
    public void testContarDigitosVariosDigitos() {
        int resultado = Ejercicio6.contarDigitos(12345);
        assertEquals(5, resultado);
    }

    @Test
    public void testContarDigitosCero() {
        int resultado = Ejercicio6.contarDigitos(0);
        assertEquals(1, resultado);
    }
}