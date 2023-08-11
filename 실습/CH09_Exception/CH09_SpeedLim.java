
public class CH09_SpeedLim {
	
	private int limit;
	private int speed;
	
	public CH09_SpeedLim(int initialLimit, int initialSpeed) {
		limit = initialLimit;
		speed = initialSpeed;
	}
	
	public void SpeedWarning() {
		try {
			if(limit < speed) {
				throw new Exception("Speed Limit " + limit +"km exceeded!");
			}
			System.out.println("You are a law abiding citizen!");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("You are being fined.");			
		}
		System.out.println("Your current speed: " + speed);
	}
}