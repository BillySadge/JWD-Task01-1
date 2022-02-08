package com.company;

import java.util.Scanner;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.pow;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,h,fx;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        h = scanner.nextDouble();
        for (double i = a; i <= b; i+=h){
            fx = pow(sin(i),2) - cos(2 * i);
            System.out.printf("| x = %.3f | fx = %.3f |\n", i, fx);
        }
    }
}
