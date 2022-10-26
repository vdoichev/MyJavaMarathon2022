package Main.day15;
/*
Вам дан файл с информацией об остатках обуви на складе (src/main/resources/shoes.csv). Это пример реальной
выгрузки остатков из 1С в csv файл (формат файла с разделителями, в качестве разделителя использован
символ “;”). В этом файле содержится информация о названии модели обуви, ее размер и оставшееся на
складе количество.
Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt) с информацией о моделях и
размерах обуви, которой нет на складе (количество = 0). Для этого реализуйте программу, которая
принимает на вход csv файл и создает новый txt файл следующего содержания (должно получиться 11 строк):
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("shoes.csv");
        System.out.println(filterShoes(readCsvFile(file)));
        writeTxtFile(filterShoes(readCsvFile(file)));
    }

    public static List<Shoes> readCsvFile(File file) {
        List<Shoes> shoes = new ArrayList<>();
        String line;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] shoesString = line.split(";");
                shoes.add(new Shoes(shoesString[0],
                        Integer.parseInt(shoesString[1]),
                        Double.parseDouble(shoesString[2])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return shoes;
    }

    public static void writeTxtFile(List<Shoes> shoes) {
        File file = new File("shoes.txt");
        try (PrintWriter pw = new PrintWriter(file)) {
            for (Shoes oneShoes : shoes) {
                pw.println(oneShoes.getModel() + ", " +
                        oneShoes.getSize() + ", " +
                        oneShoes.getBalance());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Shoes> filterShoes(List<Shoes> shoes) {
        List<Shoes> filterShoes = new ArrayList<>();
        for (Shoes oneShoes : shoes) {
            if (oneShoes.getBalance() == 0.0) {
                filterShoes.add(oneShoes);
            }
        }
        return filterShoes;
    }
}
