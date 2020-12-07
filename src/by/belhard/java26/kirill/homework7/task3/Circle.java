package by.belhard.java26.kirill.homework7.task3;

public class Circle extends Figure{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double square(){
        return Math.PI*r*r;
    }
    public double perimetr()
    {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
