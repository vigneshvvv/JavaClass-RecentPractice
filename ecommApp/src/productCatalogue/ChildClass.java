package productCatalogue;

public class ChildClass extends superClassExample{
	
	String type;
	


	public ChildClass(String name, String type) {
		super(name);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ChildClass [type=" + type + "]";
	}

}
