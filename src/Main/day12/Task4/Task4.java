package Main.day12.Task4;
/*
4. *Выполнять в подпапке task4 в day12*
Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было
добавлять и удалять участников. Под участником понимается строка (String) с именем и фамилией.
Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А переходят
в группу B. Название метода: transferMembers. Этот метод принимает в качестве аргументов два экземпляра
класса MusicBand. Реализовать метод printMembers (в классе MusicBand), выводящий список участников в
консоль. Проверить состав групп после слияния.
 */

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Grace Slick");
        members1.add("Marty Balin");
        MusicBand musicBand1 = new MusicBand("Abba", 1967,members1);
        musicBand1.printMembers();
        List<String> members2 = new ArrayList<>();
        members2.add("Сергей Жуков");
        members2.add("Олексій Потєхін");
        MusicBand musicBand2 = new MusicBand("Руки вверх", 1995, members2);
        musicBand2.printMembers();
        MusicBand.transferMembers(musicBand1,musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
