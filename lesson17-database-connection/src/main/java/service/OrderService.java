package service;

import java.time.LocalDate;
import java.util.Set;

public interface OrderService {
	
	/**
	 * Get set of sales Date
	 * 
	 * @return non-null set of sales Date
	 */
	Set<LocalDate> getSalesDate();

}
