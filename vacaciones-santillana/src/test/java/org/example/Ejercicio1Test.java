package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {

    @Test
    public void testObtenerDiasEnEnero() {
        int resultado = Ejercicio1.obtenerDiasEnMes(1);
        assertEquals(31, resultado);
    }

    @Test
    public void testObtenerDiasEnAbril() {
        int resultado = Ejercicio1.obtenerDiasEnMes(4);
        assertEquals(30, resultado);
    }

    @Test
    public void testObtenerDiasEnFebreroNoBisiesto() {
        int resultado = Ejercicio1.obtenerDiasEnMes(2);
        assertEquals(28, resultado);
    }
}