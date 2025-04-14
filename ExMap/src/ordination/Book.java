package ordination;

public class Book implements Comparable<Book>{
	
	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public int compareTo(Book book) {
		return Double.compare(this.price, book.getPrice());
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
