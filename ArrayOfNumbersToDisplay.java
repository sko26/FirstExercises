package com.alex.myFirstExercises;

//Вспомогательный класс для NumbersToDisplay
public class ArrayOfNumbersToDisplay {

    public static void choice(int number, int raw){
        switch (number){
            case 0:
                display0(raw);
                break;
            case 1:
                display1(raw);
                break;
            case 2:
                display2(raw);
                break;
            case 3:
                display3(raw);
                break;
            }
        }


    private static void display0(int n) {
        switch (n) {
            case 0:
            case 6:
                System.out.printf("   ***   ");
                break;
            case 1:
            case 5:
                System.out.printf("  *   * ");
                break;
            case 2:
            case 3:
            case 4:
                System.out.printf(" *     *");
                break;
        }
    }

    private static void display1(int n) {
        switch (n) {
            case 0:
                System.out.printf("       *");
                break;
            case 1:
                System.out.printf("      **");
                break;
            case 2:
                System.out.printf("     * *");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.printf("       *");
                break;
        }
    }

    private static void display2(int n) {
        switch (n) {
            case 0:
                System.out.printf("   ***  ");
                break;
            case 1:
                System.out.printf("  *   * ");
                break;
            case 2:
                System.out.printf(" *     *");
                break;
            case 3:
                System.out.printf("     *  ");
                break;
            case 4:
                System.out.printf("   *    ");
                break;
            case 5:
                System.out.printf(" *      ");
                break;
            case 6:
                System.out.printf(" *******");
                break;
        }
    }

    private static void display3(int n) {
        switch (n) {
            case 0:
                System.out.printf("   ***  ");
                break;
            case 1:
                System.out.printf("  *   * ");
                break;
            case 2:
                System.out.printf(" *     *");
                break;
            case 3:
                System.out.printf("     *  ");
                break;
            case 4:
                System.out.printf("       *");
                break;
            case 5:
                System.out.printf(" *     *");
                break;
            case 6:
                System.out.printf("  ***** ");
                break;
        }
    }
}
//..***..
//.*...*.
//*.....*
//....*..
//......*
//*.....*
//.*****.