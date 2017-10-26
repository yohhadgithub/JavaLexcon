package chapter4;


import java.time.*;

import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Created by Solidbeans on 2017-01-16.
 */
public class Java8Time {

    public static void main(String args[]) {


        //   dateTime();
        //   timeZones();
        //  dateTimeDiff();
        //  periods();
           duration();
    }

    public static void dateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentDateTime);

        LocalDate currentDate = currentDateTime.toLocalDate();
        System.out.println("Current Date: " + currentDate);

        LocalTime currentTime = currentDateTime.toLocalTime();
        System.out.println("Current Time: " + currentTime);

        Month month = currentDateTime.getMonth();
        DayOfWeek dayOfWeek = currentDateTime.getDayOfWeek();
        int day = currentDateTime.getDayOfMonth();
        int seconds = currentDateTime.getSecond();

        System.out.println("Month: " + month + " " + month.getValue() + "  Day: " + dayOfWeek + " " + day + " Seconds: " + seconds);

        LocalDateTime anotherDateTime = currentDateTime.withYear(2012).withDayOfMonth(10);
        System.out.println("Another Date Time: " + anotherDateTime);

        LocalDate anotherDate = LocalDate.of(2014, Month.DECEMBER, 13);
        System.out.println("Another Date: " + anotherDate);

        LocalTime anotherTime = LocalTime.of(22, 15);
        System.out.println("Another Time: " + anotherTime);

        LocalTime anotherTime2 = LocalTime.parse("20:15:30");
        System.out.println("Another Time 2: " + anotherTime2);
    }

    public static void timeZones() {
        ZonedDateTime dateZoned1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("Zoned date1: " + dateZoned1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id.getId());

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);

        ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Asia/Karachi"));
        System.out.println("Time in Asia/Karachi: " + zdt);
    }

    public static void dateTimeDiff() {
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);

        LocalDate lastMonth = today.minus(1, ChronoUnit.MONTHS);
        System.out.println("Last month: " + lastMonth);
    }

    public static void periods() {
        LocalDate localdate1 = LocalDate.now();
        LocalDate localdate2 = localdate1.minus(2, ChronoUnit.MONTHS).plus(1,ChronoUnit.DAYS);
        Period period = Period.between(localdate2, localdate1);
        System.out.println("Period: " + period );
    }

    public static void duration() {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = time1.plus(2, ChronoUnit.HOURS);
        Duration duration = Duration.between(time1, time2);
        System.out.println("Duration: " + duration);
        ZoneId currentZone = ZoneId.systemDefault();
        Date currentDate = new Date();
        Instant now = currentDate.toInstant();
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
        System.out.println("zonedDateTime: " + zonedDateTime);

    }
}
