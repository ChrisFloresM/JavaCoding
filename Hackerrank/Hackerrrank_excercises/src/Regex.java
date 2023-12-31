import java.util.regex.*;
import java.util.Scanner;

public class Regex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    String mainPattern = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern = mainPattern + "\\." + mainPattern + "\\." + mainPattern + "\\." + mainPattern;
}