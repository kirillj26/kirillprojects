package by.belhard.java26.kirill.homework6;

import java.util.Arrays;

public class StringStorage {
    private String[] string;
    private String s;

    public StringStorage() {
        this.string = new String[]{"Массив из", " 3 строк", " по умолчанию"};
    }

    public StringStorage(String[] string) {
        this.string = string;
    }

    public void changeOrder(int i, int j) {
        if (i < 0 || j >= this.string.length || j < 0 || i >= this.string.length) {
            System.out.println("Не валидное  значение индексов");
            System.out.println("Значение индексов массива от 0 до "+(this.string.length-1));
        } else {
            s = this.string[i];
            this.string[i] = this.string[j];
            this.string[j] = s;
        }
    }

    @Override
    public String toString() {
        return "StringStorage{" + Arrays.toString(string) +
                '}';
    }
}
