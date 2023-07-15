import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() == b.length()){

            char[] charArrayA = a.toLowerCase().toCharArray();
            char[] charArrayB = b.toLowerCase().toCharArray();

            Arrays.sort(charArrayA);
            Arrays.sort(charArrayB);

            String sortedA = Arrays.toString(charArrayA);
            String sortedB = Arrays.toString(charArrayB);

            return sortedA.equals(sortedB);

        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
