package practice;

public class ProductDetails {
	


	Integer id;
	String productName;
	String productPrice;
	String productQuantity;
	
	public ProductDetails() {
		super();
	}
	
	public ProductDetails(Integer id) {
		this.id = id;
	}
	
	public ProductDetails(Integer id, String productName) {
		this.id = id;
		this.productName = productName;
	}
	
	public ProductDetails(Integer id, String productName, String productPrice, String productQuantity) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	
	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + "]";
	}

}
