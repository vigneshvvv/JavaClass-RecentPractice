package AbstractConcept;

public class MainApp {
	
	public static void main(String[] args) {
		ObjectCreationChild child = new ObjectCreationChild();
//		child.createAnObject();
		
		CreateUserImpl createUserImpl = new CreateUserImpl();
		createUserImpl.createUserObject();
	}

}
