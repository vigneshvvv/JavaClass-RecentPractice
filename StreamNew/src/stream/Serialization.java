package stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	
	public static void main(String[] args) {
		Books  books = new Books();
		books.setId(10);
		books.setBook_name("Unknown");
		books.setPrice(400);
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("/home/vignesh/eclipse-workspace/JavaClass/JavaPractice/StreamNew/src/stream/books.ser"));
			outputStream.writeObject(books);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
