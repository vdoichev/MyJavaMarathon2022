package Main.day11;
/*
“Сборщик” (англ. Picker), с полем salary, только get метод.
 */

public class Picker implements Worker{
    private double salary;
    private final Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary+=80;
        warehouse.setCountOrders(warehouse.getCountOrders()+1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrders()==1500) {
            salary *= 3;
        }
    }
}
