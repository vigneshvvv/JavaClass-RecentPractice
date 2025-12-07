package stream;

import java.io.File;
import java.util.Scanner;

public class FileReader {
	
	public static void main(String[] args) {
		
		try {
			File file = new File("/home/vignesh/eclipse-workspace/JavaClass/JavaPractice/StreamNew/src/stream/sample.txt");
			Scanner scanner = new Scanner(file);
			System.out.println("Reached till scanner");
			
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
