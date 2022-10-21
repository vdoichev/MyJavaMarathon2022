package Main.day9;
/*
2.
Создайте 3 геометрические фигуры: Круг (англ. Circle), Прямоугольник (англ. Rectangle)
и Треугольник (англ. Triangle). Каждая из фигур должна наследоваться от абстрактного класса Фигура
(англ. Figure).
У класса Круг будет одно поле - радиус окружности.
У класса Прямоугольник будет два поля - ширина и высота.
У класса Треугольник будет три поля - длина каждой из сторон.
Для каждого из этих трех классов необходимо реализовать конструктор, который принимает на вход
размерности фигуры и цвет фигуры.
В этих же классах, вам необходимо реализовать два метода (area() и perimeter()). Реализация этих методов
будет разной для каждой из геометрических фигур. Формулы для вычисления площади и периметра легко
находятся в интернете. После того, как геометрические фигуры будут полностью реализованы, вам необходимо
будет реализовать еще один класс - TestFigures. В этом классе, в методе main() должны быть созданы и
помещены в массив следующие геометрические фигуры:
В этом же классе реализуйте два метода:
public static double calculateRedPerimeter(Figure[] figures)
public static double calculateRedArea(Figure[] figures)
Первый метод, принимая на вход массив геометрических фигур, должен вернуть сумму периметров красных фигур.
Второй метод, принимая на вход массив геометрических фигур, должен вернуть сумму площадей красных фигур.
Вызовите эти два метода на массиве figures и выведите результат в консоль.
 */

public class Task2 {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(Task2.calculateRedArea(figures));
        System.out.println(Task2.calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double result = 0.0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                result += figure.perimeter();
            }
        }
        return result;
    }

    public static double calculateRedArea(Figure[] figures) {
        double result = 0.0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                result += figure.area();
            }
        }
        return result;
    }
}
