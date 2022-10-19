package Main.Day2;
/*
3. Реализовать программу No2, используя цикл while.
 */

import java.util.Scanner;

public class Task3 {
    public static void  main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Введите первое число:");
        int a = scan.nextInt();
        //System.out.println("Введите второе число:");
        int b = scan.nextInt();
        int t = a+1;
        while (t < b) {
            if (t % 5 == 0 && t % 10 != 0) {
                System.out.print(t+" ");
            }
            t++;
        }
    }
}
