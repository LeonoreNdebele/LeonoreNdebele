package practice1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCanReadFxnAndPrintUsingBufferedReaderOffset {

	public static void main(String[] args) throws IOException {

		// create the file

		File fileOb = new File(
				"C:\\Users\\leomd\\OneDrive\\Documents\\epita\\S3_fall\\Java_app_development\\practise2.txt");

		if (fileOb.createNewFile()) {
			System.out.println("created");
		} else {
			System.out.println("exists");
		}

		// writing into the file using filewriter

		FileWriter writer = new FileWriter(fileOb);
		writer.write(" Java is a high-level, class-based, Object-oriented programming language.!!");
		writer.close();

		// check if it is read/write

		System.out.println(fileOb.canRead());

		System.out.println(fileOb.canWrite());

		System.out.println(fileOb.getAbsolutePath());

		System.out.println(fileOb.getName());

		System.out.println(fileOb.length());

		// Printing only ‘Object-oriented programming language’ using the BufferedReader
		// ‘Offset’ concept

		FileReader reader = new FileReader(fileOb);
		BufferedReader bfr = new BufferedReader(reader);

		// Seek to the offset where "Object-oriented programming language" starts
		bfr.skip(36);

		// Read the line and print it
		String line = bfr.readLine();
//		System.out.println(line);

		// Close the reader
		bfr.close();

		// Creating a new file to read the contents of the given file
		File newFile = new File(
				"C:\\Users\\leomd\\OneDrive\\Documents\\epita\\S3_fall\\Java_app_development\\output.txt");

		if (newFile.createNewFile()) {
			System.out.println("New file created");
		} else {
			System.out.println("New file already exists");
		}

		// Writing the contents of the given file to the new file
		FileWriter newWriter = new FileWriter(newFile);
		newWriter.write(line);
		newWriter.close();

		// reading the the file
		FileReader reader1 = new FileReader(newFile);
		BufferedReader bfr1 = new BufferedReader(reader1);
		String line1;

		while ((line1 = bfr1.readLine()) != null) {
			System.out.println(line);
		}
		
		bfr1.close();

	}

}
