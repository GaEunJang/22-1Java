
public class CH08_ClassFriend extends CH08_SchoolFriend {
	private String className;
	public CH08_ClassFriend(String initialSchool, String initialClass) {
		super(initialSchool);
		className = initialClass;
	}
	public void whatfriend() {
		super.whatfriend();
		System.out.println("in " + className);
	}
}

