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
			String query = "SELECT m.id_motel, m.address, m.img, m.title, m.area, m.description, m.price, m.phone_number, m.status"
					+ " from motel m inner join address a on m.address = a.address inner join ward w on a.id_ward = w.id_ward "
					+ "where w.name_ward = N'" + name_ward + "'";
			
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Motel(rs.getString("id_motel"), rs.getNString("address"), rs.getString("img"), rs.getNString("title"), rs.getDouble("area"),
						rs.getNString("description"), rs.getInt("price"), rs.getString("phone_number"), rs.getInt("status")));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	
	/////////////////////////6. Get Motel by name_district
	/*Sample query:
	 * SELECT m.id_motel, m.address, m.img, m.title, m.area, m.description, m.price, m.phone_number, m.status
			from motel m INNER JOIN address a on m.address = a.address INNER JOIN ward w on a.id_ward = w.id_ward INNER JOIN district d on w.id_district = d.id_district
			where d.name_district = N'Quận Liên Chiểu'
	 * */
	public ArrayList<Motel> GetMotelByDistrict(String name_district){
		ArrayList<Motel> res = new ArrayList<Motel>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			String query = "select m.id_motel, m.address, m.img, m.title, m.area, m.description, m.price, m.phone_number, m.status "
					+ "from motel m inner join address a on m.address = a.address inner join ward w on a.id_ward = w.id_ward "
					+ "inner join district d on w.id_district = d.id_district "
					+ "where d.name_district = N'" + name_district + "'";
			
			ResultSet rs = sm.executeQuery(query);
			
			while (rs.next()) {
				res.add(new Motel(rs.getString("id_motel"), rs.getNString("address"), rs.getString("img"), rs.getNString("title"), rs.getDouble("area"),
						rs.getNString("description"), rs.getInt("price"), rs.getString("phone_number"), rs.getInt("status")));
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	
	
	
	///////////////////////////7. Get Motel by ward.name_ward AND district.name_district key
	/*Query Sample
	 * SELECT m.id_motel, m.address, m.img, m.title, m.area, m.description, m.price, m.phone_number, m.status
						from motel m INNER JOIN address a on m.address = a.address INNER JOIN ward w on a.id_ward = w.id_ward
						INNER JOIN district d on w.id_district = d.id_district
						where d.name_district like N'%Liên%' and w.name_ward like N'%Bắc%'
	 * */
	
	public ArrayList<Motel> GetMotel_FilterByWardandDistrict( String district_key, String ward_key){
		ArrayList<Motel> res = new ArrayList<Motel>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			ResultSet rs;
			
			String query = "select m.id_motel, m.address, m.img, m.title, m.area, m.description, m.price, m.phone_number, m.status "
					+ "from motel m inner join address a on m.address = a.address inner join ward w on a.id_ward = w.id_ward "
					+ "inner join district d on w.id_district = d.id_district "
					+ "where d.name_district like CONCAT('%', ?, '%') and w.name_ward like CONCAT('%', ?, '%')";
			
			
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, district_key);
				preparedStatement.setNString(2, ward_key);
				rs = preparedStatement.executeQuery();
				
				while (rs.next()) {
					res.add(new Motel(rs.getString("id_motel"), rs.getNString("address"), rs.getString("img"), rs.getNString("title"), rs.getDouble("area"),
							rs.getNString("description"), rs.getInt("price"), rs.getString("phone_number"), rs.getInt("status")));
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	
	
	
	/////////////////////////////8. Get Motel by ward.name_ward + district.name_district (nullable) + motel.area + motel.price
	/*Query sample:
	 * SELECT m.id_motel, m.address, m.img, m.title, m.area, m.description, m.price, m.phone_number, m.status
						from motel m INNER JOIN address a on m.address = a.address INNER JOIN ward w on a.id_ward = w.id_ward
						INNER JOIN district d on w.id_district = d.id_district
						where d.name_district like N'%Liên%' and w.name_ward like N'%Bắc%'
						and m.area between 30 and 45 and m.price between 1000000 and 2000000

	 * */
	
	public ArrayList<Motel> GetMotel_FullFilter(String district_key, String ward_key, double AreaLower, double AreaUpper, int PriceLower, int PriceUpper){
		ArrayList<Motel> res = new ArrayList<Motel>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			
			String query = "select m.id_motel, m.address, m.img, m.title, m.area, m.description, m.price, m.phone_number, m.status "
					+ "from motel m inner join address a on m.address = a.address inner join ward w on a.id_ward = w.id_ward "
					+ "inner join district d on w.id_district = d.id_district "
					+ "where d.name_district like CONCAT('%', ?, '%') and w.name_ward like CONCAT('%', ?, '%') and m.area between ? and ? "
					+ "and m.price between ? and ?";
			
			
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, district_key);
				preparedStatement.setNString(2, ward_key);
				preparedStatement.setDouble(3, AreaLower);
				preparedStatement.setDouble(4, AreaUpper);
				preparedStatement.setInt(5, PriceLower);
				preparedStatement.setInt(6, PriceUpper);
				ResultSet rs = preparedStatement.executeQuery();
				
				while (rs.next()) {
					res.add(new Motel(rs.getString("id_motel"), rs.getNString("address"), rs.getString("img"), rs.getNString("title"), rs.getDouble("area"),
							rs.getNString("description"), rs.getInt("price"), rs.getString("phone_number"), rs.getInt("status")));
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	
	
	///////////////////////////9. Get Motel by ward.name_ward + district.name_district (nullable) + motel.price
	public ArrayList<Motel> GetMotel_FullFilter(String district_key, String ward_key, int PriceLower, int PriceUpper){
		ArrayList<Motel> res = new ArrayList<Motel>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			
			String query = "select m.id_motel, m.address, m.img, m.title, m.area, m.description, m.price, m.phone_number, m.status "
					+ "from motel m inner join address a on m.address = a.address inner join ward w on a.id_ward = w.id_ward "
					+ "inner join district d on w.id_district = d.id_district "
					+ "where d.name_district like CONCAT('%', ?, '%') and w.name_ward like CONCAT('%', ?, '%') and m.price between ? and ?";
			
			
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, district_key);
				preparedStatement.setNString(2, ward_key);
				preparedStatement.setInt(3, PriceLower);
				preparedStatement.setInt(4, PriceUpper);
				ResultSet rs = preparedStatement.executeQuery();
				
				while (rs.next()) {
					res.add(new Motel(rs.getString("id_motel"), rs.getNString("address"), rs.getString("img"), rs.getNString("title"), rs.getDouble("area"),
							rs.getNString("description"), rs.getInt("price"), rs.getString("phone_number"), rs.getInt("status")));
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	/////////////////////////////////10. Get Motel by ward.name_ward + district.name_district (nullable) + motel.area
	public ArrayList<Motel> GetMotel_FullFilter(String district_key, String ward_key, double AreaLower, double AreaUpper){
		ArrayList<Motel> res = new ArrayList<Motel>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			
			
			String query = "select m.id_motel, m.address, m.img, m.title, m.area, m.description, m.price, m.phone_number, m.status "
					+ "from motel m inner join address a on m.address = a.address inner join ward w on a.id_ward = w.id_ward "
					+ "inner join district d on w.id_district = d.id_district "
					+ "where d.name_district like CONCAT('%', ?, '%') and w.name_ward like CONCAT('%', ?, '%') and m.area between ? and ?";
			
			
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, district_key);
				preparedStatement.setNString(2, ward_key);
				preparedStatement.setDouble(3, AreaLower);
				preparedStatement.setDouble(4, AreaUpper);
				ResultSet rs = preparedStatement.executeQuery();
				
				while (rs.next()) {
					res.add(new Motel(rs.getString("id_motel"), rs.getNString("address"), rs.getString("img"), rs.getNString("title"), rs.getDouble("area"),
							rs.getNString("description"), rs.getInt("price"), rs.getString("phone_number"), rs.getInt("status")));
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return res;
	}
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//INSET
	public void AddMotel(Motel Z) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "insert into motel VALUES(?,?,?,?,?,?,?,?,?)";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setString(1, Z.getId_motel());
				preparedStatement.setNString(2, Z.getAddress());
				preparedStatement.setString(3, Z.getImg());
				preparedStatement.setNString(4, Z.getTitle());
				preparedStatement.setDouble(5, Z.getArea());
				preparedStatement.setNString(6, Z.getDescription());
				preparedStatement.setInt(7, Z.getPrice());
				preparedStatement.setString(8, Z.getPhone_number());
				preparedStatement.setInt(9, Z.getStatus());
				preparedStatement.executeUpdate();
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	

	
	//UPDATE
	public void UpdateMotel(Motel Z) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "update motel set address = ?, img = ?, title = ?, area = ?, description = ?, price = ?, phone_number = ?, status = ?"
					+ " where id_motel = ?";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setNString(1, Z.getAddress());
				preparedStatement.setString(2, Z.getImg());
				preparedStatement.setNString(3, Z.getTitle());
				preparedStatement.setDouble(4, Z.getArea());
				preparedStatement.setNString(5, Z.getDescription());
				preparedStatement.setInt(6, Z.getPrice());
				preparedStatement.setString(7, Z.getPhone_number());
				preparedStatement.setInt(8, Z.getStatus());
				preparedStatement.setString(9, Z.getId_motel());
				preparedStatement.executeUpdate();
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	
	//DELETE
	public void DeleteMotel(String key) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/motel?characterEncoding=UTF-8&useUnicode=true", "root", "");
			Statement sm = conn.createStatement();
			String query = "delete from motel where id_motel = ?";
			try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
				preparedStatement.setString(1, key);
				preparedStatement.executeUpdate();
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
				////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////
}
