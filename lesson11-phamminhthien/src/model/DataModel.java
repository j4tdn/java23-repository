package model;

import java.util.List;
import bean.CD;
import bean.Card;

public class DataModel {

    public DataModel() {
    }
    
    public static List<CD> mockCD() {
        return List.of(
                new CD(101, "Pop", "Taylor Swift", 10, 150.0),
                new CD(102, "Pop", "Ariana Grande", 12, 200.0),
                new CD(103, "Rock", "Freddie Mercury", 8, 180.0),
                new CD(104, "Jazz", "Norah Jones", 15, 220.0),
                new CD(105, "Classical", "Ludwig van Beethoven", 5, 300.0),
                new CD(106, "Rock", "Kurt Cobain", 11, 170.0),
                new CD(107, "Pop", "Bruno Mars", 9, 130.0),
                new CD(108, "Jazz", "Louis Armstrong", 7, 210.0),
                new CD(109, "Classical", "Wolfgang Amadeus Mozart", 6, 320.0),
                new CD(110, "Hip Hop", "Kendrick Lamar", 10, 155.0),
                new CD(111, "Blues", "B.B. King", 14, 175.0),
                new CD(112, "Rock", "Jim Morrison", 9, 195.0),
                new CD(113, "Electronic", "Calvin Harris", 13, 250.0),
                new CD(114, "Country", "Dolly Parton", 10, 160.0),
                new CD(115, "Pop", "Ed Sheeran", 12, 140.0)
        );
    }
}
	