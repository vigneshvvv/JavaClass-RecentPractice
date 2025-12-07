package stream;

public class FileWriter {
	
	public static void main(String[] args) {
		try {
			java.io.FileWriter writer = new java.io.FileWriter("/home/vignesh/eclipse-workspace/JavaClass/JavaPractice/StreamNew/src/stream/writer.txt");
			writer.write("Hello");
			writer.write("File Write completed");
			writer.close();
		}catch (Exception e) {
		  e.printStackTrace();
		}
	}

}
