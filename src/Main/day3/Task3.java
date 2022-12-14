package Main.day3;
/*
3. Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое и делитель.
Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
Если пользователь вводит 0 в качестве делителя, вместо того, чтобы останавливать работу
цикла принудительно, мы пропускаем итерацию и выводим в консоль сообщение “Деление на 0”.
Ключевое слово else использовать в этой программе нельзя.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iteration = 0;
        do {
            iteration++;
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            if (y == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(x / y);
        } while (iteration < 5);
    }
}
