package oop.classobject;

public class Library {
    private Book[] books;
    private int count;

    // Конструктор без параметра!
    public Library() {
        books = new Book[10];
        count = 0;
    }


    public boolean addBook(Book book) {
        // Дубликат
        for (int i = 0; i < count; i++) {
            if (book.equals(books[i]))
                return false;
        }

        // Проверка, осталось ли место для новой книги
        if (count >= books.length)
            return false;

        // Если не зашли ни в 1 условие, добавляем
        books[count] = book;
        count += 1;
        return true;
    }


    public String hasBook(Book book) {
        // Сравниваем текующую книгу со всеми книгами массива
        for (int i = 0; i < count; i++) {
            if (book.equals(books[i]))
                return "Книга есть в библиотеке!";
        }
        return "Книги нету в библиотеке!";
    }

    public int getTotalBooks() {
        return count;
    }

    public void printAllBooks() {
        for (int i = 0; i < count; i++)
            System.out.println((i + 1) + ". " + books[i]);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Капитанская дочка", "А.С.Пушкин", 1836, "Yf-703");
        Book b2 = new Book("А зори здесь тихие", "Б.Л.Васильев", 1969, "Gt-874");
        Book b3 = new Book("Война и мир", "Л.Н.Толстой", 1869, "tG-003");
        Book b4 = new Book("Евгений Онегин", "А.С.Пушкин", 1833, "uZ-117");
        Book b5 = new Book("Капитанская дочка", "А.С.Пушкин", 1836, "Yf-703"); // дубликат b1

        Library library = new Library();

        System.out.println("=== Добавление книг ===");
        System.out.println("Добавляем b1: " + library.addBook(b1));
        System.out.println("Добавляем b2: " + library.addBook(b2));
        System.out.println("Добавляем b3: " + library.addBook(b3));
        System.out.println("Добавляем b4: " + library.addBook(b4));
        System.out.println("Добавляем b5 (дубликат b1): " + library.addBook(b5));

        System.out.println("\n=== Проверка наличия ===");
        System.out.println("Есть b1? " + library.hasBook(b1));
        System.out.println("Есть b2? " + library.hasBook(b2));

        Book b6 = new Book("Идиот", "Ф.М.Достоевский", 1869, "rt-555");
        System.out.println("Есть новая книга? " + library.hasBook(b6));

        System.out.println("\n=== Количество книг ===");
        System.out.println("Всего книг: " + library.getTotalBooks());

        System.out.println("\n=== Все книги ===");
        library.printAllBooks();
    }
}
