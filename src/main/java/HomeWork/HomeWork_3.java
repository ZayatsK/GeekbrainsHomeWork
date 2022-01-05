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

        int [][] arr = new int [4][4];
arr [0][0] = 1;
            arr [1][1] = 1;
            arr [2][2] = 1;
            arr [3][3] = 1;
            arr [3][0] = 1;
            arr [2][1] = 1;
            arr [0][3] = 1;
            arr [1][2] = 1;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static int zad5(int a, int b)  // не успеваю доделать, пока заливаю на гит таком виде. Доделаю до вашей проверки, смотрите актуальную версию)
    }
