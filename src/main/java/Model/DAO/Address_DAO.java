package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.bean.Address;

public class Address_DAO {
	
	//GET INFO
	/////////////////////////////1. Get FULL Address info
	public ArrayList<Address> GetALLAddress(){
		ArrayList<Address>res = new ArrayList<Address>();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			String query = "select * from address";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Address(rs.getNString("address"), rs.getString("id_ward")));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	//////////////////////////2. Get Address by address.address field
	public ArrayList<Address> GetAddressByID(String key_address){
		ArrayList<Address>res = new ArrayList<Address>();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			String query = "select * from address where address = '" + key_address + "'";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Address(rs.getNString("address"), rs.getString("id_ward")));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	
	
	
	//////////////////////////3. Get Address by address.name_ward
	
	/* Query sample:
	 * select address.address, address.id_ward 
					from address inner join ward on address.id_ward = ward.id_ward where 
					ward.name_ward = N'Phường Hòa Khánh Bắc';
	 * */
	public ArrayList<Address> GetAddressByWard(String name_ward){
		ArrayList<Address>res = new ArrayList<Address>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			String query = "select address.address, address.id_ward "
					+ "from address inner join ward on address.id_ward = ward.id_ward where "
					+ "ward.name_ward = '" + name_ward + "'";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Address(rs.getNString("address"), rs.getString("id_ward")));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	
	////////////////////////////4. Get Address by district.name_district
	/* Query sample:
	 * select address.address, address.id_ward
			from address INNER JOIN ward on address.id_ward = ward.id_ward
			INNER JOIN district on ward.id_district = district.id_district
			where district.name_district = N'Quận Hải Châu';
	 * */
	public ArrayList<Address>GetAddressByDistrict(String name_district){
		ArrayList<Address>res = new ArrayList<Address>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			String query = "select address.address, address.id_ward "
					+ "from address INNER JOIN ward on address.id_ward = ward.id_ward "
					+ "INNER JOIN district on ward.id_district = district.id_district "
					+ "where district.name_district = N'" + name_district + "'";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Address(rs.getNString("address"), rs.getString("id_ward")));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	
	
	//INSET
	public void AddAddress(Address Z) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "insert into address VALUES(?,?)";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, Z.getAddress());
				preparedStatement.setString(2, Z.getId_ward());
				preparedStatement.executeUpdate();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
	
	//UPDATE
	public void UpdateAddress(Address Z) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "update address set id_ward = ? where address = ?";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, Z.getId_ward());
				preparedStatement.setString(2, Z.getAddress());
				preparedStatement.executeUpdate();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	
	//DELETE by address.address
	public void DeleteAddress(String key) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "delete from address where address = ?";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, key);
				preparedStatement.executeUpdate();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
													///////////////////////////END///////////////////////////
}
