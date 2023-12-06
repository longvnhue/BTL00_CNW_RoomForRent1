package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.bean.Motel;

public class Motel_DAO {
	//GET INFO
	/////////////////////////////1. Get FULL Motel info
	public ArrayList<Motel> GetALLMotel(){
		ArrayList<Motel> res = new ArrayList<Motel>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "select * from motel";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Motel(rs.getString("id_motel"), rs.getNString("address"), rs.getString("img"), rs.getNString("title"), rs.getDouble("area"), rs.getNString("description"), rs.getInt("price"), rs.getString("phone_number"), rs.getInt("status")));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	
	////////////////////////////2. Get Motel by ID
	public ArrayList<Motel> GetMotelByID(String id){
		ArrayList<Motel> res = new ArrayList<Motel>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "select * from motel where id_motel = '" + id + "'";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Motel(rs.getString("id_motel"), rs.getNString("address"), rs.getString("img"), rs.getNString("title"), rs.getDouble("area"), rs.getNString("description"), rs.getInt("price"), rs.getString("phone_number"), rs.getInt("status")));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	//////////////////////////3. Get Motel by Phone number
	public ArrayList<Motel> GetMotelByPhone(String phone){
		ArrayList<Motel> res = new ArrayList<Motel>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "select * from motel where phone_number = '" + phone + "'";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Motel(rs.getString("id_motel"), rs.getNString("address"), rs.getString("img"), rs.getNString("title"), rs.getDouble("area"), rs.getNString("description"), rs.getInt("price"), rs.getString("phone_number"), rs.getInt("status")));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	
	////////////////////////////4. Get Motel by Address
	public ArrayList<Motel> GetMotelByKeyAddress(String key){
		ArrayList<Motel> res = new ArrayList<Motel>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "select * from motel where address likes '%" + key + "%'";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Motel(rs.getString("id_motel"), rs.getNString("address"), rs.getString("img"), rs.getNString("title"), rs.getDouble("area"), rs.getNString("description"), rs.getInt("price"), rs.getString("phone_number"), rs.getInt("status")));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	
	///////////////////////////5. Get Motel by name_ward
	/*Query Sample:
	 * SELECT motel.id_motel, motel.address, motel.img, motel.title, motel.area, motel.description, motel.price, motel.phone_number, motel.status
			from motel INNER JOIN address on motel.address = address.address INNER JOIN ward on address.id_ward = ward.id_ward
			where name_ward = N'Phường Hòa Minh';
	 * */
	public ArrayList<Motel> GetMotelByWard(String name_ward){
		ArrayList<Motel> res = new ArrayList<Motel>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "";
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Motel(rs.getString("id_motel"), rs.getNString("address"), rs.getString("img"), rs.getNString("title"), rs.getDouble("area"), rs.getNString("description"), rs.getInt("price"), rs.getString("phone_number"), rs.getInt("status")));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	/////////////////////////6. 
	
}
