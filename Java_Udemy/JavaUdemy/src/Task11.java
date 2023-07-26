import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Task11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar currentCalendar = Calendar.getInstance();

        int currentDay = currentCalendar.get(Calendar.DAY_OF_MONTH);
        int currentMonth = currentCalendar.get(Calendar.MONTH);
        int currentYear = currentCalendar.get(Calendar.YEAR);

        System.out.print("Input your birth date on format dd/MM/yyyy: ");
        String inputDateString = scan.next();

        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date inputDate = inputDateFormat.parse(inputDateString);
            Calendar inputCalendar = Calendar.getInstance();
            inputCalendar.setTime(inputDate);
            int totalAge = ((currentYear - 1) - inputCalendar.get(Calendar.YEAR));
            if(currentMonth == inputCalendar.get(Calendar.MONTH))
            {
                if(currentDay >= inputCalendar.get(Calendar.DAY_OF_MONTH))
                {
                    totalAge += 1;
                }
            }
            else if(currentMonth > inputCalendar.get(Calendar.MONTH))
            {
                totalAge += 1;
            }

            System.out.println("Tienes " + totalAge + " años");

        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
