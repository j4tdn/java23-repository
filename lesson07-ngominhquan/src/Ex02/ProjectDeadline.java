package Ex02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

public class ProjectDeadline {
	
	public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 6, 7);
        int workDaysRequired = 110;

        Set<LocalDate> holidays = new HashSet<>();
        holidays.add(LocalDate.of(2022, 9, 2));
        holidays.add(LocalDate.of(2022, 4, 30));

        LocalDate deadline = calculateDeadline(startDate, workDaysRequired, holidays);

        System.out.println("Ngay nhom A ban giao san pham la: " + deadline);
    }

    public static LocalDate calculateDeadline(LocalDate startDate, int workDaysRequired, Set<LocalDate> holidays) {
        LocalDate currentDate = startDate;
        int workDaysCounted = 0;

        while (workDaysCounted < workDaysRequired) {
            currentDate = currentDate.plus(1, ChronoUnit.DAYS);

            if (isWorkingDay(currentDate, holidays)) {
                workDaysCounted++;
            }
        }

        return currentDate;
    }

    public static boolean isWorkingDay(LocalDate date, Set<LocalDate> holidays) {
        if (date.getDayOfWeek().getValue() >= 6) {
            return false;
        }

        if (holidays.contains(date)) {
            return false;
        }

        return true;
    }

}
