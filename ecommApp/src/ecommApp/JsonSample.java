package ecommApp;

public class JsonSample {
	
	public static void main(String[] args) {
		
		UserData userData = new UserData();
		userData.setId(1);
		userData.setUserID(1);
		userData.setFirstName("Vignesh");
		userData.setLastName("Kumar");
		userData.setMobNo("1212342313");
		System.out.println(userData.getFirstName());
		UserData userData1 = new UserData();
		userData1.setId(2);
		userData1.setUserID(2);
		userData1.setFirstName("Vignesh");
		userData1.setLastName("Kumar");
		userData1.setMobNo("1212342313");
		System.out.println(userData1);
	}

}
