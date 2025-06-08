package service;

public interface ItemDetailService {
	
	/**
	 * Update amounts for item details
	 * 
	 * @param itemDetailIdForAdd      for adding value
	 * @param itemDetailIdForSubtract for subtracting value
	 * @param value                   value
	 */
	void updateAmounts(int itemDetailIdForAdd, int itemDetailIdForSubtract, int value);
	
}
