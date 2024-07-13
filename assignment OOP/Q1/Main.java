package OOPassignment;
import java.util.*;
public class Main {
public static void main(String[] args) {
	
			ArrayList<Actor> actorsOfTheMovie = new ArrayList<Actor>();
			actorsOfTheMovie.add(new Actor("Ahmed", "3/5/1999"));
			actorsOfTheMovie.add(new Actor("salma", "23/3/1991"));
			
			
			ArrayList<Dircetor> directorsOfTheMovie = new ArrayList<Dircetor>();
			directorsOfTheMovie.add(new Dircetor("Moemen ", "29/3/2002"));
			
			
			
			ArrayList<CameraMan> cameraMansOfTheMovie = new ArrayList<CameraMan>();
			cameraMansOfTheMovie.add(new CameraMan("sherin", "25/5/2003"));
			
			
			Movie movie1 = new Movie("ahwak", actorsOfTheMovie, directorsOfTheMovie, cameraMansOfTheMovie,4,5);
			movie1.getCast();
			movie1.getTitle();
			movie1.showStats();
			movie1.showStats("egypt");
			System.out.println("________________________");
			ArrayList<Actor> actorsOfTheTvShow = new ArrayList<Actor>();
			actorsOfTheTvShow.add(new Actor("youssef", "3/5/1996"));
			actorsOfTheTvShow.add(new Actor("yasser", "23/3/1994"));
			
			
			ArrayList<Dircetor> directorsOfTheTvShow = new ArrayList<Dircetor>();
			directorsOfTheTvShow.add(new Dircetor("Ahmed mohamed", "32/3/2323"));
			directorsOfTheTvShow.add(new Dircetor("Mostafa", "3/4/2133"));
			
			
			ArrayList<CameraMan> cameraMansOfTheTvShow = new ArrayList<CameraMan>();
			cameraMansOfTheTvShow.add(new CameraMan("shady", "2/3/1989"));
			cameraMansOfTheTvShow.add(new CameraMan("yasser", "2/5/1999"));
			cameraMansOfTheTvShow.add(new CameraMan("nour", "24/3/2001"));
			TvShow tvShow1=new TvShow("news",actorsOfTheTvShow,directorsOfTheTvShow,cameraMansOfTheTvShow,7,6,4);
			tvShow1.getCast();
			tvShow1.getTitle();
			tvShow1.getEpisodes();
			tvShow1.showStats();
			tvShow1.showStats("egypt");
			
			System.out.println("________________________");
			ArrayList<Actor> actorsOfTheSeries = new ArrayList<Actor>();
			actorsOfTheSeries.add(new Actor("youssef", "3/5/1996"));
			actorsOfTheSeries.add(new Actor("yasser", "23/3/1994"));
			
			
			ArrayList<Dircetor> directorsOfTheSeries = new ArrayList<Dircetor>();
			directorsOfTheSeries.add(new Dircetor("Ahmed mohamed", "32/3/2323"));
			directorsOfTheSeries.add(new Dircetor("Mostafa", "3/4/2133"));
			
			
			ArrayList<CameraMan> cameraMansOfTheSeries = new ArrayList<CameraMan>();
			cameraMansOfTheSeries.add(new CameraMan("yassin", "25/3/1998"));
			cameraMansOfTheSeries.add(new CameraMan("mohsen", "21/1/2001"));
			cameraMansOfTheSeries.add(new CameraMan("hassan", "3/4/1994"));
			MiniSeries m1= new MiniSeries("Prison Break",actorsOfTheSeries,directorsOfTheSeries,cameraMansOfTheSeries,30,7,6);
			m1.getCast();
			m1.getTitle();
			m1.getEpisodes();
			m1.showStats();
			m1.showStats("egypt");
			
			
}

}
