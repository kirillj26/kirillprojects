package by.belhard.java26.kirill.homework7.task1;

import java.util.Arrays;

public class StartTask1 {
    public static void main(String[] args) {

        Book book1=new Book("Raskazy",458,new Author[]{new Author("Vasya","Petrov",40),
                new Author("Tanya","Avsienko",33)},"84x108/16");

        Book book2=new Book("Skazki",658,new Author[]{new Author("Petya","Vasilev",20),
                new Author("Tanya","Avsienko",33)},"84x108/32");

        Book book3=new Book("Geography",1058,new Author[]{new Author("Olya","Vorobieva",18),
                new Author("Tanya","Avsienko",33)},"84x108/64");
        Book book4=new Book("Math",1458,new Author[]{new Author("Olya","Vorobieva",18),
                new Author("Oleg","Ivanov",33)},"84x108/64");


        Book[] books={book1,book2,book3,book4};

        System.out.println();


        System.out.println(Arrays.toString(Kartoteka.method(books,"Tanya","Avsienko")));
        System.out.println("==================================");
        System.out.println(Arrays.toString(Kartoteka.method(books,"Olya","Vorobieva")));
        System.out.println("==================================");
        System.out.println(Arrays.toString(Kartoteka.method(books,"Ivan","Alekseev")));


    }
}
