package stream;

public class UserStatus {
	
	Integer id;
	String openToWork;
	String yearsOfExerience;
	String preferredWorkLocation;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOpenToWork() {
		return openToWork;
	}
	public void setOpenToWork(String openToWork) {
		this.openToWork = openToWork;
	}
	public String getYearsOfExerience() {
		return yearsOfExerience;
	}
	public void setYearsOfExerience(String yearsOfExerience) {
		this.yearsOfExerience = yearsOfExerience;
	}
	public String getPreferredWorkLocation() {
		return preferredWorkLocation;
	}
	public void setPreferredWorkLocation(String preferredWorkLocation) {
		this.preferredWorkLocation = preferredWorkLocation;
	}
	
	@Override
	public String toString() {
		return "UserStatus [id=" + id + ", openToWork=" + openToWork + ", yearsOfExerience=" + yearsOfExerience
				+ ", preferredWorkLocation=" + preferredWorkLocation + "]";
	}


}
