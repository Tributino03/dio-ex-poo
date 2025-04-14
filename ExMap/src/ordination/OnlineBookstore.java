package ordination;

import java.util.*;

public class OnlineBookstore {

    private Map<String, Book> listBooks;

    public OnlineBookstore() {
        this.listBooks = new HashMap<>();
    }

    public void addBook(String link, String title, String author, double price) {
        listBooks.put(link, new Book(title, author, price));
    }

    public void removeBook(String title) {
        String linkToRemove = null;
        for (Map.Entry<String, Book> entry : listBooks.entrySet()) {
            if (entry.getValue().getTitle().equalsIgnoreCase(title)) {
                linkToRemove = entry.getKey();
                break;
            }
        }
        if (linkToRemove != null) {
            listBooks.remove(linkToRemove);
        }
    }

    public Map<Double, Book> displayBooksSortedByPrice() {
        Map<Double, Book> sortedByPrice = new TreeMap<>();

        for (Map.Entry<String, Book> entry : listBooks.entrySet()) {
            sortedByPrice.put(entry.getValue().getPrice(), entry.getValue());
        }

        return sortedByPrice;
    }

    public Map<String, List<Book>> searchBooksByAuthor(String author) {
        Map<String, List<Book>> booksByAuthor = new HashMap<>();
        
        for (Book book : listBooks.values()) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.computeIfAbsent(author, k -> new ArrayList<>()).add(book);
            }
        }
        
        return booksByAuthor;
    }

    public Book mostExpensiveBook() {
        double highPrice = Double.MIN_VALUE;
        Book mostExpensive = null;
        for (Book book : listBooks.values()) {
            if (book.getPrice() > highPrice) {
                highPrice = book.getPrice();
                mostExpensive = book;
            }
        }
        return mostExpensive;
    }

    public Book findCheapestBook() {
        double lowerPrice = Double.MAX_VALUE;
        Book cheap = null;
        for (Book book : listBooks.values()) {
            if (book.getPrice() < lowerPrice) {
                lowerPrice = book.getPrice();
                cheap = book;
            }
        }
        return cheap;
    }

    public static void main(String[] args) {
        
        OnlineBookstore bookstore = new OnlineBookstore();

        bookstore.addBook("link1", "Harry Potter", "J.K. Rowling", 39.90);
        bookstore.addBook("link2", "The Hobbit", "J.R.R. Tolkien", 29.90);
        bookstore.addBook("link3", "The Catcher in the Rye", "J.D. Salinger", 19.90);
        bookstore.addBook("link4", "1984", "George Orwell", 24.90);
        bookstore.addBook("link8", "Harry Potter", "J.K. Rowling", 60.90);
        bookstore.addBook("link9", "Harry Potter e A Pedra Filossofal", "J.K. Rowling", 79.90);
        bookstore.addBook("link0", "Harry Potter e A ordem da Fenix", "J.K. Rowling", 59.90);

        bookstore.displayBooksSortedByPrice();

        System.out.println("Author Books: " + bookstore.searchBooksByAuthor("J.K. Rowling"));

        System.out.println("Book expensive: "+ bookstore.mostExpensiveBook());
        System.out.println("Book cheap: " + bookstore.findCheapestBook());

        bookstore.removeBook("The Hobbit");

        System.out.println(bookstore.listBooks);
    }
}
