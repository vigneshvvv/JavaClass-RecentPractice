package forEachExample;

import java.util.List;

public class BookDetails {
	
	int id;
	String bookName;
	String category;
	List<BorrowerDetails> borrowerDetails;
	

	public BookDetails(int id, String bookName, String category, List<BorrowerDetails> borrowerDetails) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.category = category;
		this.borrowerDetails = borrowerDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<BorrowerDetails> getBorrowerDetails() {
		return borrowerDetails;
	}
	public void setBorrowerDetails(List<BorrowerDetails> borrowerDetails) {
		this.borrowerDetails = borrowerDetails;
	}
	@Override
	public String toString() {
		return "BookDetails [id=" + id + ", bookName=" + bookName + ", category=" + category + ", borrowerDetails="
				+ borrowerDetails + "]";
	}
	

}
