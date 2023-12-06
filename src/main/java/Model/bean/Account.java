package Model.bean;

public class Account {
	private String username;
	private String password;
	private String id_role;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId_role() {
		return id_role;
	}
	public void setId_role(String id_role) {
		this.id_role = id_role;
	}
	public Account(String username, String password, String id_role) {
		super();
		this.username = username;
		this.password = password;
		this.id_role = id_role;
	}
	
}
