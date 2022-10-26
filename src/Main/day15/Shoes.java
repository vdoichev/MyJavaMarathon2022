package Main.day15;

public class Shoes {
    private final String model;
    private final int size;
    private final double balance;

    public Shoes(String model, int size, double balance) {
        this.model = model;
        this.size = size;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "model='" + model + '\'' +
                ", size=" + size +
                ", balance=" + balance +
                '}';
    }
}
