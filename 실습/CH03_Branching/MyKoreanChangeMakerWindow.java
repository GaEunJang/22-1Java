import javax.swing.*;

public class MyKoreanChangeMakerWindow {
	   public static void main(String[] args) {
		      String amountString = JOptionPane.showInputDialog("\"Enter a whole number from 1 to 10000.\"");
		      
		      int amount,originalAmount,a,b,c,d,e;
		      
		      amount=Integer.parseInt(amountString);
		      originalAmount=amount;
		      
		      a=amount/500;
		      amount=amount%500;
		      b=amount/100;
		      amount=amount%100;
		      c=amount/10;
		      amount = amount%10;
		      d=amount/5;
		      amount = amount%5;
		      e=amount;
		      

		   
		      JOptionPane.showMessageDialog(null, originalAmount+" won in coins can be given as:\n"+a + " 500 won\n"+b+" 100 won\n"+c+" 10 won\n"+d+" 5 won\n"+e+" 1 won");
		      System.exit(0);
	   }

}