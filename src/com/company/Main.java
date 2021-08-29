package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        System.out.println("Enter number for modulo: ");
        int numberModulo = scanner.nextInt();

        if (numberOne < numberTwo) {
            for (int i = numberOne; i <= numberTwo; i++) {
                if (i % numberModulo == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = numberOne; i >= numberTwo; i--) {
                if (i % numberModulo == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}