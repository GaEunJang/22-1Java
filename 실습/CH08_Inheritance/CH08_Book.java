

public class CH08_Book {
	public String name;
	public int n;
	public static int idValue = 0;
	
	public CH08_Book() {
		name = "No name yet.";
		idValue++;
		n=idValue;
	}
	
	public CH08_Book(String initialName) {
		name = initialName;
		idValue++;
		n=idValue;
	}
	
	public String toString() {
		return("Book Name: " + name);
	}
	
	public void print() {
		System.out.println("<<<BOOK>>>\n" + "Id: " + n + "\n" + toString());
	}
}
