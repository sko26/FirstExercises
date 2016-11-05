package com.alex.myFirstExercises;

import java.util.Random;

//конвертация двумерного числового массива в одномерный
public class Massiv2xTo1x {
    public static void main(String[] args) {
        int razmer = 4;
        int massiv2x[][];
        massiv2x = getRandom2xMassiv(razmer);
        Convert2xTo1xMassivAndPrintIt(massiv2x, razmer);
    }

    private static int[][] getRandom2xMassiv(int r) {
        int mas2x[][] = new int[r][r];
        Random rand = new Random();
        for (int i = 0; i < mas2x.length; i++) {
            for (int j = 0; j < mas2x.length; j++) {
                mas2x[i][j] = rand.nextInt(100);
                System.out.printf("%d ", mas2x[i][j]);
            }
            System.out.println();
        }
        return mas2x;
    }

    private static void Convert2xTo1xMassivAndPrintIt(int a[][], int r) {
        int b[] = new int[r * r];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i * a.length + j] = a[i][j];
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
