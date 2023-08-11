import java.util.Scanner;

public class CH04_MyDrawing {
	public static void main(String[] args) {
		
		System.out.println("Please input a number: ");
		int number,i,j;
		
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		
		for(i=1;i<=number;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1;i<=number;i++) {
			for(j=number;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
