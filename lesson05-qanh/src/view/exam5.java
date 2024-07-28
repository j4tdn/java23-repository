package view;

import bean.*;
import java.util.ArrayList;
import java.util.List;

public class exam5 {
    
    
    private void naim() {
		Book[] books = new Book[5];
		
        books[0] = new TextBook("SGK1", 150, "nhi đồng", "mới");
        books[1] = new TextBook("SGK2", 120, "giáo dục", "cũ");
        books[2] = new TextBook("SGK3", 180, "nhi đồng", "mới");
        books[3] = new ReferBook("STK1", 60, "nhi đồng", 0.1);
        books[4] = new ReferBook("STK2", 70, "giáo dục", 0.15);
	}

}
