package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj 2 liczby ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        for (int i = numberOne; i <= numberTwo; i++) {
            System.out.println(i);
        }
    }
}
