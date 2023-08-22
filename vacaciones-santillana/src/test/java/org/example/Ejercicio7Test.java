package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio7Test {
    @Test
    public void testNotasTodasMayoresA3() {
        double[] notas = { 4.0, 3.5, 4.5, 3.2, 3.8 };
        int resultadoEsperado = 5;
        int resultadoObtenido = Ejercicio7.contarNotasMayoresA3(notas);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testNotasAlgunasMayoresA3() {
        double[] notas = { 2.5, 3.7, 4.2, 2.9, 3.9 };
        int resultadoEsperado = 3;
        int resultadoObtenido = Ejercicio7.contarNotasMayoresA3(notas);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testNotasNingunaMayorA3() {
        double[] notas = { 2.1, 1.8, 2.0, 2.5, 2.9 };
        int resultadoEsperado = 0;
        int resultadoObtenido = Ejercicio7.contarNotasMayoresA3(notas);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}