package Main.day12.Task5;
/*
Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и
год основания).
 */

import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    private final List<MusicArtist> members;

    public List<MusicArtist> getMembers() {
        return members;
    }

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void transferMembers(MusicBand A, MusicBand B){
        B.members.addAll(A.members);
        A.members.removeAll(B.members);
    }

    public void printMembers(){
        System.out.println(this.members);
    }
}
