package serviceLayer;

import java.util.*;
import models.*;
import dao.DAO;
import java.io.*;

public class BookOperations {

	// public static ArrayDAO.bookList<Author> authorDAO.bookList = new ArrayDAO.bookList<Author>(); this
	// would be your new DAO.bookList

	public static double createNewBook(String bookID, int authorID, int publisherID, String bookName) { 
		double passed = 0;
		Book newBook = new Book(bookID, authorID, publisherID, bookName); 
		DAO.bookList.add(newBook);
		System.out.println("Added new book");
		return passed = 1.0;
	}

	public static double retrieveBook(String searchName) { 
		double passed = 0;
		int empty = 0;
		for (int i = 0; i < DAO.bookList.size(); i++) { 
			if (DAO.bookList.get(i).getName().equals(searchName)) {
				System.out.print(DAO.bookList.get(i).getName() +"  "+ DAO.bookList.get(i).getBookID() + "   ");
				System.out.print(DAO.bookList.get(i).getPublisherID());
				System.out.print("  ");
				System.out.print(DAO.bookList.get(i).getAuthorID());
				empty++;
				passed = 1.0;
			}
		}
		if (empty < 1) {
			System.out.println("Book not found");
		}
		return passed;
	}

	public static double updateBook(String searchID, int authorID, int publisherID, String bookName) {
		double passed = 0;
		int empty = 0;
		for (int i = 0; i < DAO.bookList.size(); i++) { 
			if (DAO.bookList.get(i).getBookID().equals(searchID)) {
				DAO.bookList.get(i).setAuthorID(authorID);
				DAO.bookList.get(i).setPublisherID(publisherID);
				DAO.bookList.get(i).setName(bookName);
				System.out.println("updated book");
				empty++;
				passed = 1.0;
				break;
			}
		}
		if (empty < 1) {
			System.out.println("Please enter the correct BookID");
		}
		return passed;
	}

	public static double deleteBook(String searchID) {
		double passed = 0;
		int empty = 0;
		for (int i = 0; i < DAO.bookList.size(); i++) {
			if (DAO.bookList.get(i).getBookID().equals(searchID)) {
				DAO.bookList.remove(i);
				System.out.println("Removed book");
				empty++;
				passed = 1.0;
				break;
			}
		}
		if (empty < 1) {
			System.out.println("Please enter the correct BookID");
		}
		return passed;
	}

	public static double deleteBooksByAuthorPublisher(int authorID, int publisherID) {
		double passed = 0;
		int authCount = 0;
		int pubCount = 0;
		for( int i = 0; i < DAO.bookList.size(); i++) {
			if ((DAO.bookList.get(i).getAuthorID() == authorID) && (authorID != 0)) {
				DAO.bookList.remove(i);
				authCount++;
				passed = 1.0;
				
			}
			if (DAO.bookList.get(i).getPublisherID() == publisherID && publisherID != 0) {
				DAO.bookList.remove(i);
				pubCount++;
				passed = 1.0;
				
			}
		}
		if(authCount > 0) {
			System.out.println("removed all books by authorID");
		}
		if(pubCount > 0) {
			System.out.println("removed all books by publisherID");
		}
		return passed;
	}
}
