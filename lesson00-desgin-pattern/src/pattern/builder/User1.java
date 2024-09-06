package pattern.builder;

import java.time.LocalDate;

/*
  Builder pattern
 
  Cách 1: Để tạo đối tượng cho class User1 
       ---> Bên trong class User1 tạo ra class gọi là Builder
       ---> Sử dụng Builder để build ra đối tượng của User1
       --->
 */

public class User1 {
	 private Integer id;
	 private String name;
	 private Integer age;
	 private LocalDate startedDate;
	 private String address;
	 
	 private User1() {

	 }

}
