package Main.day4;
/*
2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
- наибольший элемент массива
- наименьший элемент массива
- количество элементов массива, оканчивающихся на 0
- сумму элементов массива, оканчивающихся на 0
Использовать сортировку запрещено.
 */

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        int max = 0, min = 10000, count = 0, summa = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
            System.out.print(arr[i] + " ");

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] % 10 == 0) {
                count++;
                summa += arr[i];
            }
        }

        System.out.println();
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + summa);
    }
}
