package by.belhard.java26.kirill.homework8;

import java.util.Arrays;
import java.util.List;

public class Task2Start {
    public static void main(String[] args) {

        ShoppingList newlist1=new ShoppingList();
        newlist1.newOrder("Vasya","pelmeni","beer");
        newlist1.newOrder("Tanya","bread","cola","pizza");
        newlist1.newOrder("Petya","pelmeni","beer");
        newlist1.newOrder("Igor","pelmeni","bread","vodka");
        newlist1.newOrder("Olya","bonaqua","cola","pizza");
        System.out.println(newlist1);
        newlist1.listOfAllPurchases();
        System.out.println("\n");
        newlist1.newOrder("Katya","bread","cola","pizza");
        newlist1.newOrder("Natalia","pelmeni","beer");
        System.out.println(newlist1);
        newlist1.listOfAllPurchases();

    }
}
