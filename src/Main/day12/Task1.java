package Main.day12;
/*
1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Распечатать список.
 */

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BMW");
        arrayList.add("Mercedes");
        arrayList.add("Audi");
        arrayList.add("Renault");
        arrayList.add("Opel");
        System.out.println(arrayList);
        arrayList.add(2, "Fiat");
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
