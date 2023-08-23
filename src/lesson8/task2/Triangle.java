package lesson8.task2;

public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    public double halfPerimeter() {
        return perimeter() / 2;
    }

    @Override
    public double square() {
        return Math.sqrt(halfPerimeter() * (halfPerimeter() - a) * (halfPerimeter() - b) * (halfPerimeter() - c));
    }
}
