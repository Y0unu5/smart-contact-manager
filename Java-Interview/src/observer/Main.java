package observer;

public class Main {

	public static void main(String[] args) {
		NewsAgency newsAgency=new NewsAgency();
		NewsChannel newsChannel=new NewsChannel();
		NewsChannel newsChannel2= new NewsChannel();
		
		newsAgency.registerObserver(newsChannel);
		newsAgency.registerObserver(newsChannel2);
		
		newsAgency.setNews("Breaking news: Observer Pattern is implemented in Java.");
	}
}
