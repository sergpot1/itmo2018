import java.util.HashMap;

public class Library {
    private int size = 100;
    private int bookcounter;

    Library() {
        this.booksMap = new HashMap<>();
    }

    public void putBook(Book book, int quantity) {

        if (size > bookcounter + quantity) {
            if (booksMap.containsKey(book)) {
                booksMap.computeIfPresent(book, (k, v) -> v + quantity);
            } else {
                booksMap.put(book, quantity);
            }

            System.out.println(quantity + " books was added to library");
            bookcounter = bookcounter + quantity;

        } else {
            System.out.println("There are too many books");
        }

    }

    public int getBook(Book book, int quantity) {

        if (booksMap.containsKey(book)) {
            if (booksMap.get(book) >= quantity) {
                booksMap.computeIfPresent(book, (k, v) -> v - quantity);
                bookcounter = bookcounter - quantity;
                return quantity;
            } else {
                System.out.println("There are not enough: " + book.getAuthor() + " " + book.getTitle() + " " + book.getPagesNum());
                return 0;
            }
        } else {
            System.out.println("There are no: " + book.getAuthor() + " " + book.getTitle() + " " + book.getPagesNum());
            return 0;
        }

    }

}
