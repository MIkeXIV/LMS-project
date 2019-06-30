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
}
