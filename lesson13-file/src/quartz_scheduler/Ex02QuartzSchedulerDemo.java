package quartz_scheduler;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import bean.BankTransaction;
import model.DataModel;

public class Ex02QuartzSchedulerDemo {
	public static void main(String[] args) throws SchedulerException {
		// Lập lịch - scheduler
		// Thời gian, thời điểm nào
		// Vd: T5 hàng tuần 5h.
		// 10H mỗi ngày ...
		// --> Trigger

		// Công việc thực hiện
		// --> Job

		// Chèn log, send email trước, sau khi Job ...
		// JobListener

		// ====================================
		System.out.println("Start application");

		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler = schedulerFactory.getScheduler();

		// the scheduler will not act on any triggers
		// it has been started only with start() method
		scheduler.start();
		
		JobDetail jobDetail = JobBuilder.newJob(FailedTransactionsJob.class)
				.withIdentity("failedTranJob", "group-1")
					.build();
		
		// Seconds, Minutes Hours, DayOfMonth, month, dayofweek
		// simple schedule --> cấu hình đơn giản
		// cron schedule --> cấu hình thời gian theo pattern
		
		/*Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("failedTranTrigger", "group-1")
				.withSchedule(CronScheduleBuilder.cronSchedule("0 37 11 * * ?"))
				.build();*/
		
		Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("failedTranTrigger", "group-1")
				.startAt(time("09/11/2024 12:41:00"))
				.withSchedule(SimpleScheduleBuilder.simpleSchedule()
						.withIntervalInSeconds(10)
						.withRepeatCount(3))
					
				.build();
				
		// Seconds, Minutes Hours, DayOfMonth, month, dayofweek
		// lập lịch cho job nào ở tdiem trigger
		scheduler.scheduleJob(jobDetail, trigger);
	}

	public static Date time(String value) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			return df.parse(value);
		} catch (ParseException e) {
			return new Date();
		}
	}

}
