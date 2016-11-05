package com.alex.myFirstExercises;

import java.util.Scanner;
//программа вычисляет кол-во секунд в введенном числе дней
public class Seconds {
    public static void main(String[] args) {
        int days = getDaysFromInput();
        prrintSeconds(days);
    }

    private static void prrintSeconds(int days) {
        long result = days * 24 * 60 * 60;
        System.out.println("В указанном кол-ве дней " + result + " секунд.");
    }

    private static int getDaysFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число дней");
        return scanner.nextInt();
    }
}
