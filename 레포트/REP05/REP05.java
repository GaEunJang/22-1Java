import java.util.Scanner;

public class REP05 {
	private int gradeA,gradeB,gradeC,gradeD,gradeF;
	
	Scanner sc = new Scanner(System.in);
	public void readGrade() {
		System.out.println("Input number of \"A\"");
		gradeA = sc.nextInt();
		System.out.println("Input number of \"B\"");
		gradeB = sc.nextInt();
		System.out.println("Input number of \"C\"");
		gradeC = sc.nextInt();
		System.out.println("Input number of \"D\"");
		gradeD = sc.nextInt();
		System.out.println("Input number of \"F\"");
		gradeF = sc.nextInt();
	}
	
	public void writeGrade(){
		double Sum = gradeA + gradeB + gradeC + gradeD + gradeF;
		
		double gradeAPercen = ((gradeA / Sum) * 100) / 2;
		int gradeASet=(int)(Math.round(gradeAPercen));
		double gradeBPercen = ((gradeB / Sum) * 100) / 2;
		int gradeBSet=(int)(Math.round(gradeBPercen));
		double gradeCPercen = ((gradeC / Sum) * 100) / 2; 
		int gradeCSet=(int)(Math.round(gradeCPercen));
		double gradeDPercen = ((gradeD / Sum) * 100) / 2; 
		int gradeDSet=(int)(Math.round(gradeDPercen));
		double gradeFPercen = ((gradeF / Sum) * 100) / 2; 
		int gradeFSet=(int)(Math.round(gradeFPercen));
		
		System.out.println("0   10   20   30   40   50   60   70   80   90   100");
		System.out.println("|    |    |    |    |    |    |    |    |    |    |");
		System.out.println("***************************************************");
		
		for(int i = 0 ; i < gradeASet; i++){
			System.out.print("*");
			}System.out.println("  A");
			for(int i = 0 ; i < gradeBSet; i++){
			System.out.print("*");
			}System.out.println("  B");
			for(int i = 0 ; i < gradeCSet; i++){
			System.out.print("*");
			}System.out.println("  C");
			for(int i = 0 ; i < gradeDSet; i++){
			System.out.print("*");
			}System.out.println("  D");
			for(int i = 0 ; i < gradeFSet; i++){
			System.out.print("*");
			}System.out.println("  F");
			}
	 public static void main(String[] args) {
		REP05 re05 = new REP05();
		re05.readGrade();
		re05.writeGrade();
	}
}
