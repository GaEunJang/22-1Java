
import java.util.*;
import java.util.HashMap;

public class CH12_StudentID {
	public static void main(String[] args) {
		boolean done = false;
		Scanner s = new Scanner(System.in);
		int ID = 0;
		String num;
		
		HashMap<Integer, ArrayList<String>> students = new HashMap<Integer, ArrayList<String>>();
		
		System.out.println("Enter Data in the format: ID CourseNum");
		System.out.println("Enter -1 to end");
		
		while(!done) {				
			ID = s.nextInt();
			
			if(ID == -1) done = true;
			else {
				num = s.next();
				ArrayList<String> courseNum = new ArrayList<String>();
				
				if(students.containsKey(ID)) courseNum = students.get(ID);		
				
				courseNum.add(num);
				students.put(ID, courseNum);
			}
			
			
		}
		
		printMap(students);
		s.close();
			
	}
	
	public static void printMap(HashMap<Integer, ArrayList<String>> map) {
		for(Integer keyID : map.keySet()) {
			System.out.print("Students: ");
			ArrayList<String> courseNum = map.get(keyID);
			System.out.println(keyID);
			for(String element : courseNum) {
				System.out.print(element + " ");
			}
			System.out.print("\n");
		}
		
	}
	
	
}
