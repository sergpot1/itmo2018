import java.util.*;

public class Library {

    static HashMap<Book, Integer> booksMap = new HashMap<>();
    static int maxTotal = 30;
    static int bookTotal;

    public static void put(Book book, int quantity) {
        if (bookTotal + quantity > maxTotal) {
            System.out.println("Иди на хуй");

        } else {
            booksMap.put(book, quantity);
            bookTotal = bookTotal + quantity;
        }
    }

    public static void get(Book book, int quantity) {

        for (Map.Entry<Book, Integer> pair : booksMap.entrySet()) {
            Book key = pair.getKey();

            if (key.equals(book)) {
                if (booksMap.get(book) < quantity) {
                    System.out.println("Мать ебал");
                    break;
                } else {
                    booksMap.put(book, booksMap.get(book) - quantity);
                    // уменьшаем количество книг по ключу
                }

            }
        }
    }
}

