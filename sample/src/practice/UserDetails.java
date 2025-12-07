package practice;

public class UserDetails {
	

	 Integer id;
	 String name;
	 String password;
	String role;
	String Address;
	String pincode;
	String mobNo;
	
	public UserDetails(Integer id, String name, String password, String role, String address, String pincode,
			String mobNo) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.role = role;
		Address = address;
		this.pincode = pincode;
		this.mobNo = mobNo;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	


}
