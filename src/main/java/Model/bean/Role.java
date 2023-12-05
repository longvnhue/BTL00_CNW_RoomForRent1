package Model.bean;

public class Role {
	private String id_role;
	private String name_role;
	
	public String getId_role() {
		return id_role;
	}
	public void setId_role(String id_role) {
		this.id_role = id_role;
	}
	public String getName_role() {
		return name_role;
	}
	public void setName_role(String name_role) {
		this.name_role = name_role;
	}
	public Role(String id_role, String name_role) {
		super();
		this.id_role = id_role;
		this.name_role = name_role;
	}
	
}
