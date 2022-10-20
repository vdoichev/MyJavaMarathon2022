package Main.day8;
/*
1. Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка,
полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
(0 + “ “ + 1 + “ “ + 2 + ... + 20000).
После создания такой строки, вызов System.out.println() на этой строке должен вывести в
консоль сразу все числа из диапазона:
0 1 2 3 4 5 6 7 8 9 10 11 12 ... 19995 19996 19997 19998 19999 20000
Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных
строк (класс String) и использовании StringBuilder, реализуйте описанную задачу этими двумя способами,
замеряя время работы программы.
 */

import java.time.Duration;
import java.time.Instant;

public class Task1 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        String str = "";
        for (int i = 0; i < 20000; i++) str = str + " " + i;
        //System.out.println(str);
        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();
        System.out.println("Прошло времени для String, мс: " + elapsed);


        Instant start1 = Instant.now();
        StringBuilder str1 = new StringBuilder(20000);
        for (int i = 0; i < 20000; i++) {
            str1.append(" ").append(i);
        }
//        System.out.println(str1);
        Instant finish1 = Instant.now();
        long elapsed1 = Duration.between(start1, finish1).toMillis();
        System.out.println("Прошло времени для StringBuilder, мс: " + elapsed1);
    }
}
