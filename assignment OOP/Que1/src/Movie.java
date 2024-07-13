
import java.util.*;
public class Movie implements Show {
private String movieName;
private ArrayList<Actor> actors = new ArrayList<>();
private ArrayList<Dircetor> directors  = new ArrayList<>();
private ArrayList<CameraMan> cameraMen = new ArrayList<>();
private int internationalRate;
private int  localRate;
	
	public Movie(String movieName,ArrayList<Actor>actors,ArrayList<Dircetor> directors,ArrayList<CameraMan> cameraMen,int internationalRate,int localRate ) {
		this.movieName=movieName;
	    this.actors=actors;
		this.directors=directors;
		this.cameraMen=cameraMen;
		this.internationalRate=internationalRate;
		this.localRate=localRate;
	}
	
	public void getTitle() {
	System.out.println("Movie : "+movieName);
		
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
	public void showStats() {
System.out.println("International Movie Popularity :"+ internationalRate+" Stars");		
	}

	@Override
	public void showStats(String country) {
		
		System.out.println("Local Movie Popularity : "+country+ localRate+" Stars");		
	
	}

	@Override
	public void getEpisodes() {
		// TODO Auto-generated method stub
		
	}

}
