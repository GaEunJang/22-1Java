
public class CH09_MyException extends Exception {
		
		public CH09_MyException(String message) {
			super(message);
		}
		
		public String toString() { 
			String a = getMessage(); 
			return a;
		}   
		
}