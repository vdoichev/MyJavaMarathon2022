package Main.day12.Task3;
/*
3. *Выполнять в подпапке task3 в day12*
Создать 10 или более экземпляров класса MusicBand, добавить их в список (выбирайте такие
музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен).
Перемешать список. Создать статический метод в классе Task3:
public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп,
основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на
вашем списке из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными после
2000 года).
 */

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Abba", 1967);
        MusicBand musicBand2 = new MusicBand("Руки вверх", 1995);
        MusicBand musicBand3 = new MusicBand("Виагра", 2001);
        MusicBand musicBand4 = new MusicBand("Песняры", 1981);
        MusicBand musicBand5 = new MusicBand("Даха Браха", 2011);
        MusicBand musicBand6 = new MusicBand("На-на", 1994);
        MusicBand musicBand7 = new MusicBand("Ногу свело", 2006);
        MusicBand musicBand8 = new MusicBand("Би-2", 1998);
        MusicBand musicBand9 = new MusicBand("Неангелы", 2007);
        MusicBand musicBand10 = new MusicBand("ТНМК", 2007);
        ArrayList<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);
        System.out.println(musicBands);
        System.out.println(groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        ArrayList<MusicBand> result = new ArrayList<>();
        for (MusicBand band: bands) {
            if (band.getYear()>2000){
                result.add(band);
            }
        }
        return result;

    }

}
