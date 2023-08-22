package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {
    @Test
    public void testAnioBisiestoNoDivisiblePor4() {
        boolean resultado = Ejercicio2.determinarSiEsBisiesto(2021);
        assertEquals(false, resultado);
    }

    @Test
    public void testAnioBisiestoDivisiblePor4NoDivisiblePor100() {
        boolean resultado = Ejercicio2.determinarSiEsBisiesto(2024);
        assertEquals(true, resultado);
    }

    @Test
    public void testAnioBisiestoDivisiblePor100NoDivisiblePor400() {
        boolean resultado = Ejercicio2.determinarSiEsBisiesto(1900);
        assertEquals(false, resultado);
    }

    @Test
    public void testAnioBisiestoDivisiblePor400() {
        boolean resultado = Ejercicio2.determinarSiEsBisiesto(2000);
        assertEquals(true, resultado);
    }

}