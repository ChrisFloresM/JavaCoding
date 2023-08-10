import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte arraySize = 7;
        int[] array = new int[arraySize];
        int sumPos = 0, totPos = 0;
        int sumNeg = 0, totNeg = 0;
        int sumZeros = 0;
        float promPos = 0.0f;
        float promNeg = 0.0f;

        for(int i = 0; i < arraySize; i++)
        {
            System.out.print("Ingrese array[" + i + "]: ");
            array[i] = scan.nextInt();
        }

        for(int i:array)
        {
            if(i > 0)
            {
                sumPos += i;
                totPos++;
            }
            else if(i < 0)
            {
                sumNeg += i;
                totNeg++;
            }
            else
            {
                sumZeros++;
            }
        }

        if(totPos > 0)
        {
            promPos = (float)sumPos/(float)totPos;
        }

        if(totNeg >  0)
        {
            promNeg = (float)sumNeg/(float)totNeg;
        }

        System.out.println("El promedio de números positivos es: " + promPos);
        System.out.println("El promedio de números negativos es: " + promNeg);
        System.out.println("El total de zeros en el arreglo es:  " + sumZeros);
    }
}
