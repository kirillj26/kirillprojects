package by.belhard.java26.kirill.homework5;

public class Zadanie1 {

    public static double[] metod1(double startTemp, double tempDiff, int days) {
        double[] array1 = new double[days];
        array1[0] = startTemp;
        for (int i = 1; i < days; i++) {
            array1[i] = array1[i - 1] + (Math.random() - 0.5) * 2 * tempDiff;
        }
        return array1;
    }
}
