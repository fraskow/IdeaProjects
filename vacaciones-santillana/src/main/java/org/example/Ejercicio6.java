package org.example;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        long numero = scanner.nextLong();

        int cantidadDigitos = contarDigitos(numero);

        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");

        scanner.close();
    }

    public static int contarDigitos(long numero) {
        if (numero == 0) {
            return 1;
        }

        int count = 0;
        while (numero != 0) {
            numero /= 10;
            count++;
        }
        return count;
    }
}
