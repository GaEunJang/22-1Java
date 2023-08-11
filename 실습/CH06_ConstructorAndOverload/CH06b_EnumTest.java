
public class CH06b_EnumTest {
	
	public static void main(String[] args){
		Suit s = Suit.FRI;
		System.out.println("s.ordinal()="+s.ordinal());
		
		System.out.println("s.compareTo(Suit.WED)="+s.compareTo(Suit.WED));
		System.out.println("s.toString()="+s.toString());
		System.out.println("s.getColor() = "+s.getColor());
		
		for(Suit suit : Suit.values())	{
			System.out.print(suit);
			System.out.println("   "+suit.getColor());
		}
		}
		
	}

