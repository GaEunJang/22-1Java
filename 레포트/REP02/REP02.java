import javax.swing.*;

public class REP02 {
	public static void main(String[]args) {
		
		while(true) {
			
		String date=JOptionPane.showInputDialog("Enter a date in the format month/day/year.\n"
				+"I will output the date in the format day.month.year");
		 
		if(date==null) {
			 int answer=JOptionPane.showConfirmDialog(null,"프로그램을 종료하시겠습니까?","종료",JOptionPane.OK_CANCEL_OPTION);
			 if(answer==JOptionPane.OK_OPTION)
			   			System.exit(0);
		 }
		
	     String[] ip = date.split("/");
	     
	     int month=Integer.parseInt(ip[0]);
	     int day = Integer.parseInt(ip[1]);
	     int year = Integer.parseInt(ip[2]);
	     
	     if(month>12 || month<1) {
	    	 JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
	    	 break;
	     }
	     else if (day < 1) {
	    	 JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
	    	 break; 
	     }
	     else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
	    	 JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
	    	 break;
	       }
	     else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) && day > 31) {
	    	 JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
	    	 break;
	       }
	     else if (month == 2 && ((year % 4 == 0) && (year % 100 != 0))) {
	    	 if (day > 29) {
	    		 JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
	 	    	 break;
	    	  }
	      }
	     else if (month == 2 && day > 28) {
	    	 JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
	    	 break;
	       }
	     if(month<10) {
	    	 JOptionPane.showMessageDialog(null, date+" converts to: "+day+".0"+month+"."+year);
	     }
	     else if(day<10) {
	    	 JOptionPane.showMessageDialog(null, date+" converts to: "+"0"+day+"."+month+"."+year);
	     }
	     else
	    	 JOptionPane.showMessageDialog(null, date+" converts to: "+day+"."+month+"."+year);
		 int answer=JOptionPane.showConfirmDialog(null,"프로그램을 종료하시겠습니까?","종료",JOptionPane.OK_CANCEL_OPTION);
		 if(answer==JOptionPane.OK_OPTION)
		   			System.exit(0);
 
		}
	}
}
		

