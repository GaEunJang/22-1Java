import java.util.Scanner;

public class REP07{

	public static void text(String s) {
		int[] arr = new int[26];
		s = s.toUpperCase();

		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				arr[s.charAt(i) - 'A']++;
			}
		}

		for (int i = 0; i < 26; ++i) {
			while(arr[i]!=0) {
			System.out.println((char) ('A' +i) +" " + arr[i] );
			arr[i]=0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);	
		String s;
	
		
		while (true) {
			System.out.println("Eter a line of text");
			System.out.println("terminated by a period");
			s=keyboard.nextLine();
			text(s);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter another line? (y for 'yes')");
			String answer=sc.nextLine();
			if(!(answer.equals("y"))) {
				System.exit(0);
			}
		}
	}
}

