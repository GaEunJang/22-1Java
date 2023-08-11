
import java.util.ArrayList;

public class CH12_ClassList {
	ArrayList<String> list = new ArrayList<String>();
	int count = 1;
	
	public void Print() {
		System.out.println();
		System.out.println("List of classes");
		for(String element : list) {
			System.out.println("class " + count + ": " + element);
			count++;
		}
	}
	
	public void add(String s) {
		list.add(s);
	}
}
