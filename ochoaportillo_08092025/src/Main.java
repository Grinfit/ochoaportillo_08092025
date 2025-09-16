/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner; // Importamos Scanner para poder leer números desde el teclado

public class Main {

    public static void main(String[] args) {
        // Creamos un Scanner para capturar los datos del usuario
        Scanner sc = new Scanner(System.in);

        // Declaramos un arreglo de 5 enteros
        int[] numeros = new int[5];

        // Pedimos al usuario que ingrese los 5 números desordenados
        System.out.println("Ingrese 5 números enteros (desordenados):");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt(); // Leemos cada número
        }

        // Mostramos los números tal como fueron ingresados
        System.out.print("\nNúmeros ingresados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Aplicamos el algoritmo de burbuja para ordenar de menor a mayor
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiamos los valores si están en el orden incorrecto
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Mostramos los números ya ordenados
        System.out.print("\nNúmeros ordenados de menor a mayor: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println(); // Salto de línea final

        sc.close(); // Cerramos el Scanner
    }
}

