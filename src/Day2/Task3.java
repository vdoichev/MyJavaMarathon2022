package Day2;
/*
3. Реализовать программу No2, используя цикл while.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scan.nextInt();
        System.out.println("Введите второе число:");
        int b = scan.nextInt();
        while (a <= b) {
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}
