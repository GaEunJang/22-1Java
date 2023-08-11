import java.util.Scanner;

public class CH04_MySummation {
	public static void main(String[] args) {
		
		System.out.println("Please input a number: ");
		int number,i;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		for(i=1;i<=number;i++) {
			sum+=i;
		}
		System.out.println("The summation from 1 to " + number + " is");
		System.out.println(sum);
	}
}
