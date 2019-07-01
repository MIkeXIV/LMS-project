package libraryManagementSystem;

import dao.DAO;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
		dao.initialize();
		while(true) {
		LMSMenu.initializeMenu();
		}
	}

}
