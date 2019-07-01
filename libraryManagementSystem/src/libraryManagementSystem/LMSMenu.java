package libraryManagementSystem;

import java.util.*;
import serviceLayer.*;
import dao.DAO;

//this is my service class
public class LMSMenu { // change to LMSMenu

	public static Scanner keyboard;
	public static void initializeMenu() { 

		keyboard = new Scanner(System.in);

		MenuUI.displayMainMenu();
		
		int choice = keyboard.nextInt();

		switch (choice) {
		case 1: {
			System.out.println("Enter the name of the author that you would like to add.");

			String userAuthorName = keyboard.next();

			System.out.println("Processing...");

			AuthorOperations.createNewAuthor(userAuthorName);
			break;
		}

		case 2: {
			System.out.println("Enter the author ID that you are trying to update.");

			int userAuthorId = keyboard.nextInt();
			
			System.out.println("Enter the Author Name.");

			String userAuthorName = keyboard.next();

			AuthorOperations.updateAuthor(userAuthorId, userAuthorName);

			System.out.println("Processing...");
			break;
		}

		case 3: {
			System.out.println("Enter the author ID that you are trying to delete.");

			int userAuthorID = keyboard.nextInt();

			AuthorOperations.deleteAuthor(userAuthorID);
			BookOperations.deleteBooksByAuthorPublisher(userAuthorID, 0);

			System.out.println("Processing...");
			break;
		}

		case 4: {
			System.out.println("Enter the author name to get their unique ID.");

			String userAuthorName = keyboard.next();

			System.out.println("Processing...");

			AuthorOperations.retrieveAuthor(userAuthorName);
			break;
		}

		case 5: {
			System.out.println("Enter the name of the publisher that you would like to add.");

			String userPublisherName = keyboard.next();

			System.out.println("Processing...");

			PublisherOperations.createNewPublisher(userPublisherName);
			break;
		}

		case 6: {
			System.out.println("Enter the publisherID that you would like to update.");

			int userPublisherID = keyboard.nextInt();

			System.out.println("Enter the new publisher name.");
			
			String userPublisherName = keyboard.next();

			PublisherOperations.updatePublisher(userPublisherID, userPublisherName);
			break;
		}

		case 7: {
			System.out.println("Enter the publisher ID that you would like to delete.");

			int userPublisherID = keyboard.nextInt();

			System.out.println("Processing...");

			PublisherOperations.deletePublisher(userPublisherID);
			BookOperations.deleteBooksByAuthorPublisher(0, userPublisherID);
			break;
		}

		case 8: {
			System.out.println("Enter the publisher name that you would like information on.");

			String userPublisherName = keyboard.next();

			System.out.println("Processing...");

			PublisherOperations.retrievePublisher(userPublisherName);
			break;
		}

		case 9: {
			System.out.println("Enter the following information to add a book to the LMS: ");

			System.out.print("Book ISBN: "); // add new line characters

			String userBookID = keyboard.next();

			System.out.print("Book Title: ");

			String userBookTitle = keyboard.next();

			System.out.print("AuthorID: ");

			int userAuthorID = keyboard.nextInt();

			System.out.print("PublisherID: ");

			int userPublisherID = keyboard.nextInt();

			System.out.println("Processing...");

			BookOperations.createNewBook(userBookID, userAuthorID, userPublisherID, userBookTitle);
			break;
		}

		case 10: {
			System.out.println("Enter the following information to modify a book in the LMS: ");

			System.out.print("Book ISBN: "); // add new line characters

			String userBookID = keyboard.next();

			System.out.print("Book Title: ");

			String userBookTitle = keyboard.next();

			System.out.print("AuthorID: ");

			int userAuthorID = keyboard.nextInt();

			System.out.print("PublisherID: ");

			int userPublisherID = keyboard.nextInt();

			System.out.println("Processing...");

			BookOperations.updateBook(userBookID, userAuthorID, userPublisherID, userBookTitle);
			break;
		}

		case 11: {
			System.out.println("Enter the book ISBN that you would like to delete.");

			String userBookID = keyboard.next();

			System.out.println("Processing...");

			BookOperations.deleteBook(userBookID);
			break;
		}

		case 12: {
			System.out.println("Enter the name of the book to get ISBN.");

			String userBookID = keyboard.next();

			System.out.println("Processing...");

			BookOperations.retrieveBook(userBookID);
			break;
		}
		
		case 13: { // this is the exit code
			// call csv writer
			DAO.closeLMS();
			System.exit(0);
		}
		}
	}
}
