package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Account_DAO {
	public boolean isExistAccount(String username, String password) {
		// Nếu muốn trả về 1 Account để lưu vô session thì thay boolean bằng Account
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel", "root", "");
			Statement sm = conn.createStatement();
			String sql = "select * from account";
			ResultSet rs = sm.executeQuery(sql);
			while(rs.next()) {
				if ((username.equals(rs.getString("username")) && password.equals(rs.getString("password"))))
					return true;
			}
			conn.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}
}
