package view;

import bean.Manager;

import java.lang.foreign.AddressLayout;

import bean.Director;
import bean.Employee;
import bean.Staff;

public class Exercise4 {

	private Employee[] empList;
	private int count;

	public Exercise4(int n) {
		empList = new Employee[n];
		count = 0;
	}
	
	public static void main(String[] args) {
		Exercise4 company = new Exercise4(10);

		Director gd = new Director("Nguyễn Văn A", "01/01/1970", 5d, 3d);
		company.add(gd);

		Manager tp1 = new Manager("Nguyễn Văn B", "02/02/1980", 4.5d, 2.3d, "IT");
		Manager tp2 = new Manager("Lê Thị C", "03/03/1985", 5.5d, 3.3d, "Media");
		company.add(tp1);
		company.add(tp2);

		Staff s1 = new Staff("Nguyen Van D", "04/04/1990", 2.5d, "IT", "Nguyễn Văn B");
		Staff s2 = new Staff("Nguyen Thi E", "05/05/1992", 2.3d, "IT ", "Lê Thị C");
		Staff s3 = new Staff("Pham Van F", "06/06/1993", 2.2d, "HR ", "Nguyễn Văn B");
		Staff s4 = new Staff("Bui Thi G", "07/07/1994", 2.4d, "HR", "Trần Văn D");
		Staff s5 = new Staff("Tran Van H", "08/08/1995", 2.1d, "IT ", "Lê Thị C");
		Staff s6 = new Staff("Le Van I", "09/09/1996", 2.0d, "HR", "Nguyễn Văn B");
		company.add(s1);
		company.add(s2);
		company.add(s3);
		company.add(s4);
		company.add(s5);
		company.add(s6);

		company.shows();
		company.countStaffPerManager();
		company.printSalary();
	}


	public void add(Employee employee) {
		if (count < empList.length) {
			empList[count] = employee;
			count++;
		} else {
			System.out.println("Cannot add more employees");
		}
	}

	public void shows() {
		System.out.println("\n============================ Staff information ===============================\n");
		for(int i=0; i< count; i++) {
			System.out.println(empList[i]);
		}
	}
	
	public void countStaffPerManager() {
		System.out.println("\n============================ Employee statistics =================================\n");
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof Manager) {
                Manager manager = (Manager) empList[i];
                int staffCount = 0;
                for (int j = 0; j < count; j++) {
                	
                    if (empList[j] instanceof Staff && ((Staff) empList[j]).getManager().equals(manager.getFullname())) {
                        staffCount++;
                    }
                }
                System.out.println("Manager: " + manager.getFullname() + " manages " + staffCount + " staff.");
            }
        }
    }
	
	public void printSalary() {
		System.out.println("\n============================ Employee Salary =================================\n");
		for (int i = 0; i < count; i++) {
			if (empList[i] instanceof Director) {
				Director director = (Director) empList[i];
				System.out.println("Director's salary= " + String.format("%,.2f VND", director.calculateSalary()));
			} 
			else if (empList[i] instanceof Manager) {
				Manager manager = (Manager) empList[i];
				System.out.println("Manager's salary= " + String.format("%,.2f VND", manager.calculateSalary()));
			} 
			else if (empList[i] instanceof Staff) {
				Staff staff = (Staff) empList[i];
				System.out.println("Staff's salary= " + String.format("%,.2f VND", staff.calculateSalary()));
			}

		}
	}
}
