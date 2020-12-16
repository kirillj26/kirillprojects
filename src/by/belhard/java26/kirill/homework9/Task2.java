package by.belhard.java26.kirill.homework9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        try {
            BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));


            int i = 0;


            try {
                System.out.println("Введите количество строк которые нужно считать с консоли=");
                String input = rdr.readLine();
                i = Integer.parseInt(input);
            } catch (IOException e) {
                e.printStackTrace();
            }

            String[][] splitted = new String[i][];

            for (int j = 0; j < i; j++) {
                try {
                    System.out.println("Введите строку номер=" + (j + 1) + " ");
                    String s = rdr.readLine();
                    splitted[j] = s.split(" ");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            double sumall = 0;
            for (int j = 0; j < i; j++) {
                double sum = Double.parseDouble(splitted[j][1]) * Integer.parseInt(splitted[j][2]);
                sumall += sum;
                System.out.println("Название товара " + splitted[j][0] + " стоимость товара " + sum);
            }
            System.out.println("Сумма всех товаров " + sumall);


            rdr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Bye-bye");
    }
}
