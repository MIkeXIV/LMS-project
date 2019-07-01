package dao;

import java.util.*;
import models.Author;
import models.Book;
import models.Publisher;

import java.io.*;

public class DAO {
	

		public static Scanner inputStream;

		public static ArrayList<Author> authorList = new ArrayList<Author>(1000);
		public static ArrayList<Book> bookList = new ArrayList<Book>(1000);
		public static ArrayList<Publisher> publisherList = new ArrayList<Publisher>(1000);

		public void initialize() {

			String currentLine = "";
			int max = 1000;
			int min = 1;
			int range = max - min + 1;

			try {
				inputStream = new Scanner(new FileInputStream("Books.csv"));
			}

			catch (FileNotFoundException e) {
				System.out.println("Something has happened and Java cannot find (or open) the input file selected.");
			}
			
			while (inputStream.hasNextLine()) {

				currentLine = inputStream.nextLine();

				String[] delimitedStrings = currentLine.split(",");
				
				String bookID = delimitedStrings[0];
				int authorID = Integer.parseInt(delimitedStrings[1]);
				int publisherID = Integer.parseInt(delimitedStrings[2]);
				String bookTitle = delimitedStrings[3];
				
				Book book = new Book(bookID, authorID, publisherID, bookTitle);
				bookList.add(book);
		
			}
			
			try {
				inputStream = new Scanner(new FileInputStream("Authors.csv"));
			}

			catch (FileNotFoundException e) {
				System.out.println("Something has happened and Java cannot find (or open) the input file selected.");
			}
			
			while (inputStream.hasNextLine()) {

				currentLine = inputStream.nextLine();

				String[] delimitedStrings = currentLine.split(",");
				
				int authorID = Integer.parseInt(delimitedStrings[0]);
				String authorName = delimitedStrings[1];				
				Author author = new Author(authorID, authorName);
				authorList.add(author);
			
			}
			

			try {
				inputStream = new Scanner(new FileInputStream("Publishers.csv"));
			}

			catch (FileNotFoundException e) {
				System.out.println("Something has happened and Java cannot find (or open) the input file selected.");
			}
			
			while (inputStream.hasNextLine()) {

				currentLine = inputStream.nextLine();

				String[] delimitedStrings = currentLine.split(",");
				
				int publisherID = Integer.parseInt(delimitedStrings[0]);
				String publisherName = delimitedStrings[1];
				Publisher publisher = new Publisher(publisherID, publisherName);
				publisherList.add(publisher);
					
			}
			
		}
		
		public static void closeLMS() {
			
			String elements;
			
			try {
				FileWriter csvWriter = new FileWriter("Publishers.csv");
				//List<String> strBookList = new ArrayList<String>();
				//List<String> writeList = new ArrayList<String>();
				for(int i=0; i<publisherList.size(); i++) {
					//strBookList.add(String.valueOf(publisherList.get(i).getpublisherID()));
					//strBookList.add(publisherList.get(i).getpublisherName());
					elements =  "";
					elements = String.valueOf(publisherList.get(i).getpublisherID()) + "," + publisherList.get(i).getpublisherName();
					csvWriter.append(elements);
					csvWriter.append("\n");
				}
				csvWriter.flush();  
				csvWriter.close();
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		try {
								
				FileWriter csvWriter2 = new FileWriter("Authors.csv");
				for (int i = 0; i < authorList.size(); i++) {
					elements = "";
					elements = String.valueOf(authorList.get(i).getID()) + "," + authorList.get(i).getName();
					csvWriter2.append(elements);
					csvWriter2.append("\n");
				}
				csvWriter2.flush();  
				csvWriter2.close();
		}
			
		catch(FileNotFoundException e){
				e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		try {
			FileWriter csvWriter3 = new FileWriter("Books.csv");
			for (int i = 0; i < bookList.size(); i++) {
				elements = "";
				elements = bookList.get(i).getBookID() + "," + String.valueOf(bookList.get(i).getAuthorID()) + "," + String.valueOf(bookList.get(i).getPublisherID()) + "," + bookList.get(i).getName();
				csvWriter3.append(elements);
				csvWriter3.append("\n");
			}
			csvWriter3.flush();  
			csvWriter3.close();  
		}
			
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
