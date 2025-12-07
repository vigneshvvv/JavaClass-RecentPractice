package stream;

import java.util.List;

public class UserDetails {
	
	Integer id;
	String name;
	List<Integer> numbers;
	
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
	public List<Integer> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
	
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", numbers=" + numbers + "]";
	}

}
