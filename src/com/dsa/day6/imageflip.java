package com.dsa.day6;
public class imageflip {

    static void rotate(int a[][]) {
        int n = a.length;

        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {

                // Bottom left store in temp
                int tem = a[n - 1 - j][i];

                // Bottom left = Bottom right
                a[n - 1 - j][i] = a[n - 1 - i][n - 1 - j];

                // Bottom right = Top right
                a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i];

                // Top right = Top left
                a[j][n - 1 - i] = a[i][j];

                // Top left = temp
                a[i][j] = tem;
            }
        }
    }

    public static void main(String[] args) {

        int a[][] = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };

        rotate(a);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}