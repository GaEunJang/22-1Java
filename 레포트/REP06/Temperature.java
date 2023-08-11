import java.util.Scanner;

public class Temperature {
	private double temperature;
	private char scale;
	
	public Temperature(double degrees) {
		this.temperature=degrees;
		scale='C';
	}
	public Temperature(char scale) {
		this.scale=scale;
		temperature=0;
	}
	public Temperature(double degrees,char scale) {
		this.scale=scale;
		this.temperature=degrees;
	}
	public Temperature() {
		temperature=0;
		scale='C';
	}
	
	
	public double getF() {
		if(scale=='F') 
			return temperature;
		else 
			return (Math.round((9*temperature/5)+32)*10);
	}
	
	public double getC() {
		if(scale=='C') 
			return temperature;
		else
			return((double)(Math.round((5*(temperature-32.0)/9.0)*10.0))/10);
	}
	
	
	public void set(double degrees) {
		this.temperature=degrees;
	}
	
	public void set(char scale) {
		this.scale=scale;
	}
	
	public void set(double degrees,char scale) {
		this.temperature=degrees;
		this.scale=scale;
	}
	
	
	public boolean equals(Temperature otherObject)
	{
		return getC() == otherObject.getC();
	}
	
	public boolean isLessThan(Temperature otherObject)
	{
		return getC() > otherObject.getC();
	}
	
	public boolean isGreaterThan(Temperature otherObject)
	{
		return getC() < otherObject.getC();
	}
	
	public void writeOutput() {
		System.out.println("Temperature: " + temperature);
		System.out.println("Scale: "+ scale);
	}
	
	public void readInput() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the Temperature?");
		temperature=keyboard.nextDouble();
		System.out.println("What is the Scale?");
		scale=keyboard.next().charAt(0);
	}
}










