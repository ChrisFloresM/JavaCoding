import java.util.Arrays;
import java.util.Scanner;

public class JavaSubArray {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n = Integer.parseInt(scan.nextLine());
            int[] arr = new int[n];
            int totalNegative = 0;
            String[] inputArr = scan.nextLine().split(" ");

            for(int i = 0; i < n; i++)
            {
                arr[i] = Integer.parseInt(String.valueOf(inputArr[i]));
            }

            for(int i = 0; i <= arr.length-1; i++)
            {
                for(int j = i+1; j <= arr.length; j++)
                {
                    int [] currArr = Arrays.copyOfRange(arr, i, j);
                    int sumArr = Arrays.stream(currArr).sum();
                    if(sumArr < 0) totalNegative++;
                }
            }

            System.out.println(totalNegative);
    }
}
