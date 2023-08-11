
import java.util.Scanner;

public class REP09{
    public static void main(String[] args) {
     
        while(true) {
        	String a;
            Scanner sc = new Scanner(System.in);
        	System.out.println("Enter time in 24-hour notation: ");
            String time = sc.nextLine();
            String[] arr = time.split(":");

            try {
                if (arr.length != 2) {
                    throw new TimeFormatException("incorrect format");
                }
                try {
                    int hour = Integer.parseInt(arr[0]);
                    int minutes = Integer.parseInt(arr[1]);
                    if (hour < 1 || hour > 24 || minutes < 0 || minutes > 60)
                        throw new TimeFormatException("There is no such time as: " + time + "\nTry Again");
                    if (hour <= 12)
                        System.out.println("That is the same as\n" + time + " AM");
                    else {
                        System.out.println("That is the same as\n" + (hour - 12) + ":" + arr[1] + " PM");
                    }
                } catch (NumberFormatException e) {
                    throw new TimeFormatException("incorrect format");
                }

                System.out.println("Again? (y/n)");
                a = sc.nextLine();
            } catch (TimeFormatException exception) {
                System.out.println(exception.getMessage());
                a = "y";
                }
            if(a.equals("n")) {
            	System.out.println("End of program");
            	break;
            }
        	
        }
    }

}
