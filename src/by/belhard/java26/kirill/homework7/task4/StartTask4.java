package by.belhard.java26.kirill.homework7.task4;

import java.util.ArrayList;
import java.util.List;

public class StartTask4 {
    public static void main(String[] args) {
        List<Person> p1=new ArrayList<>();
        p1.add(new Person("Vasya"));
        p1.add(new Person("Petya"));
        p1.add(new Person("Olya"));
        p1.add(new Person("Tanya"));
        p1.add(new Person("Ira"));
        System.out.println(p1);

        System.out.println(StartTask4.method("Olya",p1));
        System.out.println(StartTask4.method("Katya",p1));

    }
    public static Person method(String name,List listName){
        Person k=new Person(name);
        for(int i=0;i< listName.size();i++){
            if(k.equals(listName.get(i)))return (Person)listName.get(i);
        }
        return null;
    }
}
