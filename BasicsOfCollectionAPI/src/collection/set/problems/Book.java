package collection.set.problems;

public class Book implements Comparable<Book>{
	
	//when developer is responsible to write predefined class then implementing comparable inteface is a
	//Good programming practise.and override compareTo method and 
	//Suppose you are not satisfy with your comparable DNSO then you can write your custom order using comparator

	private Integer book_id;
	private String book_name;
	private String author_name;
	private Float book_price;

	public Book() {
	};

	public Book(Integer book_id, String book_name, String author_name, Float book_price) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.author_name = author_name;
		this.book_price = book_price;
	}

	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}

	public Integer getBook_id() {
		return book_id;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setBook_price(Float book_price) {
		this.book_price = book_price;
	}

	public Float getBook_price() {
		return book_price;
	}

	public String toString() {
		return ("book_id= " + this.book_id + "  book_name=" + this.book_name + "   author_name=" + this.author_name
				+ "  book_price=" + this.book_price);
	}

	@Override
	public int compareTo(Book o) {
		return this.getBook_id().compareTo(o.getBook_id());
	}
}
