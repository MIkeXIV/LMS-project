package serviceLayer;

import java.util.*;
import dao.DAO;
import models.Author;
import java.io.*;

// DAO.authorList
public class AuthorOperations {
	
	public static double createNewAuthor(String authorName) { 
		double passed = 0;
		int authorID;
		int lastIndex = DAO.authorList.size() - 1;
		authorID = DAO.authorList.get(lastIndex).getID() + 1;
		Author newAuthor = new Author(authorID, authorName); 
		DAO.authorList.add(newAuthor);
		System.out.println("Author has been created.");
		return passed = 1.0;
		
	}
	
	public static double retrieveAuthor(String searchName) { 
		double passed = 0;
		int empty = 0;
		for ( int i = 0; i < DAO.authorList.size(); i++) { 
			if (DAO.authorList.get(i).getName().equals(searchName)) { 
				System.out.print(DAO.authorList.get(i).getName() + "...uniqueID...");
				System.out.print(DAO.authorList.get(i).getID());
				empty++;
				passed = 1.0;
			}
		}
		if (empty < 1) {
			System.out.println("Author not found");
		}
		return passed;
		
	}
	
	public static double updateAuthor(int searchID, String AuthorName) {
		double passed = 0;
		int empty = 0;
		for ( int i = 0; i < DAO.authorList.size(); i++) {  
			if (DAO.authorList.get(i).getID() == searchID) {
				DAO.authorList.get(i).setName(AuthorName);
				System.out.println("Author has been updated.");
				empty++;
				passed = 1.0;
				break;
			}
		}
		if (empty < 1) {
			System.out.println("Please enter the correct authorID");
		}
		return passed;
	}
	
	public static double deleteAuthor(int searchID) {
		double passed = 0;
		int empty = 0;
		for ( int i = 0; i < DAO.authorList.size(); i++) {
			if (DAO.authorList.get(i).getID() == searchID) {
				DAO.authorList.remove(i);
				System.out.println("Removed author");
				empty++;
				passed = 1.0;
				break;
			}
		}
		if (empty < 1) {
			System.out.println("Please enter the correct authorID to delete");
		}
		return passed;
	}

}
