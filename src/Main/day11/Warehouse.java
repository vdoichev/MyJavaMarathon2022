package Main.day11;
/*
“Склад” (англ. Warehouse). Поля: countOrder(количество собранных заказов), balance (доход от доставленных
заказов). Get и set методы для обоих полей. Для получения информации о значениях полей склада
переопределите метод toString().
 */

public class Warehouse {
    private int countOrders;
    private double balance;

    public int getCountOrders() {
        return countOrders;
    }

    public void setCountOrders(int countOrders) {
        this.countOrders = countOrders;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrders +
                ", balance=" + balance +
                '}';
    }
}
