package practice;

public class Specification {

	Integer id;
	String name;
	String type;
	String lifetime;
	boolean isNew;
	
	public Specification(Integer id, String name, String type, String lifetime, boolean isNew) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.lifetime = lifetime;
		this.isNew = isNew;
	}
	
	public Specification() {
		// TODO Auto-generated constructor stub
	}

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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLifetime() {
		return lifetime;
	}
	public void setLifetime(String lifetime) {
		this.lifetime = lifetime;
	}
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	
	@Override
	public String toString() {
		return "Specification [id=" + id + ", name=" + name + ", type=" + type + ", lifetime=" + lifetime + ", isNew="
				+ isNew + "]";
	}

}
