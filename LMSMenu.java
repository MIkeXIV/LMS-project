import java.util.*;

//this is my service class
public class LMS {

	public static Scanner keyboard;

	public static ArrayList<Author> authorList = new ArrayList<Author>(1000);
	public static ArrayList<Book> bookList = new ArrayList<Book>(1000);
	public static ArrayList<Publisher> publisherList = new ArrayList<Publisher>(1000);
	
	Author author = new Author(authorID, authorName);
	Book book = new Book(bookID, authorID, publisherID, bookTitle);
	Publisher publisher = new Publisher(publisherID, publisherName);

/*
	public static void createBook(String name, String author, String publisher, String userBookID) {
		Book newBook = new Book(userBookID, author, publisher, name);
		bookList.add(newBook);
	}

	public static void deleteBook(String userBookID) {
		for (int i = 0; i < bookList.size(); i++) {

			if (bookList.get(i).bookID.equals(userBookID)) {
				bookList.remove(i);
				break;
			}
		}
	}

	public static void updateBook(String userBookID, String userBookTitle, String userAuthorInput,
			String userPublisherInput) {
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).bookID.equals(userBookID)) {
				bookList.get(i).setauthorID();
				bookList.get(i).setpublisherID(publisherID);
				bookList.get(i).setBookName(userBookTitle);
				System.out.println(bookList.get(i).getBookName(), bookList.get(i).getBookID(),
						bookList.get(i).getpublisherID(), bookList.get(i).getAuthorID()); // fix the syntax
				break;
			}
		}
	}

	public static void printBookInfo(String userBookID) {
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).equals(userBookID)) {
				System.out.println("Title: " + bookList.get(i).getBookName() + "ISBN: " + bookList.get(i).getBookID()
						+ "Publisher: " + bookList.get(i).getpublisherID() + bookList.get(i).getAuthorID());
			}
		}
	}

	public static void createAuthor(String name) {

	}

	public static void addAuthor() {

	}

	public static void deleteAuthor(int userAuthorId) {

	}

	public static void updateAuthor(int userAuthorId) {

	}

	public static void printAuthor(String userAuthorName) {

	}

	public static void createPublisher(String userPublisherName) {

	}

	public static void deletePublisher(int userPublisherID) {

	}

	public static void updatePublisher(int userPublisherID) {

	}

	public static void printPublisherInfo(int userPublisherID) {

	}
*/
	public static void main(String[] args) {

		keyboard = new Scanner(System.in);

		int choice = keyboard.nextInt();

		MenuUI.displayMainMenu();

		switch (choice) {
		case 1: {
			System.out.println("Please input the name of the author that you would like to add.");

			String userAuthorName = keyboard.nextLine();

			System.out.println("Thinking...");

			AuthorOperations.createNewAuthor(userAuthorName);

			System.out.println("Author has been created.");
		}

		case 2: {
			System.out.println("Please input the author ID that you are trying to update.");

			int userAuthorId = keyboard.nextInt();
			
			System.out.println("Please input the Author Name.");

			String userAuthorName = keyboard.nextLine();

			AuthorOperations.updateAuthor(userAuthorId, userAuthorName);

			System.out.println("Thinking...");

			System.out.println("Author has been updated.");
		}

		case 3: {
			System.out.println("Please input the author ID that you are trying to delete.");

			int userAuthorId = keyboard.nextInt();

			AuthorOperations.deleteAuthor(userAuthorId);
			BookOperations.deleteBooksByAuthorPublisher(userAuthorID, 0)

			System.out.println("Thinking...");
			

			System.out.println("Author and all his books have been deleted. So sad to see them go.");
		}

		case 4: {
			System.out.println("Please input the author name that you would like to find information on.");

			String userAuthorName = keyboard.nextLine();

			System.out.println("Thinking...");

			AuthorOperations.retrieveAuthor(userAuthorName);
		}

		case 5: {
			System.out.println("Please input the name of the publisher that you would like to add.");

			String userPublisherName = keyboard.nextLine();

			System.out.println("Thinking...");

			PublisherOperations.createNewPublisher(userPublisherName);
		}

		case 6: {
			System.out.println("Please input the publisherID that you would like to update.");

			int userPublisherID = keyboard.nextInt();

			System.out.println("Please input the publisherID that you would like to update.");
			
			String userPublisherName = keyboard.nextLine()

			PublisherOperations.updatePublisher(userPublisherID, userPublisherName);

			System.out.println("Publisher has been updated.");
		}

		case 7: {
			System.out.println("Please input the publisher ID that you would like to delete.");

			int userPublisherID = keyboard.nextInt();

			System.out.println("Thinking...");

			PublisherOperations.deletePublisher(userPublisherID);
			BookOperations.deleteBooksByAuthorPublisher(0, userPublisherID)

			System.out.println("The publisher has been deleted with all their books. I heard they weren't very good.");
		}

		case 8: {
			System.out.println("Please input the publisher ID that you would like information on.");

			String userPublisherName = keyboard.nextLine();

			System.out.println("Thinking...");

			PublisherOperations.retrievePublisher(userPublisherName);
		}

		case 9: {
			System.out.println("Please input the following information to add a book to the LMS: ");

			System.out.print("Book ISBN: "); // add new line characters

			String userBookID = keyboard.nextLine();

			System.out.print("Book Title: ");

			String userBookTitle = keyboard.nextLine();

			System.out.print("AuthorID: ");

			int userAuthorID = keyboard.nextInt();

			System.out.print("PublisherID: ");

			int userPublisherID = keyboard.nextInt();

			System.out.println("Thinking...");

			BookOperations.createNewBook(userBookID, userAuthorID, userPublisherID, userBookTitle);
		}

		case 10: {
			System.out.println("Please input the following information to modify a book in the LMS: ");

			System.out.print("Book ISBN: "); // add new line characters

			String userBookID = keyboard.nextLine();

			System.out.print("Book Title: ");

			String userBookTitle = keyboard.nextLine();

			System.out.print("AuthorID: ");

			int userAuthorInputID = keyboard.nextLine();

			System.out.print("PublisherID: ");

			int userPublisherID = keyboard.nextLine();

			System.out.println("Thinking...");

			BookOperations.updateBook(userBookID, userAuthorID, userPublisherID, userBookTitle);
		}

		case 11: {
			System.out.println("Please input the book ISBN that you would like to delete.");

			String userBookID = keyboard.nextLine();

			System.out.println("Thinking...");

			BookOperations.deleteBook(userBookID);

			System.out.println("Book has been deleted. 0/5 stars.");
		}

		case 12: {
			System.out.println("Please input the book ISBN that you would like to find.");

			String userBookID = keyboard.nextLine();

			System.out.println("Thinking...");

			BookOperations.retrieveBook(userBookID);
		}

		}
	}
}