package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bean.Director;
import bean.Employee;
import bean.Manager;
import bean.Staff;

public class Ex04CompanyManagement {
	public static void main(String[] args) {
        Director director = new Director("John Doe", "01/01/1970", 3.0, 2.0);
        
        Manager manager1 = new Manager("Jane Smith", "02/02/1980", 2.5, 1.5, "IT");
        Manager manager2 = new Manager("Jack Brown", "03/03/1985", 2.8, 1.8, "HR");
        
        Staff staff1 = new Staff("Alice Green", "04/04/1990", 1.5, "IT", "Jane Smith");
        Staff staff2 = new Staff("Bob White", "05/05/1991", 1.6, "IT", "Jane Smith");
        Staff staff3 = new Staff("Charlie Black", "06/06/1992", 1.4, "IT", "Jane Smith");
        Staff staff4 = new Staff("David Blue", "07/07/1993", 1.7, "HR", "Jack Brown");
        Staff staff5 = new Staff("Eva Yellow", "08/08/1994", 1.8, "HR", "Jack Brown");
        Staff staff6 = new Staff("Frank Orange", "09/09/1995", 1.5, "HR", "Jack Brown");
        
        List<Employee> employees = new ArrayList<>();
        employees.add(director);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(staff1);
        employees.add(staff2);
        employees.add(staff3);
        employees.add(staff4);
        employees.add(staff5);
        employees.add(staff6);
        
        System.out.println("Company Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
        System.out.println("\nStaff Count by Manager:");
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                int staffCount = 0;
                for (Employee emp : employees) {
                    if (emp instanceof Staff) {
                        Staff staff = (Staff) emp;
                        if (staff.getManager().equals(manager.getName())) {
                            staffCount++;
                        }
                    }
                }
                System.out.println(manager.getName() + ": " + staffCount + " staffs");
            }
        }
        
        
        System.out.println("\nSalaries of Employees:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.calculateSalary());
        }
    }
}
