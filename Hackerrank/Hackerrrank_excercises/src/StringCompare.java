import java.util.Scanner;

public class StringCompare {

    public static String getSmallestAndLargest(String s, int k){
        String greater = "";
        String smallest = "";

        for (int i = 0; i < s.length(); i++) {
            if(s.substring(i).length() >= k){
                String subs = s.substring(i, (k) + i);

                if(greater.isEmpty() || (subs.compareTo(greater) > 0)){
                    greater = subs;
                }

                if(smallest.isEmpty() || subs.compareTo(smallest) < 0){
                    smallest = subs;
                }
            }
        }

        return smallest + "\n" + greater;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int k = scan.nextInt();

        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
