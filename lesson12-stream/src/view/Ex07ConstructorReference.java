package view;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;

public class Ex07ConstructorReference {

	public static void main(String[] args) {
		// Constructor reference with constructor 0,1,2,3,4,n param

		// Có hàm nào, có tham số là Supplier<T>, cần truyền supplier cho dối tượng
		// --> khởi tạo supplier để tạo ra đối tượng cho TestCon

		Supplier<TestCon> supplier = () -> new TestCon();
		supplier = TestCon::new;
	}

	static class TestCon {
		private Integer a1;
		private String a2;
		private LocalDate a3;
		private BigDecimal a4;

		public TestCon() {
		}

		public TestCon(Integer a1, String a2, LocalDate a3, BigDecimal a4) {
			this.a1 = a1;
			this.a2 = a2;
			this.a3 = a3;
			this.a4 = a4;
		}
	}
}

