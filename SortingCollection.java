package com.alex.myFirstExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollection {
    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
        list.add("s");
        list.add("a");
        list.add("d");
        list.add("x");
        list.add("h");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
