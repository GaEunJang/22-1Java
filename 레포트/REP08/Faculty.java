
public class Faculty extends Employee{

	private String title;
  
	public Faculty(String name, String department, int employeeId, String title) {
		super(name, department, employeeId);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) { 
		this.title = title; 
	}

	@Override
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Title: " + this.title);
	}  
}
