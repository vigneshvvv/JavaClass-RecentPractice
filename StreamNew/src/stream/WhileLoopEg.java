package stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhileLoopEg {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add("James");
		names.add("Jimson");
		
		Iterator<String> iterator = names.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
			
		}
		
		int i = 10;
	
		while(i<=12) {
			System.out.println(i);
			i++;
		}
	}

}
