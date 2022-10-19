package Main.day5;
/*
1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
Созданный вами класс должен отвечать принципам инкапсуляции.
 */

class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1995);
        car.setColor("Yellow");
        car.setModel("BMW");
        System.out.println(car.getColor() + " " + car.getModel() + ", " + car.getYear());
    }
}


