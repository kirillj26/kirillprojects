package by.belhard.java26.kirill.homework7.task5;


import java.util.ArrayList;
import java.util.List;

public class StartTask5 {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("a");
        a1.add("ab");
        a1.add("abc");
        a1.add("abcd");
        a1.add("abcde");
        System.out.println(a1);
        System.out.println(StartTask5.method(a1, 'z'));
        

    }

    public static List<String> method(List<String> s, char c) {
        List<String> a2 = new ArrayList<>();
        char[] array = {c};
        CharSequence seq = new String(array);
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).contains(seq)) a2.add(s.get(i));
        }
        return a2;
    }
}
