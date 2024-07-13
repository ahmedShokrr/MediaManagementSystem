import java.util.*;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		
     	ArrayList<Actor> actorsOfTheTvShow = new ArrayList<>();
		actorsOfTheTvShow.add(new Actor("Bassem yousef", "3/10/1960"));
		ArrayList<Dircetor> directorsOfTheTvShow = new ArrayList<>();
		directorsOfTheTvShow.add(new Dircetor("Shadi", "32/3/2323"));
		ArrayList<CameraMan> cameraMansOfTheTvShow = new ArrayList<>();
		cameraMansOfTheTvShow.add(new CameraMan("Mohand", "2/3/1989"));

		TvShow tvShow1=new TvShow("Al-bernamj show",actorsOfTheTvShow,directorsOfTheTvShow,cameraMansOfTheTvShow,60,5,8);
		tvShow1.getTitle();
		tvShow1.showStats();
		tvShow1.showStats("");
		tvShow1.getEpisodes();
		tvShow1.getCast();
		
		
		System.out.println("***&*&*&*&*&*&*&*&*&*&*&*&*&*&*&*&***");
		ArrayList<Actor> actorsOfTheMovie = new ArrayList<>();
		actorsOfTheMovie.add(new Actor("Saka", "23/10/1986"));
		actorsOfTheMovie.add(new Actor("Ezz", "23/3/1991"));
		ArrayList<Dircetor> directorsOfTheMovie = new ArrayList<>();
		directorsOfTheMovie.add(new Dircetor("Mohamed Samy", "25/9/1970"));
		ArrayList<CameraMan> cameraMansOfTheMovie = new ArrayList<>();
		cameraMansOfTheMovie.add(new CameraMan("Hesham", "23/4/1971"));
		Movie movie1 = new Movie("Elmaslaha", actorsOfTheMovie, directorsOfTheMovie, cameraMansOfTheMovie,4,5);
		movie1.getTitle();
		movie1.showStats();
		movie1.showStats("");
		movie1.getCast();
		
		
		System.out.println("***&*&*&*&*&*&*&*&*&*&*&*&*&*&*&*&***");
		ArrayList<Actor> actorsOfTheSeries = new ArrayList<>();
		actorsOfTheSeries.add(new Actor("Emilia Clarke", "23/10/1986"));
		actorsOfTheSeries.add(new Actor("Kit Harington", "23/3/1991"));
		ArrayList<Dircetor> directorsOfTheSeries = new ArrayList<>();
		directorsOfTheSeries.add(new Dircetor("David Benioff ", "25/9/1970"));
		directorsOfTheSeries.add(new Dircetor("john", "3/4/1980"));
		ArrayList<CameraMan> cameraMansOfTheSeries = new ArrayList<>();
		cameraMansOfTheSeries.add(new CameraMan("jack ban", "25/1/1998"));
		cameraMansOfTheSeries.add(new CameraMan("robert", "3/11/1977"));
		MiniSeries m1= new MiniSeries("Game of Thrones",actorsOfTheSeries,directorsOfTheSeries,cameraMansOfTheSeries,100,9,8);
		m1.getTitle();
		m1.showStats();
		m1.showStats("");
		m1.getEpisodes();
		m1.getCast();
		
		
	}

}
