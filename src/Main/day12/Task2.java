package Main.day12;
/*
2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350. Вывести список.
 */

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i<350;i++){
            if (i < 30 || i > 300) {
                if (i%2==0){
                    arrayList.add(i);
                }
            }
        }
        System.out.println(arrayList);
    }
}
