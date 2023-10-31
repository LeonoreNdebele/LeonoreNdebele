package practice1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadGPT {

	 public static void main(String[] args) {
	        String filePath = "C:\\Users\\leomd\\OneDrive\\Documents\\epita\\S3_fall\\Java_app_development\\practice.txt";

	        String outputFilePath = "\"C:\\Users\\leomd\\OneDrive\\Documents\\epita\\S3_fall\\Java_app_development\\output.txt\""; // Replace with the desired output file path

	        if (canReadFile(filePath)) {
	            System.out.println("This File can Read!");
	           
	        } else {
	            System.out.println("This File cannot be read!");
	        }
	    }

	    public static boolean canReadFile(String filePath) {
	        return new java.io.File(filePath).canRead();
	    }

	    public static void readAndWriteContent(String inputFilePath, String outputFilePath) throws IOException {
	        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
	             FileWriter writer = new FileWriter(outputFilePath)) {

	            // Skip unwanted content
	            reader.skip("Java is a high-level, class-based, Object-oriented programming language.".length());

	            String line;
	            while ((line = reader.readLine()) != null) {
	                writer.write(line + "\n");
	            }
	        }
	    }
}
