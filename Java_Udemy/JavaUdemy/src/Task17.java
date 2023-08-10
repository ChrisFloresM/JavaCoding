import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte arraySize = 12;
        byte totalNumbers = 6;
        int[] array = new int[arraySize];
        int[] totalCount = new int[totalNumbers];

        System.out.println("Ingrese valores entre 1 y 6");
        for(int i = 0; i < arraySize; i++)
        {
            do {
                System.out.print("Ingrese array[" + i + "]: ");
                array[i] = scan.nextInt();
                if(array[i] < 1 || array[i] > 6)
                {
                    System.out.println("Ingrese un valor entre 1 y 6");
                }
            } while(array[i] < 1 || array[i] > 6);
        }

        for(int i : array)
        {
            totalCount[i-1]++;
        }

        for(int i = 0; i < totalNumbers; i++)
        {
            System.out.print((i+1) + ": ");
            for(int j = 0; j < totalCount[i]; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
