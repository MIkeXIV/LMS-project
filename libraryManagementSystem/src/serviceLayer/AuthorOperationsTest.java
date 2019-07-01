package serviceLayer;

import static org.junit.jupiter.api.Assertions.*;
import dao.DAO;
import org.junit.jupiter.api.Test;

class AuthorOperationsTest {

	double passing, failing;
	@Test
	void testCreateNewAuthor() {
		DAO dao = new DAO();
		dao.initialize();
		passing = AuthorOperations.createNewAuthor("Jon-Jones");
		assertEquals(passing, 1.0);
	}

	@Test
	void testRetrieveAuthor() {
		DAO dao = new DAO();
		dao.initialize();
		passing = AuthorOperations.retrieveAuthor("J.R.R.-Tolkien");
		assertEquals(passing, 1.0);
	}

	@Test
	void testUpdateAuthor() {
		DAO dao = new DAO();
		dao.initialize();
		passing = AuthorOperations.updateAuthor(1, "Jon-Jones");
		assertEquals(passing, 1.0);
	}

	@Test
	void testDeleteAuthor() {
		DAO dao = new DAO();
		dao.initialize();
		passing = AuthorOperations.deleteAuthor(1);
		assertEquals(passing, 1.0);
	}

}
