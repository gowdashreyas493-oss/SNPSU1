package day6.Questions;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateAndTime
{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date: "+date);
        LocalTime time=LocalTime.now();
        System.out.println("Time: "+time);
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("Date & Time: "+dateTime);
        /*
        Display the day of the month
        display the time of the year
        display the week name, month name, month number
        E- name of the day(Mon-sun)
        D- day of the year(1-366)(including leap year)
        dd- day of the  month(1-31)
        M-month number(1-12)
        MMM-month name-jan-dec
         */
        DateTimeFormatter format=DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String formattedDateTime=dateTime.format(format);
        System.out.println("Formtted Date: "+formattedDateTime);
    }
}