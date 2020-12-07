package by.belhard.java26.kirill.homework7.task3;

public class Rectangle extends Figure{
    protected double a, b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double square() {
        return a * b;
    }

    public double perimetr() {
        return (a + b) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
