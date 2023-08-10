import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = 10;
        int[] array = new int[arraySize];
        int currentMaxVal = 0, currentCount = 0, maxCount = 0;

        for(int i = 0; i < arraySize; i++)
        {
            System.out.print("Ingrese array[" + i + "]: ");
            array[i] = scan.nextInt();
        }

        for(int i = 0; i < arraySize; i++)
        {
            currentCount = 0;
            for(int j = 0; j < arraySize; j++)
            {
                if(array[i] == array[j])
                {
                    currentCount++;
                }
            }
            if(currentCount > maxCount)
            {
                maxCount = currentCount;
                currentMaxVal = array[i];
            }
        }

        System.out.println("La mayor ocurrencia es: " + maxCount);
        System.out.println("El elemento que mas se repite es: " + currentMaxVal);
    }
}
