package observer;

public class NewsChannel implements Observer{
	
	private String channelNews;

	@Override
	public void update(String news) {
		this.channelNews=news;
		System.out.println("News Channel recieved News: " + channelNews);
		
	}

}
