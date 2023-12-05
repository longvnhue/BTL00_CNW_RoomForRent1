package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.bean.Address;
import Model.bean.District;

public class District_DAO {
	//GET INFO
	////////////////////////////1. Get FULL District info
	public ArrayList<District> GetALLDistrict(){
		ArrayList<District>res = new ArrayList<District>();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			String query = "select * from district";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new District(rs.getString("id_district"), rs.getNString("name_district")));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	
	
	//////////////////////////2. Get District by district.id_district
	public ArrayList<District> GetDistrictByID(String id_district){
		ArrayList<District>res = new ArrayList<District>();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			String query = "select * from district where id_district = '" + id_district + "'";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new District(rs.getString("id_district"), rs.getNString("name_district")));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return res;
	}
	
	
	
	//////////////////////////3. Get District by name key
	public ArrayList<District> GetDistrictByKey(String key){
		ArrayList<District>res = new ArrayList<District>();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			String query = "select * from district where name_district likes N'%" + key + "%'";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new District(rs.getString("id_district"), rs.getNString("name_district")));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return res;
	}
	
	
	//INSET
	public void AddDistrict(District Z) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "insert into district VALUES(?,?)";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setString(1, Z.getId_district());
				preparedStatement.setNString(2, Z.getName_district());
				preparedStatement.executeUpdate();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
	
	//UPDATE
	public void UpdateDistrict(District Z) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "update address set name_district = ? where id_district = ?";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, Z.getName_district());
				preparedStatement.setString(2, Z.getId_district());
				preparedStatement.executeUpdate();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	
	//DELETE
	public void DeleteAddress(String key) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "delete from district where id_district = ?";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setString(1, key);
				preparedStatement.executeUpdate();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
