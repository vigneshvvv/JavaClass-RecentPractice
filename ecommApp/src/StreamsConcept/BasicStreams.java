package StreamsConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import productCatalogue.Product;

public class BasicStreams {
	
	
	public static List<Product> creatingObject() {
		Product product = new Product();
		product.setProductName("fdsfsfsdf");
		product.setProductId(1);
		product.setPrice(10000);
		product.setQuantity(1);
		
		
		Product product1 = new Product();
		product1.setProductName("fdsfsfsdf");
		product1.setProductId(2);
		product1.setPrice(10000);
		product1.setQuantity(1);
		
		Product product2 = new Product();
		product2.setProductName("fdsfsfsdf");
		product2.setProductId(3);
		product2.setPrice(20000);
		product2.setQuantity(2);
		
		List<Product> list = new ArrayList<Product>();
		list.add(product2);
		list.add(product1);
		list.add(product);
		
		return list;
		
	}
	
	public static void filteringObject() {
		List<Product> products = creatingObject();
	List<Product> filteredProduct = products.stream().filter((e) -> e.getPrice() == 10000).collect(Collectors.toList());
	System.out.println(filteredProduct);
	}
	
	
	
	
	
	public static void main(String[] orgs) {
		filteringObject();
		
	}

}
