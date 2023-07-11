import java.io.*;
import java.util.*;

public class IntToString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        String s = Integer.toString(number);

        if(number == Integer.parseInt(s)) {
            System.out.println("Good Job");
        }else{
            System.out.println("Wrong Answer");
        }
    }
}
