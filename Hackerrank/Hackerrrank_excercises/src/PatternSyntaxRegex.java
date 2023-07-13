import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxRegex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfInputs = scan.nextInt();
        scan.nextLine();
        String[] inputs = new String[numberOfInputs];

        while (numberOfInputs > 0){
            try {
                Pattern.compile(scan.nextLine());
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            numberOfInputs--;
        }

    }
}
