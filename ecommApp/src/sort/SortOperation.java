package sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortOperation {
	
	
	public static List<User> generateObject() {
		User user = new User(1, "vignesh", 25);
		User user1 = new User(2, "Kumar", 27);
		User user2 = new User(3, "sa", 19);
		User user3 = new User(4, "sgd", 12);
		List<User> userList = new ArrayList<User>();
		userList.add(user);
		userList.add(user2);
		userList.add(user1);
		userList.add(user3);
		return userList;
		
	}
	
	
	public static void sortSample(List<User> users) {
		
	List<User> filteredUser =users.stream().sorted(Comparator.comparing(User:: getAge)).collect(Collectors.toList());
	List<User> filteredUser2 =users.stream().sorted(Comparator.comparing(User:: getAge).reversed()).collect(Collectors.toList());
	
	List<User> filteredUser3 =users.stream().sorted(Comparator.comparing(User:: getAge).thenComparing(User::getName)).collect(Collectors.toList());
	System.out.println(filteredUser);
	System.out.println("reverserorder"+ filteredUser2);
	System.out.println("then comparing"+ filteredUser3);
		
	}
	
	
	public static void lengthComparing(List<User> users) {
		
		List<User> filteredUser3 =users.stream().sorted((p1, p2) -> Integer.compare(p1.getName().length(), p2.getName().length())).collect(Collectors.toList());
		System.out.println("length comparing"+ filteredUser3);
		
	}
	
	
	
	public static void main(String[] args) {
		List<User> users =  generateObject();
		System.out.println(users);
		sortSample(users);
		lengthComparing(users);
		
		
	}

}
