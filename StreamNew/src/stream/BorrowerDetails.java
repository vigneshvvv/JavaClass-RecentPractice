package stream;

public class BorrowerDetails {

	Integer id;
	String name;
	Integer daysLeft;
	
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
	public Integer getDaysLeft() {
		return daysLeft;
	}
	public void setDaysLeft(Integer daysLeft) {
		this.daysLeft = daysLeft;
	}
	
	@Override
	public String toString() {
		return "BorrowerDetails [id=" + id + ", name=" + name + ", daysLeft=" + daysLeft + "]";
	}

}
