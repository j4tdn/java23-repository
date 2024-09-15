package Ex01Students;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		   
		        List<Students> students = new ArrayList<>();
		        
		        // new Student(Mã SV, "Họ tên", Xếp loại)
		        
		        students.add(new Students(102, "Nam", Arrange.C));
		        students.add(new Students(103, "Bảo", Arrange.F));
		        students.add(new Students(104, "Hoàng", Arrange.D));
		        students.add(new Students(105, "Nguyên", Arrange.B));
		        students.add(new Students(107, "Vũ", Arrange.F));
		        students.add(new Students(109, "Lan", Arrange.A));
		        students.add(new Students(202, "Đạt", Arrange.C));
		        students.add(new Students(103, "Bảo", Arrange.F));
		        students.add(new Students(107, "Vũ", Arrange.C));
		        students.add(new Students(104, "Hoàng", Arrange.B));
		        

		        List<Students> ListAStudents = new ArrayList<>();
		        List<Students> ListReStudying = new ArrayList<>();

		        for (Students student : students) {
		            if (student.getArrange() == Arrange.A) {
		            	ListAStudents.add(student);
		            }
		            if (student.getArrange() == Arrange.F) {
		            	ListReStudying.add(student);
		            }
		        }
		        
		        System.out.println("Danh sách sinh viên từng đạt loại A năm 2021: ");
		      
		        
		        
		        System.out.println("Danh sách sinh viên đã tham gia học lại CTDL năm 2024: ");
		        
		      
		        
		        
		       
	}
}
		       