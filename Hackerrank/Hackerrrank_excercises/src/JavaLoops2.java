import java.util.*;
import java.io.*;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int power = 0;
            double sum = a;
            do {
                sum += Math.pow(2, power)*b;
                System.out.printf("%d ", (int)sum);
                power++;
            }while (power < n );
        }
        in.close();
    }
}
