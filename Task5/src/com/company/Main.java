package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] nums = new double[3];
        nums[0] = scanner.nextDouble();
        nums[1] = scanner.nextDouble();
        nums[2] = scanner.nextDouble();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                nums[i] = Math.pow(nums[i],2);
            }else{
                nums[i] = Math.pow(nums[i],4);
            }
        }

        for(int i = 0; i < nums.length; i++){
            System.out.println((i + 1) + ".: " + nums[i]);
        }

    }
}
