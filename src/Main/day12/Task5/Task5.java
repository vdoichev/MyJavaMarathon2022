package Main.day12.Task5;
/*
5. *Выполнять в подпапке task5 в day12
Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не
только имя, но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса
MusicArtist. Необходимо реализовать класс MusicArtist и доработать класс MusicBand(создать копию класса)
таким образом, чтобы участники были - объекты класса MusicArtist. После этого, надо сделать то же самое,
что и требовалось в 4 задании - слить две группы и проверить состав групп после слияния. Методы для
слияния и для вывода участников в консоль необходимо тоже переработать, чтобы они работали с объектами
класса MusicArtist.
 */

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Grace Slick", 1985));
        members1.add(new MusicArtist("Marty Balin", 1967));
        MusicBand musicBand1 = new MusicBand("Abba", 1967,members1);
        musicBand1.printMembers();
        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Сергей Жуков", 1978));
        members2.add(new MusicArtist("Олексій Потєхін", 1981));
        MusicBand musicBand2 = new MusicBand("Руки вверх", 1995, members2);
        musicBand2.printMembers();
        MusicBand.transferMembers(musicBand1,musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }

}
