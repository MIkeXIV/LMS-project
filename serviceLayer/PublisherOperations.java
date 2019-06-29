package serviceLayer;

import java.util.*;

import dao.DAO;

import java.io.*;


public class PublisherOperations {
	
public static void createNewpublisher(String publisherName) { 
		
		int publisherID;
		int lastIndex = dao.publisher.size-1;
		publisherID = DAO.publisher[lastIndex].getpublisherID() + 1
		publisher newpublisher = new publisher(publisherID, publisherName); 
		DAO.publisher.add(newpublisher);
		
	}
	
	public static void retrievepublisher(String searchName) { 
		
		for ( int i = 0; i < DAO.publisher.size(); i++) { 
			if (DAO.publisher.get(i).getpublisherName().equals(searchName)) { 
				System.out.println(DAO.publisher.get(i).getpublisherName(), DAO.publisher.get(i).getpublisherID());
			}
		}
	}
	
	public static void updatepublisher(int searchID, String publisherName) {
		
		for ( int i = 0; i < DAO.publisher.size(); i++) {  // need the DAO.publisher full name
			if (DAO.publisher.get(i).getpublisherID() == searchID) {
				DAO.publisher.get(i).setpublisherName(publisherName);
				System.out.println(DAO.publisher.get(i).getpublisherName(), DAO.publisher.get(i).getpublisherID());
				break;
			}
			
		}
		
	}
	
	public static void deletepublisher(int searchID) {
		
		for ( int i = 0; i < DAO.publisher.size(); i++) {
			
			if (DAO.publisher.get(i).getpublisherID() == searchID) {
				DAO.publisher.remove(i);
				System.out.println("Removed publisher");
				break;
			}
		// delete the publishers books
		}
	}
}
