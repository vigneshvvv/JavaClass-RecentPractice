package AbstractConcept;

abstract class ObjectCreation {
	
	//concrete method
	abstract void createAnObject();
	
	//non-concrete method
	void createNewObject() {
		System.out.println("Sample");
	}

}
