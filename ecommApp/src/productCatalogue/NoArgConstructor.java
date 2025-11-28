package productCatalogue;

public class NoArgConstructor {
	


	String name;
	int id;
	
	public NoArgConstructor() {
		name = "String Content";
		id = 1;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "NoArgConstructor [name=" + name + ", id=" + id + "]";
	}

}
