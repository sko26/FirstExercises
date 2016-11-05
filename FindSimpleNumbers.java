package com.alex.myFirstExercises;

public class FindSimpleNumbers {
    public static void main(String[] args) {
        boolean b;
        int quantity = 0;
        final int LAST = 10000;
        int[] allSimple = new int[(LAST / 2 + 1)];

        for (int i = 1; i <= LAST; i = i + 2) {
            //  Проверяем очередное число на простоту
            b = testNextNumb(i);
            //  Запоминаем найденное простое число и считаем их кол-во
            if (b) {
                allSimple[quantity] = i;
                System.out.println(" " + allSimple[quantity]);
                quantity++;
            }
        }
        System.out.printf("В данном диапозоне %d простых чисел \n", quantity);
    }

    //  Проверяем очередное число на простоту
    static boolean testNextNumb(int a) {
        boolean result;
        int counter = 0;
        for (int i = 1; i <= a / 2; i = i + 2) {
            double ostatok = Math.IEEEremainder(a, i);
            if (ostatok == 0) {
                counter++;
            }
            if (counter > 1) {
                break;
            }
        }
        if (counter > 1) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }

}
