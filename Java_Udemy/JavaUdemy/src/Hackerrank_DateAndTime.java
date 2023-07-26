import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Result {

    public static String findDay(int month, int day, int year){
        Calendar myCalendar = Calendar.getInstance();

        myCalendar.set(Calendar.DAY_OF_MONTH, day);
        myCalendar.set(Calendar.MONTH, month);
        myCalendar.set(Calendar.YEAR, year);

        int dayOfWeek = myCalendar.get(Calendar.DAY_OF_WEEK);
        String result = "";
        switch(dayOfWeek)
        {
            case 1 -> result = "domingo";
            case 2 -> result = "lunes";
            case 3 -> result = "martes";
            case 4 -> result = "miércoles";
            case 5 -> result = "jueves";
            case 6 -> result = "viernes";
            case 7 -> result = "sábado";
        }

        return result;
    }
}
public class Hackerrank_DateAndTime {

    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd yyyy");

        Date myDate = dateFormat.parse(scan.nextLine());

        Calendar myCalendar = Calendar.getInstance();
        myCalendar.setTime(myDate);

        int inputMonth = myCalendar.get(Calendar.MONTH);
        int inputDay = myCalendar.get(Calendar.DAY_OF_MONTH);
        int inputYear = myCalendar.get(Calendar.YEAR);

        String res = Result.findDay(inputMonth, inputDay, inputYear);
        SimpleDateFormat dateOutputFormat = new SimpleDateFormat("dd 'de' MMMM 'del' yyyy");
        System.out.println("El dia " + dateOutputFormat.format(myDate) + " cae en " + res);
    }
}
