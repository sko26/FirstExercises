package com.alex.myFirstExercises;

import java.util.Scanner;

public class Zarplata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zarplata = enterValue(scanner, "Введите размер почасовой оплаты");
        int time = enterValue(scanner, "Введите кол-во рабочих часов");
        System.out.println("Ваша зарплата в неделю составит - " + Itog(zarplata, time));
    }

    private static int enterValue(Scanner scanner, String st) {
        System.out.println(st);
        int tmp = scanner.nextInt();
        return tmp;
    }

    private static double Itog(int z, int t) {
        if (z > 8 * 70) {
            z = 8 * 70;
            System.out.println("Мы не может платить тебе больше 560р. в час!");
        }
        if (t > 60) {
            t = 60;
            System.out.println("Ты не можешь работать больше 60ч в неделю!");
        }
        double result = z * t;
        if (t > 40) {
            result = 40 * z + (60 - t) * z * 1.5;
        }
        return result;
    }
}
