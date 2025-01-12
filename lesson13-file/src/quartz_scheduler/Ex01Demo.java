package quartz_scheduler;

import java.util.List;

import bean.BankTransaction;
import model.DataModel;

public class Ex01Demo {
	public static void main(String[] args) {
		// Lập lịch 23H hằgn ngày;

		List<BankTransaction> transactions = DataModel.mockBankTransaction();

		List<BankTransaction> failTrans = transactions.stream().filter(t -> !t.getIsSuccess()).toList();

		System.out.println("Fail trans: ");
		failTrans.forEach(System.out::println);
	}
}
