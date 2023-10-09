/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

package org.example;

public class Main {
    public static void main(String[] args) {

        lv1();
        lv2();

    }

    private static void lv1() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static void lv2() {
        for (int i = 1; i < 101; i++) {
            String salida = "";
            salida = (i % 3 == 0 ? "fizz" : "") + (i % 5 == 0 ? "buzz" : "");
            System.out.println(salida.isEmpty() ? i : salida);
        }
    }
}