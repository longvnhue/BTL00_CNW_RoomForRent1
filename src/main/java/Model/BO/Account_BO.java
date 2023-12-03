package Model.BO;

import Model.DAO.Account_DAO;

public class Account_BO {
	Account_DAO dao = new Account_DAO();
	
	public boolean isExistAccount(String username, String password) {
		return dao.isExistAccount(username, password);
	}
}
