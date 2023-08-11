
public class Staff extends Employee{

	private int payGrade;
  
	public Staff(String name, String department, int employeeId, int payGrade) {
		super(name, department, employeeId);
		this.payGrade = payGrade;
	}
  
	public int getPayGrade() { 
		return payGrade; 
	}
	public void setPayGrade(int payGrade) {
		this.payGrade = payGrade;
	}

	@Override
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Pay Grade: " + this.payGrade);
	} 
}