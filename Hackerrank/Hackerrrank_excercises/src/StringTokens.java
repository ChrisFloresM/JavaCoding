import java.util.Scanner;


public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] test = {};
        String inputString = scan.nextLine();
        inputString = inputString.trim();
        String[] tokens = inputString.split("[ !,?._'@]+");

        if(inputString.isEmpty()) {
            System.out.println(0);
        }
        else{
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }

    }
}
