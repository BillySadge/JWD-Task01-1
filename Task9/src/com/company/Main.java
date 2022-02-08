package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int []firstArray = {1,2,3,4,5,6,7,8,9,10};
        int []secondArray = {9,8,7,6,5};
        
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] result = new int[(firstArray.length+secondArray.length)];
        System.arraycopy(firstArray,0,result,0,k);
        System.arraycopy(secondArray,0,result,k,secondArray.length);
        System.arraycopy(firstArray,k,result,k+secondArray.length,firstArray.length - k);

        System.out.println(Arrays.toString(result));


    }
}
