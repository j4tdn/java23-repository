package view;

import java.util.Scanner;
import bean.Student;

public class Ex01StudentManagement {

	public static void main(String[] args) {
        
        Student student1 = new Student(27211202467L, "Vo Anh Tuan", 9.0, 8.5);
        Student student2 = new Student(27211202214L, "Ho Phuoc Viet Nam", 7.0, 6.5);
        Student student3 = new Student();
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student ID for student3: ");
        student3.setStudentID(sc.nextLong());
        sc.nextLine(); // consume newline

        System.out.println("Enter full name for student3: ");
        student3.setFullName(sc.nextLine());

        System.out.println("Enter theory mark for student3: ");
        student3.setTheoryMark(sc.nextDouble());

        System.out.println("Enter practice mark for student3: ");
        student3.setPracticeMark(sc.nextDouble());
 
        Student[] studentList = {student1, student2, student3};
 
        System.out.println("Students with an average mark greater than 8.5:");
        for (Student student : studentList) {
            if (student.calAvrMark() > 8.5) {
                System.out.println(student);
            }
        }

        System.out.println("Students with theory marks greater than practice marks:");
        for (Student student : studentList) {
            if (student.getTheoryMark() > student.getPracticeMark()) {
                System.out.println(student);
            }
        }

        sc.close();
    }
	
}
