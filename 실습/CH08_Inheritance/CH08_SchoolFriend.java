

public class CH08_SchoolFriend extends CH08_Friend {
	private String schoolName;
	public CH08_SchoolFriend(String initialSchool) {
		super();
		schoolName = initialSchool;
	}
	public void whatfriend() {
		super.whatfriend();
		System.out.println("in " + schoolName);
	}
}

