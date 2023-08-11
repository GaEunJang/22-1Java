import java.util.*;

public class MyCompareTo {
	public static void main(String[] args){
	      String s1, s2;
	      String answer;
	      
	      Scanner s = new Scanner(System.in);
	
    do {
        System.out.println("Please input two words:");
        
        
        s1=s.next();
        s2=s.next();
        
        if(s1.compareTo(s2)<0)
           System.out.println(s1+" is before "+s2);
        else if(s1.compareTo(s2)>0)
           System.out.println(s1+" is after "+s2);
        else
           System.out.println(s1+" is equals "+s2);
        
        System.out.println("Want to end the program??");
        System.out.println("Enter  y for yes or n for no.");
        answer=s.next();
     } while(answer.equalsIgnoreCase("y"));
     
     System.out.println("end the program!!");
     s.close();         
  }   

}
