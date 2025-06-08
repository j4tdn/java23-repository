package service;

import java.util.List;
import java.util.Objects;

import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}

	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroupDto> statisticItemGroups() {
		return itemGroupDao.statisticItemGroups();
	}
	
	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, " name should not be null");
		return itemGroupDao.get(name);
	}
	
	@Override
	public void save(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null");
		ItemGroup found = get(group.getId());
		if (found == null) {
			itemGroupDao.save(group);
		} else {
			System.out.println("Group " + group.getId() + " is existed already ...");
		}
	}
	

	@Override
	public void save(List<ItemGroup> groups) {
		if (!groups.isEmpty()) {
			itemGroupDao.save(groups);
		}
	}
	
	@Override
	public void merge(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null");
		itemGroupDao.merge(group);
	}
}