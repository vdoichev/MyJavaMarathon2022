package Day2;
/*
1. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner,
число, соответствующее количеству этажей в здании. Используя условный оператор if,
необходимо вывести в консоль сообщение о типе такого дома.
Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более - “Многоэтажный дом”.
Так же, необходимо учесть что может быть введено отрицательное значение,
в таком случае сообщить “Ошибка ввода”.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество этажей в здании:");
        int count = scan.nextInt();
        if (count > 1 && count <= 4){
            System.out.println("Малоэтажный дом");
        } else if (count>4 && count<9) {
            System.out.println("Среднеэтажный дом");
        } else if (count==9) {
            System.out.println("Многоэтажный дом");
        }else {
            System.out.println("Ошибка ввода");
        }
    }
}
