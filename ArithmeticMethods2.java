/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Azucena
 */

///////////-----inciso B----//////////////
public class ArithmeticMethods2 {

    public static void displayNumberPlus10(int x, int y) {
        System.out.println(x + 10);
        System.out.println(y + 10);
    }

    public static void displayNumberPlus100(int x, int y) {
        System.out.println(x + 100);
        System.out.println(y + 100);
    }

    public static void displayNumberPlus1000(int x, int y) {
        System.out.println(x + 1000);
        System.out.println(y + 1000);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Ingresa el primer valor ");
        int x = scanner.nextInt();

        System.out.println("Ingresa el segundo valor ");
        int y = scanner.nextInt();

        System.out.println("El resultado es:");

        displayNumberPlus10(x, y);

        displayNumberPlus100(x, y);

        displayNumberPlus1000(x, y);
    }
}
