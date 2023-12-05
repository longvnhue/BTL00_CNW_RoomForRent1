package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.bean.Role;


public class Role_DAO {
	//GET INFO
	/////////////////////////////1. Get FULL ROLE info
	public ArrayList<Role> GetALLRole(){
		ArrayList<Role> res = new ArrayList<Role>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			String query = "select * from role";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Role(rs.getString("id_role"), rs.getString("name_role")));
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	//INSET Role
	public void AddRole(Role Z) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "insert into role VALUES(?,?)";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, Z.getId_role());
				preparedStatement.setString(2, Z.getName_role());
				preparedStatement.executeUpdate();
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	
	//UPDATE Role
	public void UpdateRole(Role Z) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "update role set name_role = ? where id_role = ?";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, Z.getName_role());
				preparedStatement.setString(2, Z.getId_role());
				preparedStatement.executeUpdate();
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	
	//DELETE Role by role.id_role
	public void DeleteRole(String key) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "delete from role where id_role = ?";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, key);
				preparedStatement.executeUpdate();
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
								///////////////////////END///////////////////////
}
