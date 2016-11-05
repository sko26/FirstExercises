package com.alex.myFirstExercises;

public class ConvertingNumberToArray {
    public static void main(String[] args) {
        int n = 16209;
        double log = Math.log10(n);
        int degree = (int) Math.floor(log);
        int[] array;
        array = makeArrayFromNumber(n, degree);
// Проверка
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] makeArrayFromNumber(int number, int b) {
        int[] m = new int[b+1];
        for (int i = b; i >= 0; i--) {
            double tmp = number / Math.pow(10, i);
            m[b - i] = (int) Math.floor(tmp);
            number = number - m[b-i]*((int) Math.pow(10, i));
        }
        return m;
    }
}
