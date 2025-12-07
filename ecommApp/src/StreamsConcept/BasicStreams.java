package StreamsConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
		product1.setQuantity(3);
		
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
		
		//old method of filtering the object
		List<Product> oldmethod = new ArrayList<Product>();
		for(Product product: products) {
			if(product.getPrice() == 10000) {
				oldmethod.add(product);
			}
		}
		
		//new method of filtering using streams
		
		List<Product> filteredProduct = products.stream().filter((e) -> e.getPrice() == 10000).collect(Collectors.toList());
	
		System.out.println(filteredProduct);
	}
	
	public static void mappingTheValues() {
		List<Product> products = creatingObject();
		
	List<String> productNames = products.stream().map((e) ->  e.getProductName()).collect(Collectors.toList());
	
	
	///manual method
	List<String> productNamesManual = new ArrayList<String>();
	for(Product product: products) {
		productNamesManual.add( product.getProductName());
	}
	
	List<String> productNames2 = products.stream().filter((e) -> e.getQuantity() == 1).map((e) -> e.getProductName()).collect(Collectors.toList()); 
	System.out.println(productNames2);
	
	///manual method for filter and map
	 
	List<String> productNamesManual2 = new ArrayList<String>();
	for(Product product: products) {
		if(product.getQuantity() == 1) {
		productNamesManual2.add( product.getProductName());
		}
	}		
	}
	
	public static void collectToSetExample() {
		List<Integer> sampleInt = new ArrayList<Integer>();
		sampleInt.add(1);
		sampleInt.add(2);
		sampleInt.add(1);
		sampleInt.add(3);
		
		
	  Set<Integer> sampleset =sampleInt.stream().filter((e) -> e < 10).collect(Collectors.toSet());
	  System.out.println(sampleset);
		
		
	}
	
	
	public static void mappingConcept() {
		
		List<Product> products = creatingObject();
		
	Map<Integer, Long> productsMap	= products.stream().collect(Collectors.groupingBy(Product::getPrice, Collectors.counting()));
	
	
	
	//old way coding
	Set<Integer> prices =   products.stream().map(e -> e.getPrice()).collect(Collectors.toSet());

	Integer numberof = 0;
	Map<Integer, Integer>  mapOfProduct = new HashMap<Integer, Integer>();
	
	for(Integer price: prices) {
		for(Product product: products) {
			if(price == product.getPrice()) {
				numberof++;
				
			}
		}
		
		mapOfProduct.put(price, numberof);
		
	}
	
	
//	Map<Integer, Long> productsMap	= products.stream().collect(Collectors.groupingBy(Product::getQuantity, Collectors.counting()));
	
	System.out.println(productsMap);
	
	}
	
	
	public static void main(String[] orgs) {
//		filteringObject();
//		mappingTheValues();
//		collectToSetExample();
		mappingConcept();
		
	}

}
