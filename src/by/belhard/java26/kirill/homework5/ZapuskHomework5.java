package by.belhard.java26.kirill.homework5;

import java.util.Arrays;

public class ZapuskHomework5 {
    public static void main(String[] args) {
        //первое задание
        System.out.println(Arrays.toString(Zadanie1.metod1(1, 2, 5)));
        System.out.println();

        //второе задание
        Player vasya = new Player();
        Player sasha = new Player("Sasha", 2, 2);
        System.out.println(vasya);
        System.out.println(sasha);
        sasha.move(-1, -1);
        sasha.showDistanse();
        sasha.move(4, 4);
        sasha.showDistanse();
        sasha.move(10, -6);
        sasha.showDistanse();

        //третье
        Order[] orders = new Order[3];
        orders[0] = new Order("машинка", 10, 100);
        orders[1] = new Order("ваза", 5, 1000);
        orders[2] = new Order("леденец", 150, 10);
        System.out.println(Arrays.toString(orders));
        System.out.println("общая сумма со скидкой,если она есть=" + OrderProcessing.processing(orders));
        System.out.println();

        //четвертое
        String[] s = {"Пока", "Привет", "автомобиль", "сад", "Я"};
        Zadanie4.vozvrashenieStrok(s, 6);


    }
}
