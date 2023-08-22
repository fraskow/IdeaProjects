package org.example;

import java.util.Scanner;

public class Ejercicio7 {

    public static int contarNotasMayoresA3(double[] notas) {
        int contador = 0;
        for (double nota : notas) {
            if (nota > 3) {
                contador++;
            }
        }
        return contador;
    }
}
