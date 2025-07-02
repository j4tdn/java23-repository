<<<<<<< HEAD
=======

>>>>>>> 5c1e4eb (lesson18-jpahibernate-testing 02.07.2025)
package service;

import java.time.LocalDate;
import java.util.Set;

import dao.JdbcOrderDao;
import dao.OrderDao;

public class OrderServiceImpl implements OrderService {

	private OrderDao orderDao;

	public OrderServiceImpl() {
		orderDao = new JdbcOrderDao();
	}

	@Override
	public Set<LocalDate> getSalesDate() {
		return orderDao.getSalesDate();
	}

}
