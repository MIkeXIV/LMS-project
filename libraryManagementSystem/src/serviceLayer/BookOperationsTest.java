package serviceLayer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dao.DAO;
import dao.DAO;
class BookOperationsTest {
	
	double passing, failing;
	
	@Test
	void testCreateNewBook() {
		DAO dao = new DAO();
		dao.initialize();
		passing = BookOperations.createNewBook("123-321-123", 1, 1, "NewBookTest");
		assertEquals(passing, 1.0);
	}

	@Test
	void testRetrieveBook() {
		DAO dao = new DAO();
		dao.initialize();
		passing = BookOperations.retrieveBook("A-Song-of-Ice-and-Fire");
		assertEquals(passing, 1.0);
	}

	@Test
	void testUpdateBook() {
		DAO dao = new DAO();
		dao.initialize();
		passing = BookOperations.updateBook("123-456-789", 1, 1,"BookNameTest");
		assertEquals(passing, 1.0);
	}

	@Test
	void testDeleteBook() {
		DAO dao = new DAO();
		dao.initialize();
		passing = BookOperations.deleteBook("123-456-789");
		assertEquals(passing, 1.0);
	}

	@Test
	void testDeleteBooksByAuthorPublisher() {
		DAO dao = new DAO();
		dao.initialize();
		passing = BookOperations.deleteBooksByAuthorPublisher(1,0);
		assertEquals(passing, 1.0);
	}

}
