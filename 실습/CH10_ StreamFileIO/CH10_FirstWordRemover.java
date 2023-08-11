
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Scanner;

public class CH10_FirstWordRemover {
	
	public static void main(String[] args) {
		
		String inputFileName;
		String outputFileName;
		PrintWriter outputStream = null;
		Scanner inputStream = null;
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("What is the file to read from?");
		inputFileName = s.next();
		System.out.println("What is the file to write to(After removing the first word from each line)");
		outputFileName = s.next();
		
		try {
			inputStream = new Scanner(new File(inputFileName));
			outputStream = new PrintWriter(new FileOutputStream(outputFileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file " + inputFileName);
			System.exit(0);
		}
		
		while(inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			String[] ary = line.split(" ");
			String newLine = "";
			for(int i=1 ; i<ary.length ; i++) {
				
				newLine = newLine + ary[i] + " ";
			}
			outputStream.println(newLine);
		}		
		
		inputStream.close();
		outputStream.close();
		s.close();
		System.out.println("File processing complete");
	}
}
