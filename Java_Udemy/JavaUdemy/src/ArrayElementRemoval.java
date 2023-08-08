import java.util.Scanner;

public class ArrayElementRemoval {

    public static void printArray(int[] arr)
    {
        int lengthArr = arr.length;
        for(int i = 0; i < lengthArr; i++)
        {
            System.out.println("Array[" + i + "]: " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        int lenArray = 10;

        for(int i = 0; i < lenArray; i++)
        {
            System.out.print("Ingrese array[" + i + "]: ");
            arr[i] = scan.nextInt();
        }

        System.out.println("\nEl array ingresado es: ");
        printArray(arr);

        System.out.println();
        System.out.print("Ingrese que elemento desea eliminar: ");
        int toRemove = scan.nextInt();

        for(int i = toRemove; i < lenArray-1; i++)
        {
            arr[i] = arr[i+1];
        }
        arr[lenArray - 1] = 0;

        int[] newArray = new int[lenArray - 1];
        System.arraycopy(arr, 0, newArray, 0, newArray.length);

        System.out.println();
        System.out.println("El array con el elemento removido es: ");
        printArray(newArray);
    }
}
