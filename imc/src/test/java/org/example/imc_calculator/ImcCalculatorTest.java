package org.example.imc_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImcCalculatorTest {

    @Test
    void imcTest() {

        ImcCalculator calculator = new ImcCalculator(70.0, 1.75);
        double expectedImc = 22.86;
        double actualImc = calculator.imc(calculator.getPeso(), calculator.getAltura());
        assertEquals(expectedImc, actualImc, 0.01);

    }

    @Test
    void definitionTest() {
        ImcCalculator calculator = new ImcCalculator(70.0, 1.75);

        assertEquals("Peso normal", calculator.definition(22.0));
        assertEquals("Sobrepeso", calculator.definition(27.5));
        assertEquals("Obesidad leve", calculator.definition(32.0));
        assertEquals("Obesidad moderada", calculator.definition(38.0));
        assertEquals("Obesidad morbida", calculator.definition(42.5));

        assertEquals("Delgadez extrema", calculator.definition(10.0));
        assertEquals("Delgadez moderada", calculator.definition(16.5));
    }
}