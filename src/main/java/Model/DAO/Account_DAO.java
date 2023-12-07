package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
<<<<<<< HEAD
=======
import java.util.ArrayList;

>>>>>>> 5f7a9da13e0910d8d535f4f0cf95475d5409439b
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
	
	//GET ALL Account
	public ArrayList<Account> GetALLAccount(){
		ArrayList<Account>res = new ArrayList<Account>();
		
		Connection conn;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel", "root", "");
			Statement sm = conn.createStatement();
			String query = "select * from account";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Account(rs.getString("username"), rs.getString("password"), rs.getString("id_role")));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return res;
	}
	
	
	//INSET (Register)
	public void AddAccount(Account Z) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "insert into role VALUES(?,?,'user')";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, Z.getUsername());
				preparedStatement.setString(2, Z.getPassword());
				preparedStatement.executeUpdate();
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	
	
	//UPDATE (NOT allowed to change role - change Password)
	public void UpdateAccount(String username, String new_password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "update account set password = ? where username = ?";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, new_password);
				preparedStatement.setString(2, username);
				preparedStatement.executeUpdate();
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	
	//DELETE ACCOUNT
	public void DeleteAccount(String username) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "delete from account where username = ?";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setString(1, username);
				preparedStatement.executeUpdate();
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
