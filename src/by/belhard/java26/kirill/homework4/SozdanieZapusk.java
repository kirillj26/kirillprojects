package by.belhard.java26.kirill.homework4;

import by.belhard.java26.kirill.homework4.entites.Adres;
import by.belhard.java26.kirill.homework4.entites.ArraysCalculator;
import by.belhard.java26.kirill.homework4.entites.Building;
import by.belhard.java26.kirill.homework4.entites.MyClassCup;

import java.util.Arrays;

public class SozdanieZapusk {
    public static void main(String[] args) {
        //Создание объектов Building;
        Building dom1=new Building("Zhiloy",new Adres("Pervomayskaya",5),
                4,false,"Beton",1988);
        Building dom2=new Building("Promyshlenniy",new Adres("Oktyabrskaya",20),
                4,false,"Beton",1978);
        Building dom3=new Building("Office",new Adres("Denisovskaya",10),
                20,true,"Steklo",2000);

        System.out.println(dom1);
        //Создание MyClassCup и вызов методов
        MyClassCup cup1 = new MyClassCup();
        cup1.setSoderzhimoe("Кола");
        cup1.cleanCup();
        System.out.println("\n");

        //Arrays Calculator sumArrays
        ArraysCalculator cal1=new ArraysCalculator();
        int[] firstInt={-1,5,5,76,53,54,23};
        int[] secondInt={2,5,7,9,10};
        System.out.println(Arrays.toString(cal1.sumArrays(firstInt,secondInt)));
        System.out.println("\n");
        //Arrays Calculator concatArrays
        String[] firstString={"один","два","три","четыре"};
        String[] secondString={"пять","шесть","семь","восемь","девять"};
        cal1.concatArrays(firstString,secondString);

    }
}
