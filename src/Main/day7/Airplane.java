package Main.day7;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + this.producer + ", год выпуска: " + this.year + ", длина: " +
                this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.getFuel());
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void compareAirplanes(Airplane a1, Airplane a2) {
        if (a1.length > a2.length) {
            System.out.println("Первый самолет длиннее");
        } else if (a1.length == a2.length) {
            System.out.println("Длины самолетов равны");
        } else {
            System.out.println("Второй самолет длиннее");
        }
    }
}
