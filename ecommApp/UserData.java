package ecommApp;

public class UserData {
	

	private Number id;

	private Number userID;
	private String firstName;
	private String lastName;
	private String mobNo;
	
	public Number getId() {
		return id;
	}
	public void setId(Number id) {
		this.id = id;
	}
	public Number getUserID() {
		return userID;
	}
	public void setUserID(Number userID) {
		this.userID = userID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	
	@Override
	public String toString() {
		return "UserData [id=" + id + ", userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobNo=" + mobNo + "]";
	}

}
