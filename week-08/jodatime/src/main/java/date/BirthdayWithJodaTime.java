package date;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Scanner;

/**
 * Created by kicsen on 2016. 11. 30..
 */
public class BirthdayWithJodaTime implements BirthdayCalculator<LocalDate> {

    @Override
    public LocalDate parseDate(String str) {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        if (str != null) {
            LocalDate ld = new LocalDate(str);

            return ld;
        }
        throw new NullPointerException();
    }

    @Override
    public String printMonthAndDay(LocalDate date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        DateTimeFormatter formatter = DateTimeFormat.forPattern("MM. dd.");
        if (date != null) {
            String formattedDate = formatter.print(date);
            return formattedDate;
        } else {
            throw new NullPointerException();
        }


    }

    @Override
    public boolean isAnniversaryToday(LocalDate date) {
        // TODO - return with true if today is the same month+day as date
        DateTime today = new DateTime();
        if (date != null) {
            return today.equals(date);
        } else {
            throw new NullPointerException();
        }

    }

    @Override
    public int calculateAgeInYears(LocalDate birthday) {
        // TODO - return how many years age the input date 'birthday' was
        DateTime today = new DateTime();
        if (birthday != null) {
            birthday = new LocalDate(birthday);
            int age = today.getYear() - birthday.getYear();
            return age;
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public int calculateDaysToNextAnniversary(LocalDate date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
        DateTime today = new DateTime();
        DateTime birthday = new DateTime(today.getYear(), date.getMonthOfYear(), date.getDayOfMonth(), today.getHourOfDay(), today.getMinuteOfHour(), today.getSecondOfMinute()+1);

        int numberOfDaysThisY = today.getDayOfYear();


        if (numberOfDaysThisY > date.getDayOfYear()) {
            birthday = birthday.plusYears(1);
            Interval interval = new Interval(today, birthday);

            return (int) interval.toDuration().getStandardDays();
        } else {
            return date.getDayOfYear() - numberOfDaysThisY;
        }

    }

    public static void main(String[] args) {
        new BirthdayWithJodaTime().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        LocalDate birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");
}
