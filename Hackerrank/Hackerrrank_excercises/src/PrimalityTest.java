import java.util.*;
import java.math.BigInteger;

public class PrimalityTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger n = new BigInteger(scan.nextLine());

        if(n.isProbablePrime(10)){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
