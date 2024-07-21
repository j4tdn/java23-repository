package view;

import java.lang.module.FindException;
import java.util.Arrays;

import bean.CompanyPersonnel;
import bean.Director;
import bean.Employee;
import bean.Manager;
import bean.Student;

public class Ex04HumanResourcesManagement {

	public static void main(String[] args) {
		Director d1 = new Director("John", "7/8/1990", 7.85d, 0.6);
		Manager m1 = new Manager("Nick", "12/3/1995", 6d, 0.52d, "Management");
		Manager m2 = new Manager("James", "20/9/1989", 6.2d, 0.52d, "Production");
		Employee e1 = new Employee("Linda", "19/1/2000", 5.5d, "Room 1", m1);
		Employee e2 = new Employee("Harry", "8/6/2001", 5.5d, "Room 2", m1);
		Employee e3 = new Employee("Jack", "26/4/1997", 5.5d, "Room 3", m2);
		Employee e4 = new Employee("Sophia", "21/8/1999", 5.5d, "Room 4", m1);
		Employee e5 = new Employee("Jenifer", "13/6/2000", 5.5d, "Room 5", m2);
		Employee e6 = new Employee("Tom", "1/3/2003", 5.5d, "Room 6", m2);
		
		Manager[] mn = {m1, m2};
		CompanyPersonnel[] cp = {d1, m1, m2, e1, e2, e3, e4, e5, e6};
		generate("1. Thông tin nhân sự công ty", cp);
		//findEmployeesByManager(cp, mn);
		System.out.println("3. Mức lương của nhân sự công ty");
		printSalaryOfCompanyPersonel(cp);
				
		
	}
	private static void generate(String prefix, CompanyPersonnel[] cpl) {
		System.out.println(prefix + "\n{");
		for(CompanyPersonnel cp: cpl)
			System.out.println("  + " + cp);
		System.out.println("}\n");
	}
	/*
	private static void findEmployeesByManager(CompanyPersonnel[] cpl, Manager[] mn) {
		for(CompanyPersonnel cp: cpl)
			if(cp instanceof Employee)
				if(((Employee) cp).getManager().equals(mn))
					System.out.println(cp.getName());
	}
	 */
	private static void printSalaryOfCompanyPersonel(CompanyPersonnel[] cpl) {
		int i = 0;
		for(CompanyPersonnel cp: cpl)
			if(cp instanceof Director) {
				System.out.println("------------Giám đốc------------");
				System.out.println(cp.getName() + "-> " + cp.calculateSalary());
			}
			else if(cp instanceof Manager && cp.getClass() != Employee.class) {
				if(i == 0) {
					System.out.println("----------Trưởng phòng----------");
					i++;
				}
				System.out.println(cp.getName() + "-> " + cp.calculateSalary());
			}
			else {
				if(i == 1) {
					System.out.println("-----------Nhân viên------------");
					i++;
				}
				System.out.println(cp.getName() + "-> " + cp.calculateSalary());
			}
	}
}
