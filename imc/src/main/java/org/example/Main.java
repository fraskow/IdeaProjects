package org.example;
import imc_calculator.ImcCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame la altura del usuario");
        Double altura = teclado.nextDouble();
        System.out.println("Dame el peso del usuario");
        Double peso = teclado.nextDouble();

        ImcCalculator calc = new ImcCalculator(peso, altura);

        Double imc = calc.imc(peso,altura);

        System.out.println("El imc del usuario es "+imc);

        calc.definition(imc);

    }
}