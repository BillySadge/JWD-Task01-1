package com.company;
import java.util.Scanner;

public class Main {

    public static double arrayMax(double[] arr) {
        double max = arr[0];
        for(double cur: arr)
            max = Math.max(max, cur);
        return max;
    }
    public static double arrayMin(double[] arr) {
        double min = arr[0];
        for(double cur: arr)
            min = Math.min(min, cur);
        return min;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double [] nums = new double[3];
        nums[0] = scanner.nextDouble();
        nums[1] = scanner.nextDouble();
        nums[2] = scanner.nextDouble();
        double result = arrayMax(nums) + arrayMin(nums);
        System.out.println("Result: " + result);

    }
}
