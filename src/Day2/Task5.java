package Day2;
/*
Школьная задача сына)))
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сторону а:");
        int a = scan.nextInt();
        System.out.println("Введите сторону b:");
        int b = scan.nextInt();
        System.out.println("Введите сторону c:");
        int c = scan.nextInt();
        System.out.println("Введите кол-во треугольников:");
        int count = scan.nextInt();

        System.out.println("Периметр одного треугольника P = " + (a + b + c));
        System.out.println("Общая длина гирлянды L = " + (count * (a + b + c)));
    }
}
