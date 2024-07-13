import java.util.ArrayList;

public class TvShow implements Show{
private String showName;
private ArrayList<Actor> actors = new ArrayList<>();
private ArrayList<Dircetor> directors  = new ArrayList<>();
private ArrayList<CameraMan> cameraMen = new ArrayList<>();
private int ebisodes;
private int internationalRate;
private int  localRate;
public TvShow(String showName,ArrayList<Actor>actors,ArrayList<Dircetor> directors,ArrayList<CameraMan> cameraMen,int ebisodes ,int internationalRate,int localRate) {
	this.showName=showName;
    this.actors=actors;
	this.directors=directors;
	this.cameraMen=cameraMen;
	this.ebisodes=ebisodes;
	this.internationalRate=internationalRate;
	this.localRate=localRate;
}

	@Override
	public void getTitle() {
		System.out.println("TV Show : "+showName);	
	}

	@Override
	public void getCast() {

		for(int i=0;i<actors.size();i++) {
			System.out.println(actors.get(i).Print());
			
			}
			System.out.println();
			for(int i=0;i<directors.size();i++) {
				System.out.println(directors.get(i).Print());
			}
			System.out.println();
			for(int i=0;i<cameraMen.size();i++) {
				System.out.println(cameraMen.get(i).Print());
			}
			System.out.println();
	}

	@Override
	public void getEpisodes() {
	System.out.println("Episodes : " + ebisodes);	
		
	}

	@Override
	public void showStats() {
		System.out.println("International Show Popularity :"+ internationalRate+" Stars");	
	}

	@Override
	public void showStats(String country) {
		System.out.println("Local Show Popularity : "+country+ localRate +" Stars");	
		
	}
	

	
	

}
