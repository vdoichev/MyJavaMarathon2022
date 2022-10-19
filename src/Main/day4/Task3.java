package Main.day4;
/*
3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12,n=8 m - размерность по строкам, n- размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна.
Если таких строк несколько, вывести индекс последней из них.
 */

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[12][8];
        int index = -1, max = 0;
        for (int i = 0; i < array.length; i++) {
            int summa = 0;
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(50);
                summa += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            if (summa > max) {
                max = summa;
                index = i;
            }
            System.out.println(" | " + summa);
        }
        System.out.println(index + 1);
    }
}
