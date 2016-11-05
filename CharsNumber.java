package com.alex.myFirstExercises;

public class CharsNumber {
    private static String st = "Теперь знаю, как всё это получится.";
    static char ch = ' ';

    public static void main(String[] args) {
        int i;
        i = calcNumberOfChar(st, ch);
        System.out.println("В данной строке " + (st.length() - i) + " символов" + "\n" + "и " + i + " пробелов.");
    }

    static int calcNumberOfChar(String st1, char ch1) {
        int num = 0;
        for (int x = 0; x < st1.length(); x++) {
            if (ch1 == st1.charAt(x)) {
                num = num + 1;
            }
        }
        return num;
    }
}
