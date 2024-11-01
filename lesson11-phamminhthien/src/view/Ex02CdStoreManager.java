package view;

import java.util.ArrayList;
import java.util.List;

import bean.CD;
import model.DataModel;
import static utils.CollectionUtils.generate;
public class Ex02CdStoreManager {

	  public static void main(String[] args) {
	        List<CD> cds = new ArrayList<>(DataModel.mockCD());

	        CD newCd = new CD(116, "R&B", "Alicia Keys", 8, 180.0);
	        addCd(cds, newCd);
	        CD cdTest = new CD(116, "R", "hh", 9, 11d);
	        addCd(cds, cdTest);
	        
	        System.out.println("--> Số lượng CD có trong danh sách: " + countCds(cds));

	        System.out.println("--> Tổng giá thành các CD: " + calculateTotalPrice(cds));

	        sortCdsByPriceDescending(cds);
	        generate("--> Danh sách CD giảm dần theo giá thành", cds);

	        sortCdsByIdAscending(cds);
	        generate("--> Danh sách CD tăng dần theo mã CD", cds);
	        
	        
	    }

	    // Thêm 1 CD vào danh sách, thêm thành công nếu không trùng mã CD
	  public static boolean addCd(List<CD> cds, CD newCd) {
	        // Kiểm tra nếu mã CD đã tồn tại trong danh sách
	        for (CD cd : cds) {
	            if (cd.getCdId() == newCd.getCdId()) {
	                System.out.println("CD với mã " + newCd.getCdId() + " đã tồn tại.");
	                return false; // Trả về false nếu CD đã tồn tại
	            }
	        }

	        cds.add(newCd);
	        System.out.println("--> Thêm CD thành công: " + newCd);
	        return true; // Trả về true nếu thêm CD thành công
	    }

	    // Đếm số lượng CD trong danh sách
	  public static int countCds(List<CD> cds) {
	        return cds.size(); // Trả về số lượng CD
	    }
	  
	// Tính tổng giá thành của các CD
	    public static double calculateTotalPrice(List<CD> cds) {
	        return cds.stream().mapToDouble(CD::getPrice).sum();
	    }

	    // Sắp xếp danh sách giảm dần theo giá thành
	    public static void sortCdsByPriceDescending(List<CD> cds) {
	        cds.sort((cd1, cd2) -> Double.compare(cd2.getPrice(), cd1.getPrice())); 
	    }

	    // Sắp xếp danh sách tăng dần theo mã CD
	    public static void sortCdsByIdAscending(List<CD> cds) {
	        cds.sort((cd1, cd2) -> Integer.compare(cd1.getCdId(), cd2.getCdId()));
	    }
}
