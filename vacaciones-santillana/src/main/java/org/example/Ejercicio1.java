package org.example;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de mes (1-12): ");
        int numeroMes = scanner.nextInt();

        int diasEnMes = obtenerDiasEnMes(numeroMes);

        if (diasEnMes != -1) {
            System.out.println("El mes " + numeroMes + " tiene " + diasEnMes + " días.");
        } else {
            System.out.println("Número de mes inválido.");
        }

        scanner.close();
    }

    public static int obtenerDiasEnMes(int numeroMes) {
        // Implementación del método para obtener los días en un mes
        // Igual que el código anterior
        switch (numeroMes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                return 31;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                return 30;
            case 2: // Febrero
                return 28; // Suponiendo que no es un año bisiesto
            default:
                return -1; // Número de mes inválido
        }
    }
    }
