package OOPassignment;
import java.util.*;
public class Movie implements Show {
private String movieName;
private ArrayList<Actor> actors = new ArrayList<Actor>();
private ArrayList<Dircetor> directors  = new ArrayList<Dircetor>();
private ArrayList<CameraMan> cameraMen = new ArrayList<CameraMan>();
private int WorldRate;
private int  CountryRate;
	
	public Movie(String movieName,ArrayList<Actor>actors,ArrayList<Dircetor> directors,ArrayList<CameraMan> cameraMen,int WorldRate,int CountryRate ) {
		this.movieName=movieName;
		this.actors=actors;
		this.directors=directors;
		this.cameraMen=cameraMen;
		this.WorldRate=WorldRate;
		this.CountryRate=CountryRate;
	}
	
	public void getTitle() {
	System.out.println("the movie name is "+movieName);
		
	}

	@Override
	public void getCast() {
	for(int i=0;i<actors.size();i++) {
	System.out.println(((i+1) + " - ") + actors.get(i).Print());
	
	}
	System.out.println();
	for(int i=0;i<directors.size();i++) {
		System.out.println(((i+1) + " - ") + directors.get(i).Print());
	}
	System.out.println();
	for(int i=0;i<cameraMen.size();i++) {
		System.out.println(((i+1) + " - ") + cameraMen.get(i).Print());
	}
	System.out.println();
	}

	@Override
	public void showStats() {
System.out.println("The movie is popular as:"+ WorldRate+" Star");		
	}

	@Override
	public void showStats(String country) {
		
		System.out.println("The movie is popular "+country+" as:"+ CountryRate+" Star");		
	
	}

}
