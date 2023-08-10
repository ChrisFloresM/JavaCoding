import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz (minimo 2): ");
        int size = scan.nextInt();
        if(size < 2) {
            System.out.println("ERROR");
            System.exit(1);
        }

        int[][] matrix = new int[size][size];
        int delimiter = size/2;

        for(int i = 0; i < size; i++) {
            matrix[i][0] = 1;
            if (i > delimiter) {
                matrix[i][size-1] = 1;
            }
        }

        for(int i = 1; i < size; i++) {
            matrix[delimiter][i] = 1;
        }

        for(int[] row:matrix) {
            for(int element:row){
                System.out.print(element);
            }
            System.out.println();
        }

    }

}
