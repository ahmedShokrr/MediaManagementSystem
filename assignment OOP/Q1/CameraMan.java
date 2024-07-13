package OOPassignment;

public class CameraMan extends castMember {

	public CameraMan(String name, String birthday) {
		super(name, birthday);
		
	}
	public String Print() {
		return "The Name of Camera Man is "+super.getName()+"\nthe birthday is "+super.getBirthday();
	}
}
