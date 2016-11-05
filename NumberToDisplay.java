package com.alex.myFirstExercises;

import java.util.Scanner;

public class NumberToDisplay {
    public static void main(String[] args) {
        int n = ToEnterNumber();
        int[] array;
        array = makeArrayFromNumber(n);
        DisplayArrayToScreen(array);
    }

    private static int ToEnterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для отображения с цифрами от 0 до 3");
        int num = scanner.nextInt();
        return num;
    }

    public static int[] makeArrayFromNumber(int number) {
        double log = Math.log10(number);
        int degree;
        if (number == 0){
            degree = 0;
        }else {
            degree = (int) Math.floor(log);
        }
        int[] m = new int[degree + 1];
        for (int i = degree; i >= 0; i--) {
            double tmp = number / Math.pow(10, i);
            m[degree - i] = (int) Math.floor(tmp);
            number = number - m[degree - i] * ((int) Math.pow(10, i));
        }
        return m;
    }

    private static void DisplayArrayToScreen(int[] array) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < array.length; j++) {
                ArrayOfNumbersToDisplay.choice(array[j], i);
            }
            System.out.println();
        }
    }

}
