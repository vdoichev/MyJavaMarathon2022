package Main.day6;
/*
1. Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня в пакет текущего дня.
В классах Автомобиль и Мотоцикл реализовать два метода:
info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
yearDifference() - принимает на вход число (год), и возвращает разницу между переданным годом и
годом выпуска транспортного средства
 */

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1995);
        car.setColor("Yellow");
        car.setModel("BMW");
        System.out.println(car.getColor() + " " + car.getModel() + ", " + car.getYear());
        car.info();
        Motorbike motorbike = new Motorbike(2019, "Black", "Java");
        System.out.println(motorbike.getColor() + " " + motorbike.getModel() + ", " + motorbike.getYear());
        motorbike.info();
        System.out.println("Разница годов выпуска: " + car.yearDifference(motorbike.getYear()));
    }
}
