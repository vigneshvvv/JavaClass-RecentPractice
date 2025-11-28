package productCatalogue;

public class superClassExample {



	String name;
	
    public superClassExample(String name) {
    	this.name = name;	
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "superClassExample [name=" + name + "]";
	}

}
