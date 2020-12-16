package by.belhard.java26.kirill.homework9.Task1;

import java.io.*;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {


        try {
            BufferedReader rdr = new BufferedReader(new FileReader("src/by/belhard/java26/kirill/homework9/Task1/Task1Input.in"));
            BufferedWriter wrt = new BufferedWriter(new FileWriter("src/by/belhard/java26/kirill/homework9/Task1/Task1Output.out"));
            while (rdr.ready()) {
                StringBuilder sb = new StringBuilder();
                String kub = rdr.readLine();
                String[] splitted = kub.split(" ");
                int[] result=new int[splitted.length];
                int i=0;
                for (String s:splitted) {

                    result[i]= (int) Math.pow(Integer.parseInt(s),3);
                    sb.append(result[i]);
                    sb.append(' ');
                    i++;

                }
                System.out.println(sb);
                wrt.write(String.valueOf(sb));
                wrt.newLine();

            }

            rdr.close();
            wrt.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
