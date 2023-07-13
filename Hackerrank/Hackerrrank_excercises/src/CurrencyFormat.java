import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();

        Locale localeIndia = Locale.of("en", "IN");

        Locale[] Currency = {Locale.US, localeIndia, Locale.CHINA, Locale.FRANCE};

        for (Locale currency : Currency) {
            System.out.println(NumberFormat.getCurrencyInstance(currency).format(payment));
        }
    }
}
