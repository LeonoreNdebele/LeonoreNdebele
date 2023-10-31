package practice1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExercise {

	public static void main(String[] args) throws IOException {

		// create a file

		File fileObject = new File(
				"C:\\Users\\leomd\\OneDrive\\Documents\\epita\\S3_fall\\Java_app_development\\practice.txt");

		// check if file was created

		if (fileObject.createNewFile()) {
			System.out.println("created");
		} else {
			System.out.println("exists");
		}

		// writing into the file using filewriter

		FileWriter writer = new FileWriter(fileObject);
		writer.write(" hello,java programming users.!!");
		writer.close();

		// displaying files using buffered writer

		BufferedReader bf = new BufferedReader(new FileReader(fileObject));
		String line;

		while ((line = bf.readLine()) != null) {
			System.out.println(line);
		}
		bf.close();

//		// deleting the file
//
//		File filedelete = new File(
//				"C:\\Users\\leomd\\OneDrive\\Documents\\epita\\S3_fall\\Java_app_development\\practice.txt");
//
//		// deletes the file
//		boolean value = filedelete.delete();
//		if (value) {
//			System.out.println("The File is deleted.");
//		} else {
//			System.out.println("The File is not deleted.");
//		}

	}

}
