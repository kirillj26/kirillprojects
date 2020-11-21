package by.belhard.java26.kirill;

import java.util.Arrays;

public class homework3 {
    public static void main(String[] args) {
        //первое задание
        int[] array1 = {2 ,4 ,4, 4, 66, 34, 10, 25, 30 ,40};
        double summ=0;
        double srednie;
        System.out.println(Arrays.toString(array1));
        for(int i=0;i<array1.length;i++){
        summ+=array1[i];
        }
        srednie=summ/array1.length;
        System.out.println("сумма всех элементов "+summ);
        System.out.println("среднее значение всех элементов "+srednie);
        System.out.println();
        //со звездочкой*
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        double mediana=(array1[array1.length/2-1]+array1[array1.length/2])/2d;
        System.out.println("медиана "+mediana);
        System.out.println();
        //второе задание
        int n=5;
        int intStart = 5;
        int scet=1;
        int scet2=1;
        int[][] array2 = new int[n][];
        for(int i=0;i<n;i++) array2[i] = new int[i+1];

        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[i].length;j++){
                array2[i][j]+=scet*intStart;
                scet*=2;
            }
            System.out.println(Arrays.toString(array2[i]));
        }
        System.out.println();
        //со звездочкой*
        for(int i=0;i<array2.length;i++){
            for(int j=array2[i].length-1;j>=0;j--){
                array2[i][j]=0;
                array2[i][j]+=scet2*intStart;
                scet2*=2;

            }
            System.out.println(Arrays.toString(array2[i]));
        }
        System.out.println();
        //третье задание
        int[] array3 = new int[100];
        for(int i=0;i<array3.length;i++){
            array3[i]=i+1;
            if(array3[i]%3==0 && array3[i]%7==0) System.out.print(" "+array3[i]);

        }
        System.out.println("\n");
        //1*
        for(int i=0;i<array3.length;i++){
            if(array3[i]%5==0 ^ array3[i]%7==0) System.out.print(" "+array3[i]);
        }
        System.out.println("\n");
        //2*
        for(int i=0;i<array3.length;i++){
            if(9<array3[i] && array3[i]<20){
                if(array3[i]%5==0 ^ array3[i]%7==0) System.out.print(" "+array3[i]);
                if(array3[i]==19)System.out.println();
            }
            if(29<array3[i] && array3[i]<40){
                if(array3[i]%5==0 ^ array3[i]%7==0) System.out.print(" "+array3[i]);
                if(array3[i]==39)System.out.println();
            }
            if(49<array3[i] && array3[i]<60){
                if(array3[i]%5==0 ^ array3[i]%7==0) System.out.print(" "+array3[i]);
                if(array3[i]==59)System.out.println();
            }
            if(69<array3[i] && array3[i]<80){
                if(array3[i]%5==0 ^ array3[i]%7==0) System.out.print(" "+array3[i]);
                if(array3[i]==79)System.out.println();
            }
            if(89<array3[i] && array3[i]<100){
                if(array3[i]%5==0 ^ array3[i]%7==0) System.out.print(" "+array3[i]);
                if(array3[i]==99)System.out.println();
            }

        }
    }
}
