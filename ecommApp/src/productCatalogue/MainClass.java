package productCatalogue;

public class MainClass {
	
	public static void main(String[] args) {
		NoArgConstructor argConstructor = new NoArgConstructor();
		System.out.println(argConstructor);
		
		AllOrgsConstructor allOrgsConstructor = new AllOrgsConstructor(1, "Sample Product", 2);
		System.out.println(allOrgsConstructor);
		
		AllOrgsConstructor allOrgsConstructor1 = new AllOrgsConstructor(1, "Sample Product");
		System.out.println(allOrgsConstructor1);
		
		AllOrgsConstructor allOrgsConstructor2 = new AllOrgsConstructor();
		allOrgsConstructor2.setId(3);
		allOrgsConstructor2.setProductName("new");
		System.out.println(allOrgsConstructor2);
		
		ChildClass childClass = new ChildClass("sample", "product");
		System.out.println(childClass);
	}

}
