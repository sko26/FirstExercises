package com.alex.myFirstExercises;

//программа определяет имя спортсмена с лучшим временем
public class Sportsmen {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 387, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        int bestTime = 1000;
        int index = 0;
        for (int i = 0; i < times.length; i++) {
            if (times[i] < bestTime) {
                bestTime = times[i];
                index = i;
            }
        }
        System.out.printf("Победитель %s с результатом %d", names[index], times[index]);
    }
}
