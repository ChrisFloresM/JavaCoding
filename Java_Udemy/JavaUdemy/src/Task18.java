import java.util.Scanner;

public class Task18 {

    public static void printMatrix(char[][] matrix)
    {
        for(char[] row:matrix)
        {
            for(char element:row)
            {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la X (Mínimo 2): ");

        int size = scan.nextInt();
        if(size == 0)
        {
            System.out.println("ERROR");
            System.exit(1);
        }

        char[][] matrizX = new char[size][size];

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(i == j || j == (size - i -1))
                {
                    matrizX[i][j] = 'x';
                }
                else
                {
                    matrizX[i][j] = '_';
                }
            }
        }
        printMatrix(matrizX);
    }

}
