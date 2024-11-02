package view;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import common.BuFunction;

public class Ex07ConstructorReference {

	public static void main(String[] args) {
		// Constructor reference with constructor 0,1,2,3,4,n param

		// Dạng 1: constructor reference cho hàm rỗng

		// Có hàm nào, có tham số là Supplier<T>, cần truyền supplier cho dối tượng
		// --> khởi tạo supplier để tạo ra đối tượng cho TestCon

		Supplier<TestCon> supplier = () -> new TestCon();
		supplier = TestCon::new;

		// Dạng 2: constructor dạng 2 tham số
		BiFunction<Integer, String, TestCon> bf = (a1, a2) -> new TestCon(a1, a2);
		System.out.println("bf --> " + bf.apply(3, "a"));

		bf = TestCon::new;
		System.out.println("bf --> " + bf.apply(4, "B"));
		
		// Dạng 3: constructor reference cho hàm khởi tạo có 1 tham số
		Function<BigDecimal, TestCon> fc = (a) -> new TestCon(a);

		fc = TestCon::new;
		System.out.println("fc -->" + fc.apply(new BigDecimal(4)));

		BuFunction<Integer, String, LocalDate, BigDecimal, TestCon> buFunct = (a1, a2, a3, a4) -> new TestCon(a1, a2,
				a3, a4);

		// static method refe
		buFunct = Ex07ConstructorReference::test;

		// constructor ref
		buFunct = TestCon::new;
		
		System.out.println(buFunct.apply(1, "buF", LocalDate.now(), BigDecimal.valueOf(4)));
	}

	public static TestCon test(Integer a1, String a2, LocalDate a3, BigDecimal a4) {
		return new TestCon(a1, a2, a3, a4);
	}

	static class TestCon {
		private Integer a1;
		private String a2;
		private LocalDate a3;
		private BigDecimal a4;

		public TestCon() {
		}

		public TestCon(Integer a1, String a2) {
			this.a1 = a1;
			this.a2 = a2;
		}

		public TestCon(BigDecimal a4) {
			this.a4 = a4;
		}

		public TestCon(Integer a1, String a2, LocalDate a3, BigDecimal a4) {
			this.a1 = a1;
			this.a2 = a2;
			this.a3 = a3;
			this.a4 = a4;
		}

		public TestCon(String line) {
			String[] tokens = line.split(line);
			if (tokens.length == 4) {
				this.a1 = Integer.parseInt(tokens[0]);
				this.a2 = tokens[1];
				this.a3 = LocalDate.parse(tokens[2], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
				this.a4 = new BigDecimal(tokens[3]);
			}
		}

		@Override
		public String toString() {
			return "TestCon [a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4 + "]";
		}

	}
}

