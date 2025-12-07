package productCatalogue;

import java.util.List;

public class ProductsNew {
	


	Integer productId;
	String productName;
	Integer price;
	Integer quantity;
	List<User> users;
	

	public ProductsNew(Integer productId, String productName, Integer price, Integer quantity, List<User> users) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.users = users;
	}
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "ProductsNew [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantity=" + quantity + ", users=" + users + "]";
	}
	

}
