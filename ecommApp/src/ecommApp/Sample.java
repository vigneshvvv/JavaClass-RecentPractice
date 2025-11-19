package ecommApp;

public class Sample {
	
	public static void main(String[] args) {
		Number num = 10;
		String sample = "Sample Content";
		Boolean result = true;
		int[] sampleArr = {10, 20, 30, 40 ,50};
//		System.out.println(sample);
		
		for(int i=0; i<sampleArr.length; i++) {
//			System.out.println(i);
			if(sampleArr[i] == 20) {
//				System.out.println("The value Exist");
			}
			
		}
		
		
		
		if(sampleArr[1] != 30) {
//			System.out.println("The value already present");
		}else {
//			System.out.println("The value Doesn't Exist");
		}
		
		
		//Nested for loop example
		for(int i= 0; i<sampleArr.length; i++ ) {
			System.out.println(sampleArr[i]);
			for(int j=0;j<sampleArr.length; j++) {
				System.out.println(sampleArr[j]);	
			}
		}
		
	}

}
