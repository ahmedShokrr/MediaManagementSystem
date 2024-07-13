package OOPassignment;

public class Actor extends castMember {
public Actor(String name,String birthday) {
super(name,birthday);
		

}
public String Print() {
	return "The Name of Actor is "+super.getName()+"\nthe birthday is "+super.getBirthday();
}
}
