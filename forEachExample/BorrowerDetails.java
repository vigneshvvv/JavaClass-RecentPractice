package forEachExample;

public class BorrowerDetails {
	
	
	int id;
	String userName;
	int noOfDaysLeft;
	
	public BorrowerDetails(int id, String userName, int noOfDaysLeft) {
		super();
		this.id = id;
		this.userName = userName;
		this.noOfDaysLeft = noOfDaysLeft;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getNoOfDaysLeft() {
		return noOfDaysLeft;
	}

	public void setNoOfDaysLeft(int noOfDaysLeft) {
		this.noOfDaysLeft = noOfDaysLeft;
	}

	@Override
	public String toString() {
		return "BorrowerDetails [id=" + id + ", userName=" + userName + ", noOfDaysLeft=" + noOfDaysLeft + "]";
	}

}
