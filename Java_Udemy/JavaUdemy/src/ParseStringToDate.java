import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ParseStringToDate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese una fecha en formato dd/MM/yyyy: ");
        String inputDate = scan.next();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Calendar myCalendar = Calendar.getInstance();

        try{
            Date myDate = format.parse(inputDate);
            myCalendar.setTime(myDate);
            System.out.println("The input date is " + format.format(myDate) + " and the week number of the year is: " + myCalendar.get(Calendar.WEEK_OF_YEAR));
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Please, input a valid date next time. Finishing program");
        }

    }
}
