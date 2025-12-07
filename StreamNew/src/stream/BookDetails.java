package stream;

import java.util.List;

public class BookDetails {
	

	Integer id;
	String BookName;
	String Author;
	List<BorrowerDetails> borrowerDetails;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public List<BorrowerDetails> getBorrowerDetails() {
		return borrowerDetails;
	}
	public void setBorrowerDetails(List<BorrowerDetails> borrowerDetails) {
		this.borrowerDetails = borrowerDetails;
	}

	@Override
	public String toString() {
		return "BookDetails [id=" + id + ", BookName=" + BookName + ", Author=" + Author + ", borrowerDetails="
				+ borrowerDetails + "]";
	}

}
