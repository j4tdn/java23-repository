package service;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {

	private ItemGroupDao itemGroupDao;

	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}

	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}

	@Override
	public ItemGroup get(String name) {
		return itemGroupDao.get(name);
	}

	@Override
	public List<ItemGroupDto> statisticItemsOfEachGroup() {
		return itemGroupDao.statisticItemsOfEachGroup();
	}

	@Override
	public void save(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null");
		Integer groupId = group.getId();
		if (groupId == null || itemGroupDao.get(groupId) == null) {
			itemGroupDao.save(group);
		} else {
			System.out.println(">> Group " + group.getId() + " is already existed");
		}
	}

	@Override
	public void update(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null");
		itemGroupDao.update(group);
	}

	@Override
	public void delete(int groupId) {
		itemGroupDao.delete(groupId);
	}

	@Override
	public void delete(Set<Integer> groupIds) {
		Objects.requireNonNull(groupIds, "groupIds should not be null");
		if (!groupIds.isEmpty()) {
			itemGroupDao.delete(groupIds);
		}
	}
	
	@Override
	public void testHibernateCache() {
		itemGroupDao.testHibernateCache();
	}
}