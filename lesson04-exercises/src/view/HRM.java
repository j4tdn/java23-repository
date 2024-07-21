package view;

import java.util.Scanner;

import bean.Attribute;
import bean.Director;
import bean.Employee;
import bean.Manager;

public class HRM {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Director D1 = new Director();
		Manager M1 = new Manager();
		Manager M2 = new Manager();
		Employee E1 = new Employee();
		Employee E2 = new Employee();
		Employee E3 = new Employee();
		Employee E4 = new Employee();
		Employee E5 = new Employee();
		Employee E6 = new Employee();

		Employee[] employees = {E1,E2};//,E3,E4,E5,E6};
		Manager[] managers = {M1,M2};

		inputD(D1);
		inputM(M1);
		inputM(M2);
		inputE(E1);
		inputE(E2);
		inputE(E3);
		inputE(E4);
		inputE(E5);
		inputE(E6);

		System.out.println(D1);
		System.out.println(M1);
		System.out.println(M2);
		System.out.println(E1);
		System.out.println(E2);
		System.out.println(E3);
		System.out.println(E4);
		System.out.println(E5);
		System.out.println(E6);
		
		caculateSalary(employees);
//		employeeManager(employees, managers);
		
//		Employee[] employee = { E1, E2, E3, E4, E5, E6 };
//		for (int i = 1; i <= employee.length; i++) {
//			inputE(employee[i]);
//			System.out.println(employee[i]);
//		}

	}

	static void inputD(Director director) {
		System.out.println("Input name: ");
		
		director.setName(sc.nextLine());
		System.out.println("Input Date of Birth: ");
		director.setDateOfBirth(sc.nextLine());
		System.out.println("Input salary coefficient: ");
		director.setSalaryCoefficient(Integer.parseInt(sc.nextLine()));
		System.out.println("Input position coefficient: ");
		director.setPositionCoefficient(Integer.parseInt(sc.nextLine()));

	}

	static void inputM(Manager manager) {
		System.out.println("Input name: ");
		manager.setName(sc.nextLine());
		System.out.println("Input Date of Birth: ");
		manager.setDateOfBirth(sc.nextLine());
		System.out.println("Input salary coefficient: ");
		manager.setSalaryCoefficient(Integer.parseInt(sc.nextLine()));
		System.out.println("Input position coefficient: ");
		manager.setPositionCoefficient(Integer.parseInt(sc.nextLine()));
		System.out.println("Input unit: ");
		manager.setUnit(sc.nextLine());

	}

	static void inputE(Employee employee) {
		System.out.println("Input name: ");
		employee.setName(sc.nextLine());
		System.out.println("Input Date of Birth: ");
		employee.setDateOfBirth(sc.nextLine());
		System.out.println("Input salary coefficient: ");
		employee.setSalaryCoefficient(Integer.parseInt(sc.nextLine()));
		System.out.println("Input unit: ");
		employee.setUnit(sc.nextLine());
		System.out.println("Your manager: ");
		employee.setManager(sc.nextLine());

	}

//	private static void employeeManager(Employee[] employees, Manager[] managers) {
//		for(Employee employee : employees ) {
//			for(Manager manager : managers) {
//			int count = 0;
//			if(employee.getManager().equals(manager.getName())) {
//	           count++;
//				count += count;
//			}
//			System.out.println(+count);
////			return ;
//		}
//	}
//	}
	
	public static void caculateSalary(Attribute[] attribute) {
		for(Attribute attributes : attribute) {
			System.out.println(attributes.getName() + "-->" + attributes.calculateSalary());
		}
	}
	
}
