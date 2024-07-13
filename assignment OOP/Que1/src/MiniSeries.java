import java.util.ArrayList;
public class MiniSeries implements Show {
	private String SeriesName;
	private int internationalRate;
	private int  localRate;
	private ArrayList<Actor> actors = new ArrayList<>();
	private ArrayList<Dircetor> directors  = new ArrayList<>();
	private ArrayList<CameraMan> cameraMen = new ArrayList<>();
	private int ebisodes;
	public MiniSeries( String SeriesName,ArrayList<Actor> actors,ArrayList<Dircetor> directors,ArrayList<CameraMan> cameraMen,int ebisodes,int internationalRate,int localRate) {
		this.SeriesName=SeriesName;
		this.actors=actors;
		this.directors=directors;
		this.cameraMen=cameraMen;
		this.ebisodes=ebisodes;
		this.internationalRate=internationalRate;
		this.localRate=localRate;
	}
	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		System.out.println("Series :"+SeriesName);	
		
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
		System.out.println("Episodes :" + ebisodes);	
		
	}

	@Override
	public void showStats() {
		System.out.println("International Series Popularity :"+ internationalRate+" Stars");	
	}

	@Override
	public void showStats(String country) {
		System.out.println("local Series Popularity : "+country+ localRate+" Stars");	
		
	}

}

