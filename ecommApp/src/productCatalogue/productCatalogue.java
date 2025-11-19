package productCatalogue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class productCatalogue {
	
	public static void main(String[] args) {
		Product product = new Product();
		product.setProductId(1);
		product.setPrice(10000);
		product.setQuantity(2);
		product.setProductName("Mobiles");
		
		Product product1= new Product();
		product1.setProductId(2);
		product1.setPrice(10000);
		product1.setQuantity(2);
		product1.setProductName("Laptops");
		
		UserDetails details = new UserDetails();
		details.setUserId(2);																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
		details.setFirstName("Vignesh");
		details.setUserName("v");
		details.setEmailID("vignesh@gmail.com");
		details.setProduct(product);
//		System.out.println(details);
		
		Product finalProduct = details.getProduct();
		  String name = finalProduct.getProductName();
		  if(details.getProduct().getProductName() == "Mobiles") {
			  details.getProduct().setPrice(20000);
		  }
//		System.out.println(details.getProduct());
		
		List<Product> sampleProd = new ArrayList<Product>();
		
		sampleProd.add(product);
		sampleProd.add(product1);
		List<String> productNames = new ArrayList<String>();
		for(Product productSample: sampleProd) {
			productNames.add(productSample.getProductName());
		}
//		System.out.println(productNames);
		for(String a : productNames) {
//			System.out.println(a);
		}
		
		
		//Array List Example
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(1);
		System.out.println(integers);
		
		//HashSet Example 
		Set<Integer> integers2 = new HashSet<Integer>();
		integers2.add(1);
		integers2.add(2);
		integers2.add(1);
		System.out.println("This is hashSet result"+ integers2);
		
		//LinkedListExample 
		List<Integer> sampleLinkedList = new LinkedList<Integer>();
		sampleLinkedList.add(1);
		sampleLinkedList.add(10);
		sampleLinkedList.addFirst(20);
		sampleLinkedList.addLast(30);
		sampleLinkedList.remove(1);
		System.out.println("Linked List output value"+ sampleLinkedList);
		
		//Linked HashSet Example
		Set<Integer> integers3 = new LinkedHashSet<Integer>();
		integers3.add(10);
		integers3.add(15);
		integers3.add(9);
		System.out.println("The output value for Linked hashset is"+ integers3);
		
		
		
				
	}

}
