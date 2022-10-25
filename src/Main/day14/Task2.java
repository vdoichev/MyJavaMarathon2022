package Main.day14;
/*
2. Создать в папке проекта файл people.txt в котором хранятся имена и возраст людей. Реализовать
статический метод List<String> parseFileToStringList(), который считывает содержимое этого файла и
возвращает список, состоящий из значений имен и возрастов каждого человека. Получить данный список в
методе main() и распечатать его в консоль.
В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и
выводить в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно,
необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();
        String line;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                if (line.charAt(line.indexOf(' ') + 1) == '-') {
                    throw new IllegalArgumentException();
                }
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return list;
    }
}
