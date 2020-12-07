package by.belhard.java26.kirill.homework7.task1;

import java.util.Arrays;

public class Book {
    private String name;
    private int numberOfPages;
    private Author[] authors;
    private String format;

    public Book(String name, int numberOfPages, Author[] authors, String format) {
        if (name.isBlank()) this.name = "defaultbook";
        else this.name = name;
        if (numberOfPages > 2) this.numberOfPages = numberOfPages;
        else this.numberOfPages = 100;
        this.authors = authors;
        this.format = format;
    }



    public Author[] getAuthors() {
        return authors;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' + '\n' +
                "numberOfPages=" + numberOfPages + '\n' +
                "authors=" + Arrays.toString(authors) + '\n' +
                "format='" + format + '\'' +
                '}'+'\n';
    }
}
