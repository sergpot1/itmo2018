import java.util.Map;

public class Main {


    public static void main(String[] args) {

        Book book = new Book("Tolstoy", "Voyna i mir", 500);
        Library.put(book, 5); // положили 5 книг
        System.out.println(Library.booksMap.get(book)); // проверили, что их 5
        Library.get(book, 2);
        System.out.println(Library.booksMap.get(book)); // проверили, что стало меньше

        //аналогичные проверки для второго ключа/книги
        Book book1 = new Book("Dostoevsky", "Prestuplenie i nakazanie", 200);
        Library.put(book1, 10);
        System.out.println(Library.booksMap.get(book1));
        Library.get(book1, 11);
        System.out.println(Library.booksMap.get(book1));

    }
}
