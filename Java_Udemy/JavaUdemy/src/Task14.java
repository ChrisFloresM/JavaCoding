import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte arraySize = 7;
        int[] array = new int[arraySize];
        int max_value = 11;

        System.out.println("Ingrese valores entre 11 y 99");
        for(int i = 0; i < arraySize; i++)
        {
            do {
                System.out.print("Ingrese array[" + i + "]: ");
                array[i] = scan.nextInt();
                if(array[i] < 11 || array[i] > 99)
                {
                    System.out.println("Ingrese un valor entre 11 y 99");
                }
            } while(array[i] < 11 || array[i] > 99);
        }

        for(int i : array)
        {
            max_value = Math.max(i, max_value);
        }

        System.out.println();
        System.out.print("El valor máximo en el arreglo es: " + max_value);
    }
}
