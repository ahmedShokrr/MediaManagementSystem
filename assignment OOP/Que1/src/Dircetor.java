	
public class Dircetor extends castMember {
	public Dircetor(String name, String birthday) {
		super(name, birthday);
		
	}	
	public String Print() {
		return "Director : "+super.getName()+"\nBirthday : "+super.getBirthday();
	}
		}

