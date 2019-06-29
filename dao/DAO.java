package dao;

public class DAO {
	
	import java.util.*;

import models.Author;
import models.Book;
import models.Publisher;

import java.io.*;

		public static Scanner inputStream;

		public static ArrayList<Author> authorList = new ArrayList<Author>(1000);
		public static ArrayList<Book> bookList = new ArrayList<Book>(1000);
		public static ArrayList<Publisher> publisherList = new ArrayList<Publisher>(1000);

		public static void main(String[] args) {

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

				String[] delimitedStrings = currentLine.split(";");
				
				String bookID = delimitedStrings[0];
				int authorID = delimitedStrings[1];
				int publisherID = delimitedStrings[2];
				String bookTitle = delimitedStrings[3];
				
				Book book = new Book(bookID, authorID, publisherID, bookTitle);
				/*
				String authorName = delimitedStrings[0];
				String bookTitle = delimitedStrings[1];
				String bookID = delimitedStrings[2];
				String publisherName = delimitedStrings[3];
				*/
				
				Author author = new Author(authorID, authorName);
				
				Publisher publisher = new Publisher(publisherID, publisherName);
				
			}
			
			try {
				inputStream = new Scanner(new FileInputStream("Authors.csv"));
			}

			catch (FileNotFoundException e) {
				System.out.println("Something has happened and Java cannot find (or open) the input file selected.");
			}
			
			while (inputStream.hasNextLine()) {

				currentLine = inputStream.nextLine();

				String[] delimitedStrings = currentLine.split(";");
				
				int authorID = delimitedStrings[0];
				String authorName = delimitedStrings[1];				
				Author author = new Author(authorID, authorName);
				/*
				String authorName = delimitedStrings[0];
				String bookTitle = delimitedStrings[1];
				String bookID = delimitedStrings[2];
				String publisherName = delimitedStrings[3];
				*/
			}
			

			try {
				inputStream = new Scanner(new FileInputStream("Publishers.csv"));
			}

			catch (FileNotFoundException e) {
				System.out.println("Something has happened and Java cannot find (or open) the input file selected.");
			}
			
			while (inputStream.hasNextLine()) {

				currentLine = inputStream.nextLine();

				String[] delimitedStrings = currentLine.split(";");
				
				int publisherID = delimitedStrings[0];
				String publisherName = delimitedStrings[1];
				Publisher publisher = new Publisher(publisherID, publisherName);
				/*
				String authorName = delimitedStrings[0];
				String bookTitle = delimitedStrings[1];
				String bookID = delimitedStrings[2];
				String publisherName = delimitedStrings[3];
				*/				
			}
	
}
