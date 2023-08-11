
import java.util.*;

public class CH11_RecursionCountOnes {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a nonnegative number:");
		int number = s.nextInt();
		System.out.println(number + " contains "+ numberOfOnes(number) + " ones.");
		s.close();
	}
	
	public static int numberOfOnes(int n)
	{
		if (n == 0)
			return 0;
		else if (n%10 == 1)
			return(numberOfOnes(n/10)+1);
		else
			return(numberOfOnes(n/10));
	}
}

