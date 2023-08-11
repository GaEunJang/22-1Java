import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class searchWord {
    public static void main(String args[]) {
    	String inputFileName;
		String outputFileName;
		PrintWriter outputStream = null;
		Scanner inputStream = null;
        
	
		inputFileName = "words.txt";

		outputFileName = "result.txt";
		
		String word[] = new String[4]; 
		String word_f[] = new String[87314];
		int i = 0;
		
		try
		{
		File myObj = new File("searchWordList.txt");
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine())
		{
		word[i] = myReader.nextLine().trim();
		i++;
		}
		myReader.close();
		}catch (FileNotFoundException e)
		{
		System.out.println("An error occurred.");
		e.printStackTrace();
		}
		
        try {
            inputStream = new Scanner(new File(inputFileName));
            outputStream = new PrintWriter(new FileOutputStream(outputFileName));
            
        } catch(FileNotFoundException e) {
			System.out.println("Error opening the file " + inputFileName);
			System.exit(0);
		}
        int j=0;
        String str;
        while(inputStream.hasNextLine()) {
           str= inputStream.nextLine();
           word_f[j]=str;
           j++; 
        }
        
        inputStream.close();
        
        for(i=0;i<4;i++) {
	        outputStream.println("## World list containing String " + "\""+word[i] +"\""+ " ##");
	        j=0;
	        while(j<word_f.length) {
	        	str=word_f[j];
	            if (str.contains(word[i]))
	            	outputStream.println(str);
	            j++;
	        }
	        outputStream.println();  
        }
   
		outputStream.close();
    }
}
