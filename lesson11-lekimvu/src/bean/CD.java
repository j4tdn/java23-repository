package bean;

public class CD {

   private Integer id;
   private String genre;
   private String singer;
   private Integer songs;
   private Double prices;
   
    public CD() {

    }

	public CD(Integer id, String genre, String singer, Integer songs, Double prices) {
		this.id = id;
		this.genre = genre;
		this.singer = singer;
		this.songs = songs;
		this.prices = prices;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Integer getSongs() {
		return songs;
	}

	public void setSongs(Integer songs) {
		this.songs = songs;
	}

	public Double getPrices() {
		return prices;
	}

	public void setPrices(Double prices) {
		this.prices = prices;
	}

	@Override
	public String toString() {
		return "CD [id=" + id + ", genre=" + genre + ", singer=" + singer + ", songs=" + songs + ", prices=" + prices
				+ "]";
	}
    
    
}