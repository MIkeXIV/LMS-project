package serviceLayer;

import java.util.*;

import dao.DAO;

import java.io.*;

public class BookOperations {

	// public static ArrayDAO.books<Author> authorDAO.books = new ArrayDAO.books<Author>(); this
	// would be your new DAO.books

	public static void createNewBook(String bookID, int authorID, int publisherID, String bookName) { // need the DAO.books
																										// full name
		// book id is ISBN
		Book newBook = new Book(bookID, authorID, publisherID, bookName); 
		DAO.books.add(newBook);
		System.out.println("Added new book");
	}

	public static void retrieveBook(String searchName) { // need the DAO.books full name
		for (int i = 0; i < DAO.books.size(); i++) { // need the DAO.books full name //work on your spacing! can't read this!!!
													// also, with a DAO.books, it would be DAO.books.size
			if (DAO.books().bookName.equals(searchName)) {
				System.out.println("book name" + DAO.books.get(i).getbookName() + DAO.books.get(i).getbookID(), DAO.books.get(i).getpublisherID(),
						DAO.books.get(i).getAuthorID()); // fix the syntax
			}
		}
	}

	public static void updateBook(String searchID, int authorID, int publisherID, String bookName) {

		for (int i = 0; i < DAO.books.size(); i++) { // need the DAO.books full name
			if (DAO.books.get(i).bookID.equals(searchID)) {
				DAO.books.get(i).setauthorID(authorID);
				DAO.books.get(i).setpublisherID(publisherID);
				DAO.books.get(i).setbookName(bookName);
				System.out.println(DAO.books.get(i).getbookName(), DAO.books.get(i).getbookID(), DAO.books.get(i).getpublisherID(),
						DAO.books.get(i).getAuthorID()); // fix the syntax
				break;
			}
		}

	}

	public static void deleteBook(String searchID) {

		for (int i = 0; i < DAO.books.size(); i++) {

			if (DAO.books.get(i).bookID.equals(searchID)) {
				DAO.books.remove(i);
				System.out.println("Removed book");
				break;
			}
		}
	}

	public static void deleteBooksByAuthorPublisher(int authorID, int pulisherID) {
		for( int i = 0; i < DAO.books.size(); i++) {
			if ((DAO.books.get(i).getauthorID() == authorID) && (authorID != 0)) {
				DAO.books.remove(i)
			}
			if (DAO.books.get(i).getpublisherID() == publisherID && publisherID != 0) {
				DAO.books.remove(i)
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		}
	}
}
