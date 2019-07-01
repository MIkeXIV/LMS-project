package serviceLayer;

import models.*;
import java.util.*;
import dao.DAO;
import java.io.*;


public class PublisherOperations {
	
public static double createNewPublisher(String publisherName) { 
		double passed = 0;
		int publisherID;
		int lastIndex = DAO.publisherList.size() - 1;
		publisherID = DAO.publisherList.get(lastIndex).getpublisherID() + 1;
		Publisher newpublisher = new Publisher(publisherID, publisherName); 
		DAO.publisherList.add(newpublisher);
		System.out.println("Added new publisher");
		return passed = 1.0;
	}
	
	public static double retrievePublisher(String searchName) { 
		double passed = 0;
		int empty = 0;
		for ( int i = 0; i < DAO.publisherList.size(); i++) { 
			if (DAO.publisherList.get(i).getpublisherName().equals(searchName)) { 
				System.out.print(DAO.publisherList.get(i).getpublisherName() + "...uniqueID...");
				System.out.print(DAO.publisherList.get(i).getpublisherID());
				empty++;
				passed = 1.0;
			}
		}
		if (empty < 1) {
			System.out.println("publisher not found");
		}
		return passed;
	}
	
	public static double updatePublisher(int searchID, String publisherName) {
		double passed = 0;
		int empty = 0;
		for ( int i = 0; i < DAO.publisherList.size(); i++) {  // need the DAO.publisherList full name
			if (DAO.publisherList.get(i).getpublisherID() == searchID) {
				DAO.publisherList.get(i).setpublisherName(publisherName);
				System.out.println("publisher had been updated");
				empty++;
				passed = 1.0;
				break;
			}	
		}
		if (empty < 1) {
			System.out.println("Please enter the correct publisherID");
		}
		return passed;
	}
	
	public static double deletePublisher(int searchID) {
		double passed = 0;
		int empty = 0;
		for ( int i = 0; i < DAO.publisherList.size(); i++) {
			if (DAO.publisherList.get(i).getpublisherID() == searchID) {
				DAO.publisherList.remove(i);
				System.out.println("Removed publisher");
				empty++;
				passed = 1.0;
				break;
			}
		}
		if (empty < 1) {
			System.out.println("Please enter the correct publisherID to delete");
		}
		return passed;
	}
}
