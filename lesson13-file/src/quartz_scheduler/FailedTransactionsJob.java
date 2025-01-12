package quartz_scheduler;

import java.time.LocalDateTime;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import bean.BankTransaction;
import model.DataModel;

public class FailedTransactionsJob implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		var transactions = DataModel
				.mockBankTransaction()
				.stream()
				.filter(t -> !t.getIsSuccess())
				.toList();

		System.out.println("Fail trans: " + LocalDateTime.now());
		transactions.forEach(System.out::println);

	}

}
