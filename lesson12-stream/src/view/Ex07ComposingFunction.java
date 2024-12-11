package view;

import java.util.ArrayList;
import java.util.List;
import static java.util.Comparator.*;
import bean.Apple;
import model.DataModel;
import utils.CollectionUtils;

public class Ex07ComposingFunction {

	public static void main(String[] args) {
		// Sắp xếp danh sách các quả táo tăng dần theo weight, giảm dần theo id
		
		List<Apple> inventory = new ArrayList<>(DataModel.getApples());
		inventory.add(0, null);
		inventory.add(3, null);
		
		inventory.sort(
				nullsFirst(comparing(Apple::getWeight)
						.thenComparing(Apple::getId, reverseOrder()))
		);
		
		CollectionUtils.generate("1. Sắp xếp danh sách các quả táo tăng dần theo weight, giảm dần theo id", inventory);
		
		// lưu ý: chỉ sort null first null last được khi đối tượng null, còn khi từng thuộc tính bên trong thì ko thể
		// sort được, mà thay vào đó sẽ tự code hàm xử lý
	}
	
}
