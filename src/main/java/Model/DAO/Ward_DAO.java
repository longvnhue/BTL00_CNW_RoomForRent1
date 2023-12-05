package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.bean.Address;
import Model.bean.Ward;

public class Ward_DAO {
	//GET INFO
	/////////////////////////////1. Get FULL WARD info
	public ArrayList<Ward> getALLWard(){
		ArrayList<Ward>res = new ArrayList<Ward>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			String query = "select * from ward";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Ward(rs.getString("id_ward"), rs.getString("id_district"), rs.getNString("name_ward")));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	//////////////////////////2. Get Ward by ward.id_ward
	public ArrayList<Ward> getWardByID(String id_ward){
		ArrayList<Ward>res = new ArrayList<Ward>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			String query = "select * from ward where ward.id_ward = '" + id_ward + "'";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Ward(rs.getString("id_ward"), rs.getString("id_district"), rs.getNString("name_ward")));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	///////////////////////3. Get Ward by district_name
	/* Query sample:
	 * SELECT ward.id_ward, ward.name_ward, ward.id_district
	 *  	from ward INNER JOIN district on ward.id_district = district.id_district
	 *  	 where district.name_district = N'Quận Cẩm Lệ';
	 * */
	
	public ArrayList<Ward> getWardByDistrict(String name_district){
		ArrayList<Ward>res = new ArrayList<Ward>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Ward(rs.getString("id_ward"), rs.getString("id_district"), rs.getNString("name_ward")));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	//INSET
	public void AddWard(Ward Z) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "insert into ward VALUES(?,?,?)";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setString(1, Z.getId_ward());
				preparedStatement.setNString(2, Z.getId_district());
				preparedStatement.setString(3, Z.getName_ward());
				preparedStatement.executeUpdate();
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	//UPDATE
	public void UpdateWard(Ward Z) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "update ward set id_district = ?, name_ward = ? where id_ward = ?";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setString(1, Z.getId_district());
				preparedStatement.setNString(2, Z.getName_ward());
				preparedStatement.setString(3, Z.getId_ward());
				preparedStatement.executeUpdate();
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	
	//DELETE by ward.id_ward
	public void DeleteWard(String key) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "delete from ward where id_ward = ?";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, key);
				preparedStatement.executeUpdate();
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
								///////////////////////////END///////////////////////////
}
