import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class BigDecimalEx {

    public static void main(String []args){

        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
/*
        for(int i = 0; i < s.length-1; i++){
            for(int j = i+1; j < s.length; j++){
                BigDecimal a = new BigDecimal(s[i]);
                BigDecimal b = new BigDecimal(s[j]);

                if (a.compareTo(b) < 0){
                    String temp = s[j];
                    s[j] = s[i];
                    s[i] = temp;
                }
            }
        }
*/

        Arrays.sort( s, 0,n, (s1,s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1)));
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
