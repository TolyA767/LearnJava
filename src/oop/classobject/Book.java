package oop.classobject;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int year; // год издания
    private String isbn; // уникальный номер

    // Конструктор для инициализации наших переменных
    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    // Переопределяем метод toString чтобы выводить понятную для нас информацию об объекте
    @Override
    public String toString() {
        return String.format("%s, %s, %d г.", title, author, year);
    }

    @Override
    public boolean equals(Object o) {
        // Если объекты равны по ссылкам - они равны и по содержимому автоматом
        if (this == o) return true;

        // Если 1 из объектов не существует или они разных классов - нет смысла проверять
        if (o == null || getClass() != o.getClass()) return false;

/*      Если же мы не зашли во 2 иф, получается перед нами объект класса Book
        т.к. мы знаем что объект не null и он равен book по getClass() != o.getClass())
*/
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        // Создаём 1 уникальный хэш для 1-го объекта
        return Objects.hash(title, author, year, isbn);
    }

}

