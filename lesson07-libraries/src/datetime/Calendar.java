package datetime;

public class Calendar {

//	stragery pattern
//	singleton pattern: Calendar
//	builder pattern : LocalDate,LocalTime,LocalDateTime,....

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();

		System.out.println("c --> " +c);
//	ngày tháng năm 
//		giờ(12/24) phút giây am/pm
		
		int day  = c.get(Calendar.);
				int month  = c.get(Calendar.);
				int year = c.get(Calendar.);
				
				System.out.println("+Ngày tháng năm -->" +(day + "/" + month + "/" +year));
				
				int hour  = c.get(Calendar.);
				int minute  = c.get(Calendar.);
				int second = c.get(Calendar.);
             String apText = c.get(Calendar.)  == 0 ?"AM":"PM";
             
//             Date: lưu trữ
//             Calendar: Lưu trữ và xử lý
	}
}
