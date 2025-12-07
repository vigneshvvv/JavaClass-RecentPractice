package stream;

public class UserData {
	
	Integer id;

	String userName;
	String lastName;
	String Experience;
	String role;
	String mobileNo;
	Details details;
	UserStatus status;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
	public UserStatus getStatus() {
		return status;
	}
	public void setStatus(UserStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserData [id=" + id + ", userName=" + userName + ", lastName=" + lastName + ", Experience=" + Experience
				+ ", role=" + role + ", mobileNo=" + mobileNo + ", details=" + details + ", status=" + status + "]";
	}
	


}
