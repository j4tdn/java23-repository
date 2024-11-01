package bean;
public class CD {
    private int id;
    private String type;
    private String artist;
    private int songCount;
    private double price;

    public CD(int id, String type, String artist, int songCount, double price) {
        this.id = id;
        this.type = type;
        this.artist = artist;
        this.songCount = songCount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CD [Mã: " + id + ", Loại: " + type + ", Ca sĩ: " + artist + 
               ", Số bài hát: " + songCount + ", Giá: " + price + "]";
    }
}
