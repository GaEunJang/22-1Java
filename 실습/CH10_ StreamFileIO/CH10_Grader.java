
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Scanner;

public class CH10_Grader {
	public static void run(String fileName, String outFileName) {
		
		PrintWriter outputStream = null;
		Scanner inputStream = null;
		
		try {
			inputStream = new Scanner(new File(fileName));
			outputStream = new PrintWriter(new FileOutputStream(outFileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file " + fileName);
			System.exit(0);
		}
		

		double java=0;
		double data=0;
		double open=0;
		double cal1=0;
		double total=0;
		int count=0;
		
		String firstLine = inputStream.nextLine();
		outputStream.println(firstLine + ",Average");
		
		while(inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			String[] ary = line.split(",");
			double sum = 0;
			double avg;
			try {
				
				if(ary[0] == "Name") {
					System.out.println(ary[0]);
					outputStream.println(line + ",Average");
				}
				else {
					for(int i=2 ; i<ary.length ; i++) {
						sum += Double.valueOf(ary[i]);
					}
					java = java+Double.valueOf(ary[2]);
					data = data+Double.valueOf(ary[3]);
					open = open+Double.valueOf(ary[4]);
					cal1 = cal1+Double.valueOf(ary[5]);
					
					
					count++;
				}
			}
			catch (NumberFormatException e){
			    System.out.println("NumberFormatException");
			}
				
			avg = sum/(ary.length-2);
			total = total+avg;
			outputStream.println(line + "," +avg);
		}
		java = java/count;
		data = data/count;
		open = open/count;
		cal1 = cal1/count;
		total = total/count;
		outputStream.println("Average,000000,"+ java + "," + data + "," + open + "," + cal1 + "," + total);
		
		inputStream.close();
		outputStream.close();
		System.out.println("File processing complete");
	}		
	
}
