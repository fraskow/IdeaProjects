package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio3Test {
    @Test
    public void testNumeroArmstrong() {
        boolean resultado = Ejercicio3.determinarSiEsArmstrong(153);
        assertEquals(true, resultado);
    }

    @Test
    public void testNumeroNoArmstrong() {
        boolean resultado = Ejercicio3.determinarSiEsArmstrong(123);
        assertEquals(false, resultado);
    }
}