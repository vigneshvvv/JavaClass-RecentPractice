package productCatalogue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingConcept {
	
	
	public static List<ProductsNew> creatingObject() {
		
		List<User> users = new ArrayList<User>();
		User user = new User(1, "vignesh", 1);
		User user1 = new User(2, "Kumar", 2);
		users.add(user1);
		users.add(user);
		
	  ProductsNew new1 = new ProductsNew(1, "mobile", 10000, 1, users);
	  ProductsNew new2 = new ProductsNew(2, "Laptop", 20000, 2, users);
	  List<ProductsNew> productsList = new ArrayList<ProductsNew>();
	  productsList.add(new2);
	  productsList.add(new1);
	  return productsList;
		
	}
	
	
	public static void filteringUsingMap() {
		List<ProductsNew> output = creatingObject();
		
		//old type coding
		
		Set<String> productNames = new HashSet<String>();
		for(ProductsNew e : output) {
			productNames.add(e.getProductName());
		}
		
		Set<User> usersFiltered = new HashSet<User>();
		Map<String, Set<User>> filteredoutput = new HashMap<String, Set<User>>();
		
		for(String productName: productNames) {
			for(ProductsNew product: output) {
				if(productName == product.getProductName()) {
					for(User user: product.getUsers()) {
						if(user.getNoOfOrder()>1) {
							usersFiltered.add(user);
						}
					}
				}
			}
			filteredoutput.put(productName, usersFiltered);
			usersFiltered = new HashSet<User>();
		}
		
		
	Map<String, List<User>> finalOutput	= output.stream()
		.collect(Collectors.toMap(ProductsNew::getProductName, product -> product.getUsers().stream()
				.filter(e -> e.getNoOfOrder() ==2)
				.collect(Collectors.toList())
				));
	
	System.out.println(finalOutput);
	}
	
	
	public static void main(String[] args) {
		filteringUsingMap();
	}

}
