package localdatatime;

import java.lang.classfile.ClassFile.Option;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import utils.DateUtils.*;

public class Ex02LocalTimeDemo {
	
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		LocalTime ltime1 = LocalTime.of(10, 12, 10);
		LocalTime ltime2 = LocalTime.of(18, 25, 30);
		
		System.out.println("ltime1: " + ltime1);
		System.out.println("ltime2 format: " + df.format(ltime2));

		//TimeUnit
		//Hiệu của LoaclTime: Duration
		Duration dur = Duration.between(ltime1, ltime2);
		System.out.println("duration: " +dur);
		System.out.println("duration details: " + 
		opt(dur.toHoursPart(), "hour") + 
		opt(dur.toMinutesPart(), "minute") +
		opt(dur.toSecondsPart(), "second"));
		
	}
	public static String opt(long value, String unit) {
		if(value <=0) {
			return "";
		}
		return value + " " + unit + (value > 1 ? "(s)" : "") + " ";
	}
}
