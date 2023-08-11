import java.util.Scanner;

public class CH11_Palindrome_main {
	public static void main(String[] args) {
		
        	char[] arr = new char[80];
    		char[] a = new char[80];            
            int used = 0;            
            String input;
            char c;
            
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a string: ");
            input = s.nextLine();
            arr = input.toCharArray();
            for(int i=0 ; i<input.length() ; i++) {      	
            	if(arr[i] == ' ') {}
            	else if(arr[i] > 64 && arr[i] < 91) {
            		a[used] = Character.toLowerCase(arr[i]);
            		used++;
            	}
            	else if(arr[i] > 96 && arr[i] < 123) {
            		a[used] = arr[i];
            		used++;
            	}
            	else {}
            }
            
            char[] b = new char[used];
            
            for(int i=0 ; i<used ; i++) {
            	b[i] = a[i];
            }
        	
        	String word = new String(b);
        	
            if(isPalindrome(word))
                System.out.println(input+ " is a palindrome.\n");
            else
                System.out.println(input+" is not a palindrome.\n");
	}
            

	public static boolean isPalindrome(String word) {
		if(word.length() <= 1) {
		    return true;
		}
		if(word.charAt(0) == word.charAt(word.length() - 1)) {
		    return isPalindrome(word.substring(1, word.length() - 1));
		} 
		else {
			return false;
		}
	}

	
}
