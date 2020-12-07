package by.belhard.java26.kirill.homework7.task3;

public class StartTask3 {
    public static void main(String[] args) {
        Circle ob1 = new Circle(10);
        Rectangle ob2 = new Rectangle(2, 5);
        Square ob3 = new Square(6);
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(ob3);
        System.out.println();
        System.out.println(CalculationUtils.squareCalc(ob1));
        System.out.println(CalculationUtils.perimetrCalc(ob1));
        System.out.println();
        System.out.println(CalculationUtils.squareCalc(ob2));
        System.out.println(CalculationUtils.perimetrCalc(ob2));
        System.out.println();
        System.out.println(CalculationUtils.squareCalc(ob3));
        System.out.println(CalculationUtils.perimetrCalc(ob3));


    }
}
