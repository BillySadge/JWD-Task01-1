package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        boolean isBelongs = ((x >= -4 && x <= 4) && (y >= -3 && y <= 0))
                            || ((x >= -2 && x <= 2) && (y >= 0 && y <= 4));
        System.out.println(isBelongs);

    }
}
