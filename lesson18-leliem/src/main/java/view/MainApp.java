package view;

import dao.StudentDAO;
import persistence.StudentEntity;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        System.out.println("\n1. List all students by class ID:");
        dao.getStudentsByClassId(1).forEach(s -> System.out.println(s.getName()));

        System.out.println("\n2. Students with Math >= 8 & Literature >= 8:");
        dao.getStudentsWithHighScores().forEach(r ->
            System.out.println("Class: " + r[0] + ", Student: " + r[2])
        );

        System.out.println("\n3. Count students per class:");
        dao.countStudentsPerClass().forEach(r ->
            System.out.println("Class: " + r[0] + ", Count: " + r[1])
        );

        System.out.println("\n4. Students with avg >= 8.2:");
        dao.findStudentsWithAvgAbove(8.2).forEach(s ->
            System.out.println(s.getName())
        );

        System.out.println("\n5. Students with max avg per class:");
        dao.findTopAvgStudentsInClass().forEach(r ->
            System.out.println("Class: " + r[0] + ", Student: " + r[1] + ", Avg: " + r[2])
        );
    }
}
