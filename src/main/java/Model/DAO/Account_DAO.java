package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import Model.bean.Account;

public class Account_DAO {
	public Account isExistAccount(String username, String password) {
		Account account = null;
		// Nếu muốn trả về 1 Account để lưu vô session thì thay boolean bằng Account
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel", "root", "Hoangdanh@165");
			Statement sm = conn.createStatement();
			String sql = "select * from account";
			ResultSet rs = sm.executeQuery(sql);
			while(rs.next()) {
				if ((username.equals(rs.getString("username")) && password.equals(rs.getString("password"))))
				account = new Account(username, password, rs.getString("id_role"));
			}
			conn.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return account;
	}
}
