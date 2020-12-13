package by.belhard.java26.kirill.homework8;

import java.util.HashSet;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        HashSet<Integer> set=new HashSet<>();
        Random random = new Random();
        for (int i=0;set.size()<10;i++) {
            int j = random.nextInt(20);
            set.add(j);
        }
        int border= random.nextInt(20);
        System.out.println(set);
        System.out.println("border="+border);
        for(int i=0;i< border;i++){
            set.remove(i);
        }

        System.out.println(set);
    }
}
