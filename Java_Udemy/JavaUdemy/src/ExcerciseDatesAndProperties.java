import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import java.text.SimpleDateFormat;

public class ExcerciseDatesAndProperties {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day, month, year;

        System.out.println("Input a date with the format: MM/dd/yyyy");
        try
        {
            /*Getting the date from the user */
            String inputDateString = scan.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date inputDate = dateFormat.parse(inputDateString);

            /*Obtaining the calendar object from the input date */
            Calendar myCalendar = Calendar.getInstance();
            myCalendar.setTime(inputDate);

            /*Getting the day, month and year*/
            day = Integer.toString(myCalendar.get(Calendar.DAY_OF_MONTH));
            month = Integer.toString(myCalendar.get(Calendar.MONTH));
            year = Integer.toString(myCalendar.get(Calendar.YEAR));

            /* Reading the file from user input */
            FileInputStream file = new FileInputStream(new File("JavaUdemy/src/configTests.properties"));

            /*Creating a new properties object with System properties and including the file's properties */
            Properties currentProperties = System.getProperties();
            currentProperties.load(file);
            System.setProperties(currentProperties);

            /* Printing the current properties */
            System.out.print("Old properties: ");
            System.out.println(System.lineSeparator());
            currentProperties.list(System.out);

            /* Setting properties */
            System.setProperty("config.system.inputDate.Day", day);
            System.setProperty("config.system.inputDate.Month", month);
            System.setProperty("config.system.inputDate.Year", year);

            System.out.print("New properties: ");
            currentProperties.list(System.out);

        } catch (Exception e)
        {
            System.out.println("Execution error");
            System.out.println(e);
        }

    }
}
