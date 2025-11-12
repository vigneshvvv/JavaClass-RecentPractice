package Sample;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FIlterProduct {
	
	public static Integer processTheNumber(int a , int b) {
		return a*b;
	}
	
	public static void main(String[]args) {
		
		Scanner se = new Scanner(System.in); 
		
		System.out.println("Enter the number");
		Integer sample = se.nextInt();
		System.out.println("Enter the number");
		Integer sample2 = se.nextInt();
		
		Integer result = processTheNumber(sample, sample2);
		System.out.println("The final output is "+ result);
		
		List<Product> products = new ArrayList<Product>();
		
		Product product = new Product();
		product.setId(1);
		product.setPrice("1000");
		product.setCategory("Electronics");
		product.setDescription("none");
		product.setTitle("mobile");
		
		Product product1 = new Product();
		product1.setId(2);
		product1.setPrice("10000");
		product1.setCategory("Electronics");
		product1.setDescription("none");
		product1.setTitle("mobile");
		
		Product product2 = new Product();
		product2.setId(3);
		product2.setPrice("20000");
		product2.setCategory("Electronics");
		product2.setDescription("none");
		product2.setTitle("Headphones");
		
		products.add(product);
		products.add(product1);
		products.add(product2);
		
		System.out.println(products);
		
		List<Product> arr = new ArrayList<Product>();
		
		for(Product prod: products) {
			if(prod.getPrice() == "1000") {
				arr.add(prod);
			}
		}
	
		
		List<String> productFiltered = products.stream().filter((e) -> (e.getPrice() == "1000")).map((samp) -> samp.getTitle()).collect(Collectors.toList());
		System.out.println(productFiltered);
		
 	}

}
