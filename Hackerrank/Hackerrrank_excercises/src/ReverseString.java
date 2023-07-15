import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        StringBuilder myStringBuilder = new StringBuilder(str);

        String reversedString = myStringBuilder.reverse().toString();

        if(str.equals(reversedString)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
