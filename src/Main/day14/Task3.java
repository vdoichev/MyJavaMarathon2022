package Main.day14;
/*
3. Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод List<Person>
parseFileToObjList(), который считывает содержимое того же файла people.txt, создает экземпляры класса
“Человек” и возвращает список объектов. Получить данный список в методе main() и распечатать его в консоль.
В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить
в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно, необходимо
выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Human> parseFileToObjList(File file) {
        List<Human> humans = new ArrayList<>();
        String line;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                int i = line.indexOf(' ');
                if (line.charAt(i + 1) == '-') {
                    throw new IllegalArgumentException();
                }
                humans.add(new Human(line.substring(0, i),
                        Integer.parseInt(line.substring(i + 1))));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return humans;
    }
}
