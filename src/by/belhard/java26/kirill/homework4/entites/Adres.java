package by.belhard.java26.kirill.homework4.entites;

public class Adres {
    public String streetName;
    public int nomerDoma;

    public Adres(String streetName, int nomerDoma) {
        this.streetName = streetName;
        this.nomerDoma = nomerDoma;
    }

    public String toString() {
        return
                " streetName " + streetName +
                        "\nnomerdoma " + nomerDoma;
    }
}
