package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        double perimeter = a + b + c;
        double square = 0.5 * a * b;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Square: " + square);

    }
}
