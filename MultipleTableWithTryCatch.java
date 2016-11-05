package com.alex.myFirstExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTableWithTryCatch {
    public static void main(String[] args) {
        int x = getUserEnter();
        getMultiTable(x);
    }

    private static int getUserEnter() {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Введите число");
        try {
            num = scanner.nextInt();
            return num;
        } catch (InputMismatchException ex) {
            System.out.println("Надо ввести число, а не букву.");
            num = getUserEnter();
        }
        return num;
    }

    private static void getMultiTable(int x) {
        System.out.println("Таблица умножения числа " + x);
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", x, i, x * i);
        }
    }


}
