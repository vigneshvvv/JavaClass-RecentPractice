package AbstractConcept;

import ecommApp.UserData;

public class ObjectCreationChild extends ObjectCreation{

	@Override
	void createAnObject() {
		UserData data = new UserData();
		data.setId(1);
		data.setFirstName("Sample");
		data.setLastName("sample");
		data.setMobNo("24124124");
		data.setUserID(23132);
		System.out.println(data);
	}
	
	@Override
	void createNewObject() {
		UserData data = new UserData();
		data.setId(21);
		data.setFirstName("Sample");
		data.setLastName("sample");
		data.setMobNo("24124124");
		data.setUserID(23132);
	}

}
