package Main.day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        System.out.println(warehouse1);
        for (int i = 0; i < 10; i++) {
            picker1.doWork();
            courier1.doWork();
            System.out.println(i + 1 + ". " + warehouse1);
            System.out.println("  З/п Сборщика - " + picker1.getSalary() + ", з/п Курьера - " + courier1.getSalary());
        }

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        System.out.println(warehouse2);
        picker2.doWork();
        courier2.doWork();
        System.out.println(warehouse2);
    }
}
