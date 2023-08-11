
public class CH08_Science extends CH08_Book {
private String publisher;
	
	public CH08_Science() {
		super();
		publisher = "No publisher yet.";
	}
	
	public CH08_Science(String initialName, String initialPublisher) {
		super(initialName);
		publisher = initialPublisher;
	}
	
	public String toString() {
		return(super.toString() + "\nPublisher: " + publisher);
	}
	
	public void print() {
		System.out.println("<<<Science>>>\n" + "Id: " + n + "\n" + toString());
	}
}
