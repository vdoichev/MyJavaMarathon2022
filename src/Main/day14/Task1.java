package Main.day14;
/*
1. Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30). Заполнить его вручную
десятью произвольными числами. Реализовать статический метод printSumDigits(File file), который считает
сумму всех чисел в этом файле и выводит ее на экран. Вызвать данный метод в методе main().
Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в
консоль сообщение “Файл не найден”. Помимо этого, если чисел в файле меньше или больше 10, необходимо
выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day14task1.txt");
        printSumDigits(file);
    }
    public static void printSumDigits(File file) {

        try (Scanner scanner = new Scanner(file)) {

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length != 10) {
                throw new IllegalArgumentException();
            }
            int summa = 0;

            for (String number : numbersString) {
                summa += Integer.parseInt(number);
            }
            System.out.println(summa);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
