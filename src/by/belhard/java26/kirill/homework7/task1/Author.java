package by.belhard.java26.kirill.homework7.task1;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    private int age;

    public Author(String name, String surname, int age) {
        if (name.isBlank()) this.name = "defaultname";
        else this.name = name;
        if (surname.isBlank()) this.surname = "defaultsurname";
        else this.surname = surname;
        if (age > 2) this.age = age;
        else this.age = 18;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) &&
                Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
