package by.belhard.java26.kirill.homework7.task2;

import java.util.Random;

public class StartTusk2 {
    public static void main(String[] args) {

        Human h1=new Human();
        Human h2=new Human();
        Human h3=new Human();
        h1.pet= new Cat();
        h2.pet=new Dog();
        h3.pet= new Fish();
        h1.playWithYourPet();
        h1.playWithAnyPet();
        System.out.println();
        h2.playWithYourPet();
        h2.playWithAnyPet();
        System.out.println();
        h3.playWithYourPet();
        h3.playWithAnyPet();

    }
}
