import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClaseCalendar {

    public static void main(String[] args) {
        Calendar myCalendar = Calendar.getInstance();

        //Assign a specific date
        myCalendar.set(2023, Calendar.JANUARY, 3);
        Date myDate = myCalendar.getTime();
        System.out.println("First date without formatting: " + myDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("First date formatted: " + dateFormat.format(myDate));

        //Assigning using fields
        myCalendar.set(Calendar.YEAR, 2021);
        myCalendar.set(Calendar.MONTH, Calendar.MARCH);
        myCalendar.set(Calendar.DAY_OF_MONTH, 25);
        Date myDate2 = myCalendar.getTime();
        System.out.println("Second date without formatting: " + myDate2);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy, MM, dd");
        System.out.println("Second date with formatting: " + dateFormat2.format(myDate2));
    }
}
