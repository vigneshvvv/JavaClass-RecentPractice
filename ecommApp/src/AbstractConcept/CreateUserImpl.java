package AbstractConcept;

import ecommApp.UserData;

public class CreateUserImpl implements CreateAnUser, CreateProduct {

	@Override
	public void createUserObject() {
		UserData data = new UserData();
		data.setId(1);
		data.setFirstName("Sample");
		data.setLastName("sample");
		data.setMobNo("24124124");
		data.setUserID(23132);
		System.out.println(data);
		
	}

	@Override
	public void createNewUserObject() {
		UserData data = new UserData();
		data.setId(1);
		data.setFirstName("Sample");
		data.setLastName("sample");
		data.setMobNo("24124124");
		data.setUserID(23132);
		System.out.println(data);
		
	}

	@Override
	public void createProduct() {
		// TODO Auto-generated method stub
		
	}

}
