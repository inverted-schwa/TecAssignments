package magicOfBooks;

public class Book {
	public Book(String name, String author, String desc, int bookID) {
		this.authorName=author;
		this.bookName=name;
		this.description=desc;
		this.bookID=bookID;
	}
	
	public void printDetails() {
			System.out.println(this.bookName+" by "+this.authorName+" "+this.description);
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	String bookName;
	String authorName;
	String description;
	int bookID;
}
