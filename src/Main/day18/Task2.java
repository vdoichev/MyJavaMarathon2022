package Main.day18;
/*
2. Создайте рекурсивный метод, который принимает на вход единственный аргумент - число, и возвращает
количество цифр 7 в этом числе. Циклы использовать запрещено, можно использовать только рекурсивные вызовы.
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int number){
        String str = Integer.toString(number);
        double i = (double) number/10;

        if (i>0){
            char ch = str.charAt(str.length());
            if (ch == '7'){
                return 1+count7((int)i);
            }else{
                return count7((int)i);
            }
        }else {
            return 0;
        }
    }
}
