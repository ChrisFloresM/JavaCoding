import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(2023, 7, 10);
        DayOfWeek dayOfTheWeek = date.getDayOfWeek();
        return dayOfTheWeek.toString();
    }

}

public class DateAndTime {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day = scan.nextInt();
        int year = scan.nextInt();

        System.out.println(Result.findDay(month, day, year));
    }
}
