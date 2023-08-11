
public class CH08_Cat extends CH08_Animal implements CH08_Pet {
	public void setName(String name) {
		super.setName(name);
	}
	public void getName() {
		super.getName();
	}
	@Override
	public String food() {
		return ("(Cat!)Fish");
	}
}
