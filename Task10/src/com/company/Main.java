package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] matrix = new int[n][n];
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i % 2 == 0){
                    matrix[i][j] = (j+1);
                }else{
                    matrix[i][j] = (n-j);
                }
            }
        }
        for(int[] row : matrix){
            for(int el : row){
                System.out.print(el+ " ");
            }
            System.out.println();
        }
    }
}
