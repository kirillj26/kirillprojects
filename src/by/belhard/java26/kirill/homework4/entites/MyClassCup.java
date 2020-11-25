package by.belhard.java26.kirill.homework4.entites;

//мой класс кружка
public class MyClassCup {
    public double height;
    public double diametr;
    public String colour;
    public String material;
    public String soderzhimoe="Пусто";
    boolean ruchka;//наличие ручки у кружки

    //Метод наполнить кружку
    public void setSoderzhimoe(String soderzhimoe) {
        this.soderzhimoe = soderzhimoe;
        System.out.println("В кружке находится "+soderzhimoe);
    }
    //Метод помыть кружку
    public void cleanCup(){
        soderzhimoe="Пусто";
        System.out.println("В кружке "+soderzhimoe);
    }
}
