package Model.bean;

public class Motel {
	private String id_motel;
	private String address;
	private String img;
	private String title;
	private double area;
	private String description;
	private int price;
	private String phone_number;
	private int status;
	
	public String getId_motel() {
		return id_motel;
	}
	public void setId_motel(String id_motel) {
		this.id_motel = id_motel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Motel(String id_motel, String address, String img, String title, double area, String description, int price,
			String phone_number, int status) {
		super();
		this.id_motel = id_motel;
		this.address = address;
		this.img = img;
		this.title = title;
		this.area = area;
		this.description = description;
		this.price = price;
		this.phone_number = phone_number;
		this.status = status;
	}
	
}
