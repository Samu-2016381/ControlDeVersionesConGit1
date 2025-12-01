package org.example;

import java.util.Scanner;
public class Calculadora1 {

    public static int suma(int a, int b) { return a + b; }
    public static int resta(int a, int b) { return a - b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA BÁSICA ===");
        System.out.println("Elige la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + suma(a, b));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + resta(a, b));
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}

