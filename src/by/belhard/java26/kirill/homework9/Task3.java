package by.belhard.java26.kirill.homework9;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task3 {

    private static final String MENU_STRING = "арифметическое выражение, например, 3 +11, 21-36, 18/ 5 или 3 * 123\n";

    public static void main(String[] args) {

        try {
            BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

            String input = "";
            String znak = "";
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            while (!"exit".equals(input)) {

                System.out.println(MENU_STRING);

                try {
                    input = rdr.readLine();
                    System.out.println(input);
                    String[] splitted = input.split(" ");
                    System.out.println(Arrays.toString(splitted));

                    /*for(int i=0;i<input.length();i++){
                        sb1.append(input.charAt(i));
                        if(input.charAt(i)=='+')znak="+";
                        if(input.charAt(i)=='-')znak="-";
                        if(input.charAt(i)=='*')znak="*";
                        if(input.charAt(i)=='/')znak="/";
                    }*/


                } catch (IOException e) {
                    e.printStackTrace();
                }


                switch (znak) {
                    case "+":
                        System.out.println("+");
                        break;
                    case "-":
                        System.out.println("-");
                        break;
                    case "*":
                        System.out.println("*");
                        break;
                    case "/":
                        System.out.println("/");
                        break;
                    //default:
                    // System.err.println("Wrong input");
                    //break;
                }
            }

            rdr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Bye-bye");
    }
}


