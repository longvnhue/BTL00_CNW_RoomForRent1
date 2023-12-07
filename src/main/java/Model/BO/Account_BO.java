package Model.BO;

import Model.DAO.Account_DAO;
import Model.bean.Account;

public class Account_BO {
	Account_DAO dao = new Account_DAO();
	
	public Account isExistAccount(String username, String password) {
		return dao.isExistAccount(username, password);
	}
}
