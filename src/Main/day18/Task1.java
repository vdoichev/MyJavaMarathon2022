package Main.day18;
/*
1. Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом массиве не используя
циклы (необходимо использовать рекурсивные вызовы).
 */

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] numbers, int i) {
        int result = (i < numbers.length)?numbers[i]+recursionSum(numbers, i+1):0;
        return result;
    }
}
