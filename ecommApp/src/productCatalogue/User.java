package productCatalogue;

public class User {
	

	

	Integer id;
	String userName;
	Integer noOfOrder;
	
	
	public User(Integer id, String userName, Integer noOfOrder) {
		super();
		this.id = id;
		this.userName = userName;
		this.noOfOrder = noOfOrder;
	}
	
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
	public Integer getNoOfOrder() {
		return noOfOrder;
	}
	public void setNoOfOrder(Integer noOfOrder) {
		this.noOfOrder = noOfOrder;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", noOfOrder=" + noOfOrder + "]";
	}

}
