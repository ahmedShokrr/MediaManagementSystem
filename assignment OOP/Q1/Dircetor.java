package OOPassignment;

public class Dircetor extends castMember {
	public Dircetor(String name, String birthday) {
		super(name, birthday);
		
	}	
	public String Print() {
		return "The Name of Director is "+super.getName()+"\nthe birthday is "+super.getBirthday();
	}
		}

