package com.alex.myFirstExercises;

import java.util.Scanner;

/**
 * Created by USER on 22.08.2016.
 */
public class InputName {
    String name2 = InputName();

    private String InputName() {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Введите свое имя");
        name = scanner.next();
        return name;
    }

    public static void main(String[] args) {
        String name;
        InputName nm = new InputName();
        name = nm.name2;
        System.out.printf("Ваше имя - %s", name);
    }
}
