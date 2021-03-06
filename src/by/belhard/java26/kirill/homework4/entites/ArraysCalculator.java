package by.belhard.java26.kirill.homework4.entites;

import java.util.Arrays;

public class ArraysCalculator {
    public int[] summArray;

    public int[] sumArrays(int[] firstArray, int[] secondArray) {
        if (firstArray.length >= secondArray.length) {
            summArray = new int[firstArray.length];
            for (int i = 0; i < firstArray.length; i++) {
                if (i < secondArray.length) summArray[i] = firstArray[i] + secondArray[i];
                else summArray[i] = firstArray[i];
            }
            return summArray;
        } else {
            summArray = new int[secondArray.length];
            for (int i = 0; i < secondArray.length; i++) {
                if (i < firstArray.length) summArray[i] = firstArray[i] + secondArray[i];
                else summArray[i] = secondArray[i];
            }
            return summArray;
        }

    }

    public void concatArrays(String[] firstArray, String[] secondArray) {
        if (firstArray.length >= secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (i < secondArray.length) System.out.print(firstArray[i] + " " + secondArray[i] + " ");
                else System.out.print(firstArray[i]+" ");
            }

        } else {
            for (int i = 0; i < secondArray.length; i++) {
                if (i < firstArray.length) System.out.print(secondArray[i] + " " + firstArray[i] + " ");
                else System.out.print(secondArray[i]+" ");
            }
        }
    }

}
