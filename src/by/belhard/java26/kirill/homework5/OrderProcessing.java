package by.belhard.java26.kirill.homework5;

public class OrderProcessing {
    public static double processing(Order[] orders) {
        double summcena = 0;
        double summkolvo = 0;
        for (Order x : orders) {
            summcena += x.getCena() * x.getKolvo();
            summkolvo += x.getKolvo();
        }
        if (summkolvo > 50) summcena *= 0.8;
        else if (summkolvo > 10) summcena *= 0.9;
        return summcena;
    }
}
