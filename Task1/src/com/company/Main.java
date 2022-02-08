package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean res = num / 1000 + num / 100 % 10 == num % 100 / 10 + num % 10;
        System.out.println(res);
    }
}
