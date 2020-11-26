package by.belhard.java26.kirill.homework4.entites;

import by.belhard.java26.kirill.homework4.entites.Adres;

public class Building {
    public String naznachenie;
    public Adres adres;
    public int kolichEtazh;
    public boolean lift;
    public String material;
    public int godPostroyki;

    public Building(String naznachenie, Adres adres, int kolichEtazh, boolean lift, String material, int godPostroyki) {
        this.naznachenie = naznachenie;
        this.adres = adres;
        this.kolichEtazh = kolichEtazh;
        this.lift = lift;
        this.material = material;
        this.godPostroyki = godPostroyki;
    }

    public String toString() {
        return "=====================\n" +
                "\nBuilding " +
                "\nnaznachenie " + naznachenie +
                "\nadres " + adres +
                "\nkolichEtazh " + kolichEtazh +
                "\nlift " + lift +
                "\nmaterial " + material +
                "\ngodPostroyki " + godPostroyki +
                "=====================\n";
    }
}
