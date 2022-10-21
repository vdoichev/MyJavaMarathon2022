package Main.day9;

public class Triangle extends Figure{
    private final double lengthA;
    private final double lengthB;
    private final double lengthC;

    public Triangle( double lengthA, double lengthB, double lengthC, String color) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public double area() {
        double p = perimeter()/2;
        return Math.sqrt(p*(p-lengthA)*(p-lengthB)*(p-lengthC));
    }

    @Override
    public double perimeter() {
        return lengthA+lengthB+lengthC;
    }
}
