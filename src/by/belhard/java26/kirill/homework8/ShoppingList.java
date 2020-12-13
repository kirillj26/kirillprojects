package by.belhard.java26.kirill.homework8;

import java.util.*;

public class ShoppingList {
    private Map<String, List<String>> map = new HashMap<>();
    private Map<String, Integer> spisok = new HashMap<>();



    public void newOrder(String name, String... shoppinglist) {
        this.map.put(name, Arrays.asList(shoppinglist));
    }
    public void listOfAllPurchases(){
        //Заполняю Map spisok уникальными продуктами
        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            for (String x:entry.getValue()) {
                spisok.put(x,0);
            }
        }
        //Подсчитываю в общем списке Map map количество продуктов каждого типа
        for(Map.Entry<String,Integer> y:spisok.entrySet()){
            int i=0;
            for (Map.Entry<String, List<String>> entry: map.entrySet()) {
                for (String x:entry.getValue()) {
                    if(x.equals(y.getKey()))i++;
                }
            }
            spisok.put(y.getKey(),i);
        }
        System.out.println("Список всех покупок="+spisok);
    }
    @Override
    public String toString() {
        return "ShoppingList{" +
                "\n" + map + "\n" +
                '}';
    }
}
