package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserPractice {
	
	public static void addingData() {
		System.out.println("New class working");
	}
	
	public Set<Integer> deletingData(int a, int b) {
		System.out.println("Data Deleted");
		Set<Integer> sampleSet = new HashSet<Integer>(); 
		List<Integer> sample = new ArrayList<Integer>();
		sampleSet.add(a);
		sampleSet.add(10);
		sampleSet.add(10);
		sampleSet.add(20);
		sampleSet.add(30);
//		return "successfull";
		return sampleSet;
	}

}
