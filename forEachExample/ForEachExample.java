package forEachExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ForEachExample {
	
	
	
	public static List<BookDetails> createObject() {
		BorrowerDetails borrowerDetails = new BorrowerDetails(1, "adsdads", 2);
		BorrowerDetails borrowerDetails1 = new BorrowerDetails(2, "sfdfgrb", 10);
		List<BorrowerDetails> borrowerDetails2 = new ArrayList<>();
		borrowerDetails2.add(borrowerDetails1);
		borrowerDetails2.add(borrowerDetails);
		
		BookDetails bookDetails = new BookDetails(1, "The subtle art", "non fiction", borrowerDetails2);
		
		BorrowerDetails borrowerDetailsNew = new BorrowerDetails(1, "adsdads", 3);
		BorrowerDetails borrowerDetailsNew1 = new BorrowerDetails(2, "sfdfgrb", 4);
		List<BorrowerDetails> borrowerDetails4 = new ArrayList<>();
		borrowerDetails4.add(borrowerDetailsNew1);
		borrowerDetails4.add(borrowerDetailsNew);
		
		BookDetails bookDetailsNewList = new BookDetails(1, "Sapiens", "fiction", borrowerDetails4);
		
		List<BookDetails> bookDetails2 = new ArrayList<>();
		bookDetails2.add(bookDetails);
		bookDetails2.add(bookDetailsNewList);
		return bookDetails2;
 	}
	
	public static void forEachConcept(List<BookDetails>  bookDetails) {
		
		Map<String, List<BorrowerDetails>> finalResult = new HashMap<>();
		
		bookDetails.forEach((e) -> {
		List<BorrowerDetails> borrowerList = e.getBorrowerDetails().stream().filter((borrower) -> borrower.getNoOfDaysLeft() <5).collect(Collectors.toList());
		finalResult.put(e.getBookName(), borrowerList);
		});
		
		System.out.println(finalResult);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		List<BookDetails> newObj = createObject();
		forEachConcept(newObj);
		
		
//		forEachConcept(createObject());
	}

}
