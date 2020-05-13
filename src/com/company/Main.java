package com.company;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число больше чем 3");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Random random = new Random();

        if (n <= 3) {
            System.out.println("Вы ввели неподходящее число");
        } else {
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(n);
            }
            System.out.println(Arrays.toString(array));

            int sum = 0; // количество четных элементов в первом массиве
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0 && array[i] != 0) {
                    sum++;
                }
            }
            int j=0;
            if (sum > 0) {
                int[] array2 = new int[sum];
                for ( int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0 && array[i] != 0) {
                        array2[j] = array[i];
                        j++;

                    }
                }
                System.out.println(Arrays.toString(array2));
            }
        }
    }
}


