import java.util.Arrays;
import java.util.Scanner;

public class JavaSubArrayRecursivw {

    public static int recursive(int[] arr, int init, int end, int total_negatives)
    {
        int sum = 0;

        if(end > arr.length){
            return total_negatives;
        }

        for(int i = init; i < end; i++){
            sum += arr[i];
        }

        if(sum < 0)
        {
            total_negatives++;
        }

        return recursive(arr, init, end + 1, total_negatives);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];

        String[] inputArr = scan.nextLine().split(" ");

        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(String.valueOf(inputArr[i]));
        }

        int total_negatives = 0;
        for(int i = 0; i < arr.length; i++)
        {
            total_negatives = recursive(arr, i, i+1, total_negatives);
        }

        System.out.println(total_negatives);
    }
}
