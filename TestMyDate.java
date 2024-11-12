package progexec;

public class TestMyDate {
    public static void main(String[] args) {
        // Create MyDate object for the current date
        MyDate currentDate = new MyDate();
        System.out.println("Current Date: ");
        System.out.println("Year: " + currentDate.getYear());
        System.out.println("Month: " + (currentDate.getMonth() + 1));  // Month is 0-based
        System.out.println("Day: " + currentDate.getDay());

        // Create MyDate object with specified elapsed time
        MyDate specificDate = new MyDate(34355555133101L);
        System.out.println("\nDate with elapsed time 34355555133101L: ");
        System.out.println("Year: " + specificDate.getYear());
        System.out.println("Month: " + (specificDate.getMonth() + 1));  // Month is 0-based
        System.out.println("Day: " + specificDate.getDay());
    }
}
