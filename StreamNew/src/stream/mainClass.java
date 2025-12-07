package stream;

import java.io.Console;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class mainClass {
	
	
	
	public static void nestedObjectStream(List<UserData> data) {

       List<UserStatus> status = data.stream().map((e) -> e.getStatus()).collect(Collectors.toList());
       System.out.println(status);
       
	}
	
	public static void streamingMaptye(List<UserData> datas) {
		
		Map<String, List<UserData>> usersFiltered= datas.stream().collect(Collectors.groupingBy(UserData :: getRole));
		
	List<List<UserData>> userdataf=	usersFiltered.entrySet().stream().filter((entry) -> (entry.getKey() == "CloudEngineer") || (entry.getKey() == "TESTER")).map((e) -> e.getValue()).collect(Collectors.toList());
	
		
		System.out.println(userdataf);
	}
	
	public static void addToDatabase() throws ClassNotFoundException, SQLException {
		DatabaseConnection connection = new DatabaseConnection();
		Books books = new Books();
		books.setId(6);
		books.setBook_name("Harry");
		books.setAuthor("unknown");
		books.setPrice(500);
		connection.addBookDetails(books);
	}
	
	//method to sort list of integer
	public static void sorted() {
		List<Integer> sam = new ArrayList<Integer>();
		sam.add(1);
		sam.add(10);
		sam.add(2);
		List<Integer> sam2 = sam.stream().sorted().collect(Collectors.toList());
		List<Integer> sam5 = sam.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(sam5);
	}
	
	//method to sort list of string
	public static void sortedString() {
		List<String> sam2 = new ArrayList<String>();
		sam2.add("Hello");
		sam2.add("I");
		sam2.add("Wanted");
		sam2.add("to");
		sam2.add("be sorted");
		
		
		List<String> sam3= sam2.stream().sorted(Comparator.naturalOrder()).toList();
		List<String> sam4=sam2.stream().sorted(Comparator.comparingInt(String::length)).toList();
		List<String> sam5=sam2.stream().sorted(Comparator.comparingInt(String::length).reversed()).toList();
		System.out.println(sam2);
	}
	
	
	
	//method to sort object
	public static void objectSorting() {
		UserStatus sam2 = new UserStatus();
		sam2.setId(1);
		sam2.setOpenToWork("yes");
		sam2.setYearsOfExerience("2");
		UserStatus sam3 = new UserStatus();
		sam3.setId(3);
		sam3.setOpenToWork("yes");
		sam3.setYearsOfExerience("2");
		UserStatus sam4 = new UserStatus();
		sam2.setId(2);
		sam2.setOpenToWork("yes");
		sam2.setYearsOfExerience("2");
		List<UserStatus> userStatus = new ArrayList<UserStatus>();		
		userStatus.add(sam2);
		userStatus.add(sam3);
		userStatus.add(sam4);
		
		userStatus.stream().distinct().sorted(Comparator.comparingInt((e) -> e.getId())).collect(Collectors.toList());
	}
	
	
	//to sort the list of Integer using sort
	
	public static void executionSample() {
		List<Integer> roleNo = new ArrayList<Integer>();
		roleNo.add(1);
		roleNo.add(10);
		roleNo.add(7);
		roleNo.add(6);
		roleNo.add(2);
		List<Integer> sampleInt =  roleNo.stream().sorted().collect(Collectors.toList());
		List<Integer> sampleInt1 =  roleNo.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sampleInt1);
	}
	
	//to sort the string using stream
	
	public static void executeString() {
		List<String> personDet = new ArrayList<String>();
		personDet.add("Hi");
		personDet.add("This");
		personDet.add("issample");
		
		List<String> result = personDet.stream().sorted(Comparator.comparingInt(e -> ((String) e).length()).reversed()).collect(Collectors.toList());
		List<String> resultedWork=  personDet.stream().map(String::toLowerCase).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		List<String> sortedrac =   personDet.stream().filter(e -> (e.startsWith("a")) || (e.startsWith("e")) || (e.startsWith("i"))).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	   System.out.println(sortedrac);
	}
	
	// This method is for distinct stream practice
	public static void distinctPractice() {
		List<Integer> sampleInt = new ArrayList<Integer>();
		sampleInt.add(10);
		sampleInt.add(20);
		sampleInt.add(10);
		sampleInt.add(30);
		
	 List<Integer> sampleOutput = sampleInt.stream().distinct().toList();
	 System.out.println(sampleOutput);
	}
	
	//Distinct method with string type input
	public static void distinctString() {
		List<String> sampleString = new ArrayList<String>();
		sampleString.add("Hello");
		sampleString.add("This");
		sampleString.add("Hello");
		sampleString.add("is sample java class");
		List<String> output = sampleString.stream().distinct().toList();
		System.out.println(output);
		
	}
	
	//Sample method for Limit in stream function
	public static void limitSample() {
		List<Integer> limitsam = new ArrayList<Integer>();
		limitsam.add(10);
		limitsam.add(100);
		limitsam.add(200);
		limitsam.add(30);
		List<Integer> out =   limitsam.stream().limit(2).toList();
		System.out.println(out);
	}
	
	//sample method to reverse the entire list and take first 2 elements using limit in stream
	public static void limitreverse() {
		List<Integer> limitsam = new ArrayList<Integer>();
		limitsam.add(10);
		limitsam.add(100);
		limitsam.add(200);
		limitsam.add(30);
		List<Integer> out = limitsam.stream().sorted(Comparator.reverseOrder()).limit(2).toList();
		System.out.println(out);
	}
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		sorted();
//		sortedString();|
		addToDatabase();
		limitreverse();
		limitSample();
		executionSample();
		executeString();
		sortedString();
		distinctPractice();
		distinctString();
		UserData userData = new UserData();
		userData.setId(1);
		userData.setUserName("user");
		userData.setLastName("null");
		userData.setRole("SW");
		userData.setExperience("5");
		userData.setMobileNo("1234");
		
		UserData userData1 = new UserData();
		userData1.setId(1);
		userData1.setUserName("user1");
		userData1.setLastName("null");
		userData1.setRole("Devops");
		userData1.setExperience("5");
		userData1.setMobileNo("1234");
		
		UserData userData2 = new UserData();
		userData2.setId(1);
		userData2.setUserName("user2");
		userData2.setLastName("null");
		userData2.setRole("Tester");
		userData2.setExperience("5");
		userData2.setMobileNo("1234");
		
		UserData userData3 = new UserData();
		userData3.setId(1);
		userData3.setUserName("user");
		userData3.setLastName("null");
		userData3.setRole("SW");
		userData3.setExperience("3");
		userData3.setMobileNo("1234");
		
		UserData userData4 = new UserData();
		userData4.setId(1);
		userData4.setUserName("user");
		userData4.setLastName("null");
		userData4.setRole("CloudEngineer");
		userData4.setExperience("3");
		userData4.setMobileNo("1234");
		
		List<UserData> userDatas = new ArrayList<UserData>();
		
		userDatas.add(userData);
		userDatas.add(userData1);
		userDatas.add(userData2);
		userDatas.add(userData3);
		userDatas.add(userData4);
		
	List<String> userStream =	userDatas.stream().filter((e) -> e.getExperience() == "5").map((user) -> user.getUserName()).collect(Collectors.toList());
	
	List<String> userStream1 = userDatas.stream().filter((e) -> e.getExperience() == "5").map(UserData :: getUserName).collect(Collectors.toList());
