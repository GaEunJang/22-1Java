import java.util.Scanner;

public class REP03 {
	public static void main(String[] args){
		while(true) {
		   Scanner in = new Scanner(System.in);
		   System.out.print("mm/dd/yyyy 형식으로 입력하세요:");
		   String date = in .next();

	       String[] ip = date.split("/");

	       int month = Integer.parseInt(ip[0]);
	       int day = Integer.parseInt(ip[1]);
	       int year = Integer.parseInt(ip[2]);
	       

	       if (month < 1 || month > 12){
	    	   System.out.println("Entered Date is invalid");
	    	   System.out.println("month는 1-12월까지밖에 없습니다.");
	    	   
	       }
	       else if (day < 1) {
	    	   System.out.println("Entered Date is invalid");
	    	   System.out.println("day 값이 1미만입니다.");
	       }
	       else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
	    	   System.out.println("Entered Date is invalid");
	    	   System.out.println("입력한 달은 30일까지밖에 없습니다.");
	       }
	       else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) && day > 31) {
	    	   System.out.println("Entered Date is invalid");
	    	   System.out.println("입력한 달은 31일까지밖에 없습니다.");
	       }
	       else if (month == 2 && ((year % 4 == 0) && (year % 100 != 0))) {
	    	   if (day > 29) {
	    		   System.out.println("Entered Date is invalid");
	    		   System.out.println("윤년에 2월은 29일까지밖에 없습니다.");
	    	   }
	       }
	       else if (month == 2 && day > 28) {
	    	   System.out.println("Entered Date is invalid");
	    	   System.out.println("2월은 28일까지밖에 없습니다.");
	       }
	       else {
	    	   System.out.println("Entered Date is valid");
	    	   System.out.println("종료하시겠습니까? 예(0),아니요(1)");
	    	   Scanner sc = new Scanner(System.in);
	    	   int a = sc.nextInt();
	    	   if(a==0) {
	    		   break;
	    	   }
	       }
		}
	}
}



