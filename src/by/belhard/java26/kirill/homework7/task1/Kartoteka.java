package by.belhard.java26.kirill.homework7.task1;

public class Kartoteka {
    public static Book[] method(Book[] books, String name, String surname) {


        int i = 0;
        for (Book x : books) {
            for (Author y : x.getAuthors()) {
                if (y.getName().equals(name) && y.getSurname().equals(surname)) {
                    i++;
                }
            }


        }
        Book[] booksresult = new Book[i];
        i = 0;
        for (Book x : books) {
            for (Author y : x.getAuthors()) {
                if (y.getName().equals(name) && y.getSurname().equals(surname)) {
                    booksresult[i] = x;
                    i++;
                }
            }


        }

        return booksresult;
    }
}
