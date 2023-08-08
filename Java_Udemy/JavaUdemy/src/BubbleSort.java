import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArray = new int[5];
        int count = 0;

        for(int i = 0; i < 4; i++)
        {
            System.out.print("Ingrese numero " + (i+1) + ": ");
            numbersArray[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("El arreglo ingresado es: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Numero " + i + ": " + numbersArray[i]);
        }

     /* for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(numbersArray[i] < numbersArray[j])
                {
                    int aux = numbersArray[i];
                    numbersArray[i] = numbersArray[j];
                    numbersArray[j] = aux;
                }

                count++;
            }
        }*/

        /* Algoritmo optimizado */
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 4-i; j++)
            {
                if(numbersArray[j] > numbersArray[j+1])
                {
                    int aux = numbersArray[j];
                    numbersArray[j] = numbersArray[j+1];
                    numbersArray[j+1] = aux;
                }
                count++;
            }
        }

        System.out.println();
        System.out.println("El arreglo ordenado de menor a mayor es: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Numero " + i + ": " + numbersArray[i]);
        }
        System.out.println("Numero de iteraciones: " + count);
    }
}
