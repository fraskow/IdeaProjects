package org.example;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        boolean esArmstrong = determinarSiEsArmstrong(numero);

        if (esArmstrong) {
            System.out.println(numero + " es un número Armstrong.");
        } else {
            System.out.println(numero + " no es un número Armstrong.");
        }

        scanner.close();
    }

    public static boolean determinarSiEsArmstrong(int numero) {
        int original = numero;
        int sumaCubos = 0;

        while (numero > 0) {
            int digito = numero % 10;
            sumaCubos += Math.pow(digito, 3);
            numero /= 10;
        }

        return sumaCubos == original;
    }
}
