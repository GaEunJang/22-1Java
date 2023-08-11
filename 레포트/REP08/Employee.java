

public class Employee extends Person{

	private int employeeId;
	private String department;
  
	public Employee(String name, String department, int employeeId) {
		super(name);
		this.employeeId = employeeId;
		this.department = department;
	}

	public int getemployeeId() {
		return employeeId; 
	}
	public void setemployeeId(int employeeId) { 
		this.employeeId = employeeId; 
	}
	public String getDepartment() { 
		return department; 
	}
	public void setDepartment(String department) { 
		this.department = department;
	}
  
	public void writeOutput(){
		System.out.println("Name: " + this.getName());
		System.out.println("Dept: " + this.department);
		System.out.println("Employee ID: " + this.employeeId);
	} 
}
