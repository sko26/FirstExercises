package com.alex.myFirstExercises;

public class Polindrom {
    public static void main(String[] args) {
        int x = 454;
        if (isPolindrom(x)) {
            System.out.println("Да, это число полиндром");
        } else {
            System.out.println("Увы..");
        }
    }

    static boolean isPolindrom(int a) {
        boolean answer = false;
        String st = Integer.toString(a);
        char[] chars = new char[st.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = st.charAt(i);
        }
        for (int i = 0; i < chars.length/2; i++) {
            if(chars[i] == chars [chars.length-i-1]){
                answer = true;
            }else {
                answer = false;
            }
        }
        return answer;
    }
}
