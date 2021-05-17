package Library;

public class Book {
	private String name;
	private String publisher;
	private String author;
	private long numberOfCopies;

	public Book() {
		super();
	}

	public Book(String name, String publisher, String author, long numberOfCopies) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.numberOfCopies = numberOfCopies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(long numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

}
