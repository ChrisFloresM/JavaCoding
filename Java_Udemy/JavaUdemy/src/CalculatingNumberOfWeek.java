import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalculatingNumberOfWeek {

    public static void main(String[] args) {
        //Creating a calendar object for the actual date
        Calendar myCalendar = Calendar.getInstance();
        int weekOfYear = myCalendar.get(Calendar.WEEK_OF_YEAR);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        Date myDate1 = myCalendar.getTime();
        System.out.println("For the actual date " + dateFormat1.format(myDate1) +" the number of week of year is: " + weekOfYear);

        //Giving an specific date
        Calendar myCalendar2 = Calendar.getInstance();
        myCalendar2.set(Calendar.YEAR, 2021);
        myCalendar2.set(Calendar.MONTH, Calendar.APRIL);
        myCalendar2.set(Calendar.DAY_OF_MONTH, 23);
        Date myDate2 = myCalendar2.getTime();
        SimpleDateFormat myDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
        int weekOfYear2 = myCalendar2.get(Calendar.WEEK_OF_YEAR);
        System.out.println("For the giving date " + myDateFormat2.format(myDate2) + " the number of week of year is: " + weekOfYear2);


    }
}
