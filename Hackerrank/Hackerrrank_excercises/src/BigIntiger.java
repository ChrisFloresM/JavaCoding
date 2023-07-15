import java.math.BigInteger;
import java.util.Scanner;

public class BigIntiger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();

        BigInteger aBigInteger = new BigInteger(a);
        BigInteger bBigInteger = new BigInteger(b);

        System.out.println(aBigInteger.add(bBigInteger));
        System.out.println(aBigInteger.multiply(bBigInteger));
    }
}
