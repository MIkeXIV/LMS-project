package models;

public class Book {
	
	private String bookID = "0";
	private int authorID = 	0;
	private int publisherID = 0;
	private String bookName = "NO BOOKNAME";
	
	public String getbookId() { 
		return bookID;
		}
	public void setbookId(String bookID) { 
		this.bookID = bookID;
		}
	
	
	public int getauthorId() { 
		return authorID;
		}
	public void setauthorID(int authorID) { 
		this.authorID = authorID;
		}
	
	
	public int getpublisherID() { 
		return publisherID;
		}
	public void setpublisherId(int publisherID) { 
		this.publisherID = publisherID;
		}
	
	
	public String getbookName() { 
		return bookName;
		}
	public void setName(String bookName) { 
		this.bookName = bookName;
		}
	
	
	public Book() {}
	
	public Book(String bookID, int authorID, int publisherID, String bookName) {
		this.bookID = bookID;
		this.authorID = authorID;
		this.publisherID = publisherID;
		this.bookName = bookName;
	}
}
