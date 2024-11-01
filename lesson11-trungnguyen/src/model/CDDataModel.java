package model;

import java.util.ArrayList;
import java.util.List;

import bean.CD;

public class CDDataModel {

	public static List<CD> generateCDData() {
        List<CD> cds = new ArrayList<>();
        
        cds.add(new CD(1, "Pop", "Ca Sy A", 10, 100000.0));
        cds.add(new CD(2, "Rock", "Ca Sy B", 8, 150000.0));
        cds.add(new CD(3, "Jazz", "Ca Sy C", 12, 120000.0));
        cds.add(new CD(4, "Classical", "Ca Sy D", 9, 180000.0));
        cds.add(new CD(5, "Hip Hop", "Ca Sy E", 15, 130000.0));
        cds.add(new CD(6, "Country", "Ca Sy F", 7, 90000.0));
        cds.add(new CD(7, "Blues", "Ca Sy G", 6, 110000.0));
        cds.add(new CD(8, "EDM", "Ca Sy H", 13, 140000.0));
        cds.add(new CD(9, "Folk", "Ca Sy I", 11, 160000.0));
        cds.add(new CD(10, "K-pop", "Ca Sy J", 14, 200000.0));

        return cds;
    }
}
