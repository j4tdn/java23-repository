package dao;

import java.time.LocalDate;
import java.util.Set;

public interface OrderDao {

	/**
	 * Get set of sales Date
	 * 
	 * @return non-null set of sales Date
	 */
	Set<LocalDate> getSalesDate();
	
}
