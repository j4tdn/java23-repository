package view;

import bean.DepartmentHead;
import bean.Director;
import bean.Employee;
import bean.People;

public class Ex04Main {
	public static void main(String[] args) {
		Director d = new Director("Nguyen Van A", "01/01/2000", 7.5d, 7.2d);

		DepartmentHead dh1 = new DepartmentHead("Le A", "02/02/1998", 6.8d, 7.0d, "Ban A");
		DepartmentHead dh2 = new DepartmentHead("Le B", "06/07/1997", 7.5d, 6.0d, "Ban B");

		Employee e1 = new Employee("Pham A", "11/02/1995", 4.8d, "Phong 1", dh1);
		Employee e2 = new Employee("Pham B", "01/02/2004", 5.8d, "Phong 2", dh2);
		Employee e3 = new Employee("Pham C", "08/10/1999", 4.5d, "Phong 3", dh2);
		Employee e4 = new Employee("Pham D", "11/02/2000", 3.5d, "Phong 4", dh1);
		Employee e5 = new Employee("Pham E", "12/02/2003", 5.2d, "Phong 5", dh1);
		Employee e6 = new Employee("Pham H", "09/03/2002", 4.2d, "Phong 6", dh1);

		People[] ps = { d, dh1, dh2, e1, e2, e3, e4, e5, e6 };
		DepartmentHead[] dhs = { dh1, dh2 };
		show(ps);

		System.out.println("\n------- Statistics on the number of employees managed by each department head: ");
		countEmployees(ps, dhs);

		showSalaries(ps);
	}

	private static void show(People[] ps) {
		System.out.println("\n--------- Information --------\n");
		for (People p : ps) {
			System.out.println(p);
		}
	}

	private static void countEmployees(People[] ps, DepartmentHead[] dh) {
		for (DepartmentHead d : dh) {
			int count = 0;
			for (People p : ps) {
				if (p instanceof Employee e) {
					if (e.getDepartmentHead().equals(d)) {
						count++;
					}
				}
			}
			System.out.println(" ==> Department Head: " + d.getName() + " -> " + count);
		}
	}

	private static void showSalaries(People[] ps) {
		System.out.println("\n--------- Salary --------\n");
		System.out.println(" -> Directors:");
		for (People p : ps) {
			if (p instanceof Director d) {
				System.out.println(" - " + d.getName() + ": " + d.calculateSalary());
			}
		}

		System.out.println("\n -> Department Heads:");
		for (People p : ps) {
			if (p instanceof DepartmentHead dh) {
				System.out.println(" - " + dh.getName() + ": " + dh.calculateSalary());
			}
		}

		System.out.println("\n -> Employees:");
		for (People p : ps) {
			if (p instanceof Employee e) {
				System.out.println(" - " + e.getName() + ": " + e.calculateSalary());
			}
		}
	}
}
