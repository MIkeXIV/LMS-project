package serviceLayer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import dao.DAO;

class PublisherOperationsTest {
	
	double passing, failing;
	@Test
	void testCreateNewPublisher() {
			DAO dao = new DAO();
			dao.initialize();
			passing = PublisherOperations.createNewPublisher("Jon-Jones-Publishing");
			assertEquals(passing, 1.0);
	}

	@Test
	void testRetrievePublisher() {
			DAO dao = new DAO();
			dao.initialize();
			passing = PublisherOperations.retrievePublisher("J.R.R.-Tolkien-Publishing-Company");
			assertEquals(passing, 1.0);
	}

	@Test
	void testUpdatePublisher() {
		DAO dao = new DAO();
		dao.initialize();
		passing = PublisherOperations.updatePublisher(1, "Jon-Jones-Publishing");
		assertEquals(passing, 1.0);
	}

	@Test
	void testDeletePublisher() {
		DAO dao = new DAO();
		dao.initialize();
		passing = PublisherOperations.deletePublisher(1);
		assertEquals(passing, 1.0);
	}

}
