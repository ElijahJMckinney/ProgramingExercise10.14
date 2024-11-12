package progexec;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;  // 0-based, January is 0
    private int day;

    // No-arg constructor that creates a MyDate object for the current date
    public MyDate() {
        Calendar calendar = new GregorianCalendar();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor with specified elapsed time since midnight, Jan 1, 1970
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor with specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    // Method to set a new date for the object using elapsed time
    public void setDate(long elapsedTime) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
}
