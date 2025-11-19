package productCatalogue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapSeries {
	
	public static void main(String[] args) {
		
		Map<Integer, String> sampleHash = new HashMap<Integer, String>();
		sampleHash.put(1, "Sample");
		sampleHash.put(2, "None");
		String s = sampleHash.get(2);
//		System.out.println(s);
		
		//setting key with integer and value with List of Product
		
		Map<Integer, Product> sampleHash2 = new HashMap<Integer, Product>();
		Product product = new Product();
		product.setProductId(1);
		product.setProductName("Laptops");
		product.setQuantity(2);
		product.setPrice(20000);
		
		Product product2 = new Product();
		product2.setProductId(2);
		product2.setProductName("Mobiles");
		product2.setPrice(10000);
		product2.setQuantity(1);
		
		sampleHash2.put(product.getProductId(), product);
		sampleHash2.put(product2.getProductId(), product2);
		
//		System.out.println(sampleHash2.get(1));
		for(Entry<Integer, Product> n: sampleHash2.entrySet()) {
			System.out.println(n.getKey());
		}
		
		
		
		//storing list of object in value 
		Map<String, List<Product>> sampleHash3 = new HashMap<String, List<Product>>();
		
		Product product3 = new Product();
		product3.setProductId(1);
		product3.setProductName("Laptops");
		product3.setQuantity(2);
		product3.setPrice(20000);
		
		Product product4 = new Product();
		product4.setProductId(2);
		product4.setProductName("Mobiles");
		product4.setPrice(10000);
		product4.setQuantity(1);
		
		
		List<Product> listOfProduct = new ArrayList<Product>();
		listOfProduct.add(product4);
		listOfProduct.add(product3);
		
		sampleHash3.put("Electronics", listOfProduct);
//		System.out.println(sampleHash3.get("Electronics"));
		
		
		
		//TreeSet Example
		
		TreeSet<Integer> treeSetExample = new TreeSet<Integer>();
		treeSetExample.add(20);
		treeSetExample.add(10);
		treeSetExample.add(5);
		treeSetExample.add(50);
		treeSetExample.add(10);
		System.out.println(treeSetExample);
		
		TreeSet<String> stringSet = new TreeSet<String>();
		stringSet.add("Bike");
		stringSet.add("ABC");
		
		System.out.println(stringSet);
		
		//TreeMap Example
		TreeMap<Integer, Integer> treeMapexample = new TreeMap<Integer, Integer>();
		treeMapexample.put(100, 100);
		treeMapexample.put(90, 100);
		treeMapexample.put(120, 100);
		System.out.println(treeMapexample);
		
		
		
		
		
		
		
		
		
		
	}

}
