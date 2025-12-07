package stream;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapSeries {
	
	
	//Method to create a List of object 
	public static List<UserDetails> creatingObject() {
		List<UserDetails> detailsArr = new ArrayList<UserDetails>();
		UserDetails details = new UserDetails();
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		details.setId(1);
		details.setName("Vignesh");
		details.setNumbers(integers);
		UserDetails details2 = new UserDetails();
		List<Integer> integers2 = new ArrayList<Integer>();
		integers2.add(1);
		integers2.add(2);
		integers2.add(3);
		integers2.add(4);
		details2.setId(2);
		details2.setName("Vignesh");
		details2.setNumbers(integers2);
		detailsArr.add(details);
		detailsArr.add(details2);
		return detailsArr;
		
	}
	
	
	//This method is to filter the contents using flatmap
	public static void flatmapOperation(List<UserDetails> details) {
	List<Integer> ints = details.stream().filter(e -> e.getName().equalsIgnoreCase("Vignesh")).flatMap(userDetails -> userDetails.getNumbers().stream()).collect(Collectors.toList());
	System.out.println(ints);
	
	
	}
	
	public static List<BookDetails> createLibraryObject() {
		List<BorrowerDetails> borrowerDetailsList = new ArrayList<BorrowerDetails>();
		
		BorrowerDetails borrowerDetails = new BorrowerDetails();
		borrowerDetails.setId(1);
		borrowerDetails.setName("Ramesh");
		borrowerDetails.setDaysLeft(2);
		
		BorrowerDetails borrowerDetails2 = new BorrowerDetails();
		borrowerDetails2.setId(2);
		borrowerDetails2.setName("Ramesh");
		borrowerDetails2.setDaysLeft(3);
		
		borrowerDetailsList.add(borrowerDetails);
		borrowerDetailsList.add(borrowerDetails2);
		
		List<BookDetails> bookDetailsList = new ArrayList<BookDetails>();
		BookDetails bookDetails = new BookDetails();
		bookDetails.setId(1);
		bookDetails.setBookName("Subtle Art of Not giving");
		bookDetails.setAuthor("unknown");
		bookDetails.setBorrowerDetails(borrowerDetailsList);
		BookDetails bookDetails2 = new BookDetails();
		bookDetails2.setId(2);
		bookDetails2.setBookName("Sapiens");
		bookDetails2.setAuthor("unknown");
		bookDetails2.setBorrowerDetails(borrowerDetailsList);
		bookDetailsList.add(bookDetails);
		bookDetailsList.add(bookDetails2);
		return bookDetailsList;
	}
	
	public static void filteringTheLibrary(List<BookDetails> bookDetails) {
		List<BorrowerDetails> bookBorrower=   bookDetails.stream().flatMap(book -> book.getBorrowerDetails().stream())
		.filter(e -> e.getDaysLeft() < 4).collect(Collectors.toList());
		
		//To collect the map of book name and list of borrower person who has 2 days left to return it 
		Map<String, List<BorrowerDetails>> outputSeg  = bookDetails.stream().
				collect(Collectors.toMap(BookDetails::getBookName, book -> book.getBorrowerDetails().stream().filter(e -> e.getDaysLeft() < 2).collect(Collectors.toList())));
		
		//To give the person name according to the days left to return the books
	Map<Integer, List<String>> mappingEg =bookBorrower.stream().collect(Collectors.groupingBy(BorrowerDetails::getDaysLeft, Collectors.mapping(BorrowerDetails::getName, Collectors.toList())));
		
		System.out.println(mappingEg.toString());
		
		
		//To filter the days left and number of person count using Collectors.counting method
   	 Map<Integer, Long> sam = 	bookBorrower.stream().collect(Collectors.groupingBy(BorrowerDetails::getDaysLeft, Collectors.counting()));
   	 System.out.println(sam);
   	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
   	 
   
		
	 
	}
	
	//Example for ForEach method
	public static Map<String, List<BorrowerDetails>>  forEachExample(List<BookDetails> bookDetails) {
		 Map<String, List<BorrowerDetails>> forEachExample = new HashMap<String, List<BorrowerDetails>>();
	   	 
	   	 bookDetails.forEach(e -> {
	   		 List<BorrowerDetails> borrowerDetails =
	   		 e.getBorrowerDetails().stream().filter(person -> person.getDaysLeft() < 4).collect(Collectors.toList());
	   		 forEachExample.put(e.getBookName(), borrowerDetails);
	   	 });
	   	 
	   	 return forEachExample;
	}
	
	

	
	public static void main(String[] args) throws SQLException {
		
		List<UserDetails> details = creatingObject();
		System.out.println(details);
		flatmapOperation(details);
		
		List<BookDetails> bookDetails = createLibraryObject();
		System.out.println(bookDetails);
		
		filteringTheLibrary(bookDetails);
		
		Map<String, List<BorrowerDetails>> forEachResult=  forEachExample(bookDetails);
		System.out.println("forEachResult is" + forEachResult);
		
		DatabaseConnection connection = new DatabaseConnection();
		connection.getBookDetails();
		
	}

}
