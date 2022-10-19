package Main.day4;
/*
4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой
выведите значение суммы и индекс первого элемента тройки.
 */

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        int index = -1, summa = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
            System.out.print(arr[i] + " ");
            if (i >= 2) {
                int sumForThree = arr[i] + arr[i - 1] + arr[i - 2];
                if (summa < sumForThree) {
                    summa = sumForThree;
                    index = i - 2;
                }
            }
        }
        System.out.println();
        System.out.println(summa);
        System.out.println(index);
    }
}