//	System.out.println(userStream);
//	System.out.println(userStream1);

	Map<String, List<UserData>> usersFiltered= userDatas.stream().collect(Collectors.groupingBy(UserData :: getRole));
//	System.out.println(usersFiltered);
	
	 List<List<UserData>> user = usersFiltered.entrySet().stream().filter(entry -> entry.getKey() == "TESTER").map((e) -> e.getValue()).collect(Collectors.toList());
	
		UserStatus userStatus2 = new UserStatus();
		userStatus2.setId(1);
		userStatus2.setOpenToWork("Yes");
		userStatus2.setPreferredWorkLocation("Chennai");
		userStatus2.setYearsOfExerience("5");
	 
	UserData userData5 = new UserData();
	userData5.setId(1);
	userData5.setUserName("user");
	userData5.setLastName("null");
	userData5.setRole("CloudEngineer");
	userData5.setExperience("3");
	userData5.setMobileNo("1234");
	userData5.setStatus(userStatus2);
	
	
	Details details = new Details();
	details.setAddress("new");
	details.setCountry("India");
	details.setPincode("12334");
	userData5.setDetails(details);
	

	
	
	
	UserData userData6 = new UserData();
	userData6.setId(1);
	userData6.setUserName("user");
	userData6.setLastName("null");
	userData6.setRole("Tester");
	userData6.setExperience("3");
	userData6.setMobileNo("1234");
	userData6.setDetails(details);
	
	
	UserStatus userStatus1 = new UserStatus();
	userStatus1.setId(2);
	userStatus1.setOpenToWork("Yes");
	userStatus1.setPreferredWorkLocation("Chennai");
	userStatus1.setYearsOfExerience("6");
	
	userData6.setStatus(userStatus1);
	
	List<UserData> datas = new ArrayList<UserData>();
	datas.add(userData6);
	datas.add(userData5);
	
//	nestedObjectStream(datas);
	streamingMaptye(datas);
	
	List<Details> detailsf = datas.stream().map((e) -> e.getDetails()).collect(Collectors.toList());
	System.out.println(detailsf);
	
	
	
	Set<String> role = new HashSet<String>();
	
	for(UserData user1: userDatas) {
		role.add(user1.getRole());
	}
	
	
	List<UserData> userdataSample = new ArrayList<UserData>();
	
	Map<String, List<UserData>> finalOutput = new HashMap<String, List<UserData>>();
	for(String rl: role) {
		
		for(UserData user1: userDatas) {
			userdataSample = new ArrayList<UserData>();
			if(rl == user1.getRole()) {
				userdataSample.add(user1);
			}
		}
		finalOutput.put(rl, userdataSample);
	}
	
//	System.out.println(finalOutput);
	
	}
	
	

}
