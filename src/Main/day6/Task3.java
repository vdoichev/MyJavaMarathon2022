package Main.day6;
/*
3. Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”.
Создать класс Student (Студент) с полем “Имя”.
Каждый класс имеет конструктор (с параметрами), set и  get методы по необходимости,
а также у преподавателя есть метод evaluate (оценить студента), принимающий в качестве аргумента студента,
и работающий следующим образом: внутри метода случайным образом генерируется число от 2 до 5,
выводится строка: "Преподаватель ИМЯ ПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯ СТУДЕНТА по предмету
ИМЯ ПРЕДМЕТА на оценку ОЦЕНКА."
Все слова, написанные большими буквами, должны быть заменены соответствующими значениями.
ОЦЕНКА должна принимать значения "отлично”, "хорошо”, "удовлетворительно" или "неудовлетворительно",
в зависимости от значения случайного числа.
Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки студента,
передав студента в качестве аргумента метода.
 */

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ivanov Ivan", "Informatika");
        Student student = new Student("Petrov Petr");
        teacher.evaluate(student, -1);
    }
}
