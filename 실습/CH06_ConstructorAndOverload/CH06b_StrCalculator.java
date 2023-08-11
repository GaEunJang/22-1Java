public class CH06b_StrCalculator{
	
	public static double operation(int first, char op, int second) {
		return((double)(first +second));
	}
	public static double operation(String first, char op, String second) {
			return((double)(Integer.parseInt(first) +Integer.parseInt(second)));
	}
	public static double operation(double first, char op, double second) {
		return(first - second);
	}
	
	public static void main(String[] args) {
		double result = 0.0;
		result = CH06b_StrCalculator.operation(10, '+', 20);
		System.out.println("Int op Int: " + result);
		
		result = CH06b_StrCalculator.operation("10", '+', "20");
		System.out.println("Str op Str: " + result);
		
		result = CH06b_StrCalculator.operation(10.0,'-', 20.0);
		System.out.println("Double op Double:  " + result);
	}
}




