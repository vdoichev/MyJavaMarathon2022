package Main.day5;
/*
2. Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”, “Модель”.
Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не использовать).
Придерживаться принципов инкапсуляции и использовать ключевое слово this.
Геттером получить год выпуска, цвет, модель, вывести значения в консоль.
 */

class Motorbike {
    private final int year;
    private final String color;
    private final String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2019, "Black", "Java");
        System.out.println(motorbike.getColor() + " " + motorbike.getModel() + ", " + motorbike.getYear());
    }
}
