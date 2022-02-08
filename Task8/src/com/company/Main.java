package com.company;

import com.sun.javafx.tk.ScreenConfigurationAccessor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int [] nums = new int[15];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.round((Math.random() * 50) - 25);
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nK := ");
        int k = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % k == 0){
                sum += nums[i];
            }
        }
        System.out.println("Result: " + sum);
    }
}
