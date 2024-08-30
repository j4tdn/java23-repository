package view;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Ex03 {

    public static void main(String[] args) {
        Ex03 ex03 = new Ex03();

        ex03.displayCurrentTimeInZone("Asia/Ho_Chi_Minh");
        ex03.displayLastDayOfCurrentMonth();
        ex03.displayFirstAndLastDayOfCurrentWeek();
        ex03.displayCurrentWeekOfYear();
        ex03.displayDateAfterTwentyDays();
        ex03.displayDaysLivedSince("03/02/1995");
    }

    private void displayCurrentTimeInZone(String zoneId) {
        String formattedTime = formatCurrentTimeInZone(zoneId, "dd/MM/yyyy HH:mm:ss");
        System.out.println("Current time in " + zoneId + ": " + formattedTime);
    }

    private String formatCurrentTimeInZone(String zoneId, String pattern) {
        ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(zoneId));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return currentTime.format(formatter);
    }

    private void displayLastDayOfCurrentMonth() {
        String formattedLastDay = formatDate(getLastDayOfCurrentMonth(), "dd/MM/yyyy");
        System.out.println("The last day of this month is: " + formattedLastDay);
    }

    private LocalDate getLastDayOfCurrentMonth() {
        return LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
    }

    private void displayFirstAndLastDayOfCurrentWeek() {
        LocalDate firstDay = getFirstDayOfCurrentWeek();
        LocalDate lastDay = getLastDayOfCurrentWeek();
        System.out.println("First day of this week: " + formatDate(firstDay, "dd/MM/yyyy"));
        System.out.println("Last day of this week : " + formatDate(lastDay, "dd/MM/yyyy"));
    }

    private LocalDate getFirstDayOfCurrentWeek() {
        return LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
    }

    private LocalDate getLastDayOfCurrentWeek() {
        return LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
    }

    private void displayCurrentWeekOfYear() {
        int weekNumber = getCurrentWeekOfYear();
        System.out.println("Today is in week number " + weekNumber + " of this year.");
    }

    private int getCurrentWeekOfYear() {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        return LocalDate.now().get(weekFields.weekOfWeekBasedYear());
    }

    private void displayDateAfterTwentyDays() {
        LocalDate futureDate = getDateAfterDays(20);
        System.out.println("The date 20 days from now will be: " + formatDate(futureDate, "dd/MM/yyyy") + 
                           " and it will be " + futureDate.getDayOfWeek());
    }

    private LocalDate getDateAfterDays(int days) {
        return LocalDate.now().plusDays(days);
    }

    private void displayDaysLivedSince(String birthDateString) {
        long daysLived = calculateDaysLived(birthDateString, "dd/MM/yyyy");
        System.out.println("You have lived for " + daysLived + " days.");
    }

    private long calculateDaysLived(String birthDateString, String pattern) {
        LocalDate birthDate = LocalDate.parse(birthDateString, DateTimeFormatter.ofPattern(pattern));
        return ChronoUnit.DAYS.between(birthDate, LocalDate.now());
    }

    private String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
