
import java.util.Scanner;
public class CH09_MyException_main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		try {
			String str = kb.nextLine();
				MyTest(str);
		}
		catch(CH09_MyException mae){
			System.out.println(mae);
		}
		kb.close();
	}
	static void MyTest(String str) throws CH09_MyException{
		String[] strArr = str.split("");
		
		for(int i=0;i<str.length();i++) {
			if(strArr[i].equals("$")) throw new CH09_MyException("String sholud not include "+ "\n"+ "special character $.");
		}
		System.out.println("String :" + str);
	}
}
