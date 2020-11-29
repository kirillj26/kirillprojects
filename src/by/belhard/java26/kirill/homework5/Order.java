package by.belhard.java26.kirill.homework5;

public class Order {
    private String nazvanie;
    private int kolvo;
    private double cena;

    public Order(String nazvanie, int kolvo, double cena) {
        this.nazvanie = nazvanie;
        this.kolvo = kolvo;
        this.cena = cena;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public int getKolvo() {
        return kolvo;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nazvanie='" + nazvanie + '\'' +
                ", kolvo=" + kolvo +
                ", cena=" + cena +
                "}\n";
    }
}
