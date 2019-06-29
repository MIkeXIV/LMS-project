package serviceLayer;

import java.util.*;

import dao.DAO;
import models.Author;

import java.io.*;

// DAO.DAO.author
public class AuthorOperations {
	
	public static void createNewAuthor(String authorName) { // need the DAO.author full name
		
		int authorID;
		int lastIndex = DAO.author.size();
		authorID = DAO.author[lastIndex].getauthorID() -1
		Author newAuthor = new Author(authorID, authorName); 
		DAO.author.add(newAuthor);
		
	}
	
	public static void retrieveAuthor(String searchName) { 
		
		for ( int i = 0; i < DAO.author.size(); i++) { 
			if (DAO.author.get(i).getauthorName().equals(searchName)) { 
				System.out.println(DAO.author.get(i).getauthorName(), DAO.author.get(i).getAuthorID());
			}
		}
	}
	
	public static void updateAuthor(int searchID, String AuthorName) {
		
		for ( int i = 0; i < DAO.author.size(); i++) {  
			if (DAO.author.get(i).getauthorID() == searchID) {
				DAO.author.get(i).setauthorName(AuthorName);
				System.out.println(DAO.author.get(i).getauthorName(), DAO.author.get(i).getauthorID());
				break;
			}
		}
		
	}
	
	public static void deleteAuthor(int searchID) {
		
		for ( int i = 0; i < DAO.author.size(); i++) {
			
			if (DAO.author.get(i).getauthorID() == searchID) {
				DAO.author.remove(i);
				System.out.println("Removed author");
				break;
			}
		// delete the authors books
		}
	}

}
