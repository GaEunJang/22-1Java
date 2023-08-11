import java.util.Scanner;

public class CH04_MyLargeSmallAverage {
	public static void main(String[] args) {
		
		System.out.println("This program allows you to enter a list of positive integers");
		System.out.println("(terminated by a -1) then displays the largest value,");
		System.out.println("smallest value, and average of the list of numbers,");
		System.out.println("not includeing the final (negative) value that ends the list");
		
		System.out.println();
		int count=0;
		int sum=0;
		double average = 0;
		int max=0;
		int min=100;
		
	
		
		
		while(true){
		System.out.println("please enter a postitive integer, or -1 to quit.");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==-1) 
			break;
		
		if(max<n) {
			max=n;
		}
		if(min>n) {
			min=n;
		}

		
		count++;
		sum+=n;
		average=(double)sum/count;
		}
		
		System.out.println("For the "+count + " numbers you entered");
		System.out.println("the largest value ="+max);
		System.out.println("the smallest value="+min);
		System.out.println("and the average is=" +average);
	}
}
