package com.alex.myFirstExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IsDoubleInteger {
    public static void main(String[] args) {
        double myDouble = 1.0;
        double ttt;

        while (myDouble != 0) {
            System.out.println("Введите число ");
            myDouble = inputDouble();
            ttt = myDouble - Math.floor(myDouble);
            if (ttt == 0) {
                System.out.println("Оно целое!");
            } else System.out.println("Это дробное число.");
        }
    }

    private static double inputDouble() {
        double d;
        Scanner scanner = new Scanner(System.in);
        try {
            d = scanner.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("дробная часть вводится через запятую!");
            d = inputDouble();
        }
        return d;
    }
}
