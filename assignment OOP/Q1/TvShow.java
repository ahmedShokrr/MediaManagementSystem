package OOPassignment;

import java.util.ArrayList;

public class TvShow implements Show{
private String showName;
private ArrayList<Actor> actors = new ArrayList<Actor>();
private ArrayList<Dircetor> directors  = new ArrayList<Dircetor>();
private ArrayList<CameraMan> cameraMen = new ArrayList<CameraMan>();
private int ebisodes;
private int WorldRate;
private int  CountryRate;
public TvShow(String showName,ArrayList<Actor>actors,ArrayList<Dircetor> directors,ArrayList<CameraMan> cameraMen,int ebisodes ,int WorldRate,int CountryRate) {
	this.showName=showName;
	this.actors=actors;
	this.directors=directors;
	this.cameraMen=cameraMen;
	this.ebisodes=ebisodes;
	this.WorldRate=WorldRate;
	this.CountryRate=CountryRate;
}

	@Override
	public void getTitle() {
		System.out.println("the show name is "+showName);	
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
	public void getEpisodes() {
	System.out.println("the numbers of Episodes is " + ebisodes);	
		
	}

	@Override
	public void showStats() {
		System.out.println("The show is popular as:"+ WorldRate+" Star");	
	}

	@Override
	public void showStats(String country) {
		System.out.println("The show is popular "+country+" as:"+ CountryRate +" Star");	
		
	}

}
