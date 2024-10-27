package bean;

public class Trader {

	int id;
    String name;
    String city;

    public Trader(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " from " + city;
    }
}

