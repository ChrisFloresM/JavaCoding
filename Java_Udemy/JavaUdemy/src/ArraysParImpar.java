import java.util.Scanner;

public class ArraysParImpar {

    public static int[] encuentraParesImpares(int[] array)
    {
        int countImpar = 0;

        for (int j : array) {
            if (j % 2 != 0) {
                countImpar++;
            }
        }

        int[] result = new int[countImpar];
        int resultElement = 0;
        for(int j : array)
        {
            if (j % 2 != 0) {
                result[resultElement++] = j;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] myArray = {0, 1 , 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = encuentraParesImpares(myArray);

        System.out.println("Se encontraron los siguientes números impares: ");
        for(int i : result)
        {
            System.out.print(i + " ");
        }
    }
}
