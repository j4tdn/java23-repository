package view;

import bean.DepartmentHead;
import bean.Director;
import bean.Staff;

public class Ex03CompanyManagement {

	public static void main(String[] args) {
        Director director = new Director("Vo Anh Tuan", "01/01/1970", 10, 3);
        DepartmentHead head1 = new DepartmentHead("Ta Vinh Phuc", "02/02/1980", 7, 2, "Sales");
        DepartmentHead head2 = new DepartmentHead("Ho Phuoc Viet Nam", "03/03/1985", 8, 2.5, "HR");

        Staff[] staffs = new Staff[]{
            new Staff("Nguyen Tuan", "04/04/1990", 5, "Sales", head1),
            new Staff("Phuc", "05/05/1992", 6, "Sales", head1),
            new Staff("Nam", "06/06/1991", 5.5, "Sales", head1),
            new Staff("Kiet", "07/07/1989", 6, "HR", head2),
            new Staff("Dat", "08/08/1993", 5.5, "HR", head2),
            new Staff("Khoa", "09/09/1994", 6.5, "HR", head2),
        };

        System.out.println("Company Staff:");
        System.out.println(director);
        System.out.println(head1);
        System.out.println(head2);
        for (Staff staff : staffs) {
            System.out.println(staff);
        }

        System.out.println("\nEmployee count managed by each department head:");
        int countHead1 = 0, countHead2 = 0;
        for (Staff staff : staffs) {
            if (staff.getHead() == head1) {
                countHead1++;
            } else if (staff.getHead() == head2) {
                countHead2++;
            }
        }
        System.out.println(head1.getName() + ": " + countHead1 + " employees");
        System.out.println(head2.getName() + ": " + countHead2 + " employees");

        System.out.println("\nSalaries:");
        System.out.println("Director Salary: " + director.calculateSalary());
        System.out.println("Department Head Salaries:");
        System.out.println(head1.getName() + ": " + head1.calculateSalary());
        System.out.println(head2.getName() + ": " + head2.calculateSalary());
        System.out.println("Staff Salaries:");
        for (Staff staff : staffs) {
            System.out.println(staff.getName() + ": " + staff.calculateSalary());
        }
	}
}
