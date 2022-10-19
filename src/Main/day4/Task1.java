package Main.day4;
/*
1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного
размера и заполнить его случайными числами от 0 до 10. Затем вывести содержимое массива
в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, summa = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > 8) {
                count1++;
            }
            if (arr[i] == 1) {
                count2++;
            }
            if (arr[i] % 2 == 0) {
                count3++;
            } else {
                count4++;
            }
            summa += arr[i];
        }

        System.out.println("Длине массива: " + size);
        System.out.println("Количестве чисел больше 8: " + count1);
        System.out.println("Количестве чисел равных 1: " + count2);
        System.out.println("Количестве четных чисел: " + count3);
        System.out.println("Количестве нечетных чисел: " + count4);
        System.out.println("Сумме всех элементов массива: " + summa);
    }
}
