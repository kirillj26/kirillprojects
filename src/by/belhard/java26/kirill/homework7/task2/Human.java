package by.belhard.java26.kirill.homework7.task2;

import java.util.Random;

public class Human {
    Pet pet;



    public void playWithYourPet() {
        System.out.println("Играть со своим питомцем");
        pet.play();
    }

    public void playWithAnyPet() {
        Pet anypet;
        System.out.println("Играть с любым питомцем");
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 0){anypet=new Cat();anypet.play();}
        if (i == 1){anypet=new Dog();anypet.play();}
        if (i == 2){anypet=new Fish();anypet.play();}

    }
}
