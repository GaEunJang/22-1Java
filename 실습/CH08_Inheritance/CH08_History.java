
public class CH08_History extends CH08_Book {
	private String author;
	
	public CH08_History() {
		super();
		author = "No author yet.";
	}
	
	public CH08_History(String initialName, String initialAuthor) {
		super(initialName);
		author = initialAuthor;
	}
	
	public String toString() {
		return(super.toString() + "\nAuthor: " + author);
	}
	
	public void print() {
		System.out.println("<<<History>>>\n" + "Id: " + n + "\n" + toString());
	}
}

