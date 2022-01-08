package HomeWork;

import java.util.Arrays;

public class HomeWork_3 {
    public static void main(String[] args) {



        zad1();
        zad2();
        zad3();
        zad4();
    }

    public static void zad1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    public static void zad2() {
        int[] arr = new int[100];
        for (int i = 0; i < 99; i++) {
            arr[i] = i;
            System.out.print(arr[i] + 1 + " ");
        }
        System.out.println();

    }

    public static void zad3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 6;
            }
            else {
                arr[i] = arr[i] * 1;
            }
                System.out.print(arr[i] + ",");

            }
        System.out.println();
        }



        public static void zad4() {

        int counter = 0;
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            if (array[i][counter] == 0) {
                array[i][counter] = 1;
                counter += 1;
                System.out.println();
            };
            for (int j = 0; j < array.length; j++) {
                System.out.print(" " + array[i][j]);
            }
        }
    }

    //Задание 5 размышляю
            }



