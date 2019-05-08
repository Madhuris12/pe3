package com.stackroute;

import java.util.Scanner;

public class AdditionOfMatrix {
    public static void main(String[] args) {
        int i, j, m, n;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        i= in.nextInt();
        j = in.nextInt();

        int[][] first = new int[i][j];
        int[][] second = new int[i][j];
        int[][] sum = new int[i][j];

        System.out.println("Enter the elements of first matrix");

        for (m = 0; m < i; m++)
            for (n = 0; n < j; n++)
                first[m][n] = in.nextInt();

        System.out.println("Enter the elements of second matrix");

        for (m = 0; m < i; m++)
            for (n = 0; n < j; n++)
                second[m][n] = in.nextInt();

        for (m = 0; m < i; m++)
            for (n = 0; n < j; n++)
                sum[m][n] = first[m][n] + second[m][n];

        System.out.println("Sum of the matrices:");

        for (m = 0; m < i; m++) {
            for (n = 0; n < j; n++)
                System.out.print(sum[m][n] + "\t");

            System.out.println();
        }
    }
}
