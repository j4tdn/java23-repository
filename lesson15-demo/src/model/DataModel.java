package model;

import java.util.Arrays;
import java.util.List;

import bean.Store;
import util.NumberUtils;

public class DataModel {
	private DataModel() {

	}

	public static List<Store> getStore() {
		return Arrays.asList(
				new Store(1L, null, NumberUtils.bd(18d), NumberUtils.bd(40d), Boolean.TRUE),
				new Store(2L, 3L, NumberUtils.bd(19d), null, Boolean.TRUE),
				new Store(3L, 10L, NumberUtils.bd(21d), null, Boolean.TRUE),
				new Store(4L, null, NumberUtils.bd(20), NumberUtils.bd(44), Boolean.TRUE),
				new Store(5L, null, NumberUtils.bd(15), NumberUtils.bd(13), Boolean.TRUE),
				new Store(6L, null, NumberUtils.bd(15), NumberUtils.bd(78), Boolean.TRUE),
				new Store(7L, 2L, NumberUtils.bd(12), null, Boolean.TRUE),
				new Store(8L, null, NumberUtils.bd(14), NumberUtils.bd(30), Boolean.FALSE),
				new Store(9L, 4L, NumberUtils.bd(12), null, Boolean.TRUE),
				new Store(10L, null, NumberUtils.bd(12), null, Boolean.TRUE),
				new Store(11L, 7L, NumberUtils.bd(12), null, Boolean.FALSE)
				);
	}
}
