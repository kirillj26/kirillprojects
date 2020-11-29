package by.belhard.java26.kirill.homework5;

public class Zadanie4 {
    public static void vozvrashenieStrok(String[] s, int k) {
        for (String x : s) {
            if (x.length() >= k) System.out.println(x);
        }
        return;
    }
}
