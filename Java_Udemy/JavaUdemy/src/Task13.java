import java.util.Scanner;

public class Task13 {

    public static void printArray(int[] arr)
    {
        int lengthArr = arr.length;
        for(int i = 0; i < lengthArr; i++)
        {
            System.out.print("Array[" + i + "]: " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte arraySize = 10;
        int[] array = new int[arraySize];

        for(int i = 0; i < arraySize; i++)
        {
            System.out.println("Ingrese array[" + i + "]: ");
            array[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("El array ingresado es: ");
        printArray(array);

        System.out.println();
        System.out.println("El array reordenado es: ");
        for(int i = 0; i < arraySize/2; i++)
        {
            System.out.println("array[" + (arraySize-1-i) + "]: " + array[arraySize-1-i]);
            System.out.println("array[" + i + "]: " + array[i]);
        }
    }
}
