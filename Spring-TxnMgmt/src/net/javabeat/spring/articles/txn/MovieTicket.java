package net.javabeat.spring.articles.txn;

public class MovieTicket {

	private String id;
	private String movieName;
	private int totalTicketsCount;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getTotalTicketsCount() {
		return totalTicketsCount;
	}
	public void setTotalTicketsCount(int totalTicketsCount) {
		this.totalTicketsCount = totalTicketsCount;
	}
		
}
