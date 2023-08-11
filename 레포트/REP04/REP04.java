
public class REP04 {
	public static void main(String[] args) {
		
		for (int i=1000; i<=9999; i++) {
			int a = (i/1000)%10;
			int b=(i/100)%10;
			int c=(i/10)%10;
			int d = i%10;
			
			int n=a+b+c+d;
			
			if(a!= b && a!=c && a!=d) {
				if(b!=c && b!=d) {
					if(c!=d) {
						if(c*3==a) {
							if(i%2!=0) {
								if(n==27) {
									System.out.println(i);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
