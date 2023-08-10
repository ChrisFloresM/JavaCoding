public class Matrices {
    public static void main(String[] args) {
        //Matrices con columnas variables
        int[][] matriz = new int[4][];

        matriz[0] = new int[2];
        matriz[1] = new int[4];
        matriz[2] = new int[1];
        matriz[3] = new int[6];

        for (int[] row : matriz) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }

        //Verifica matriz simetrica
        int[][] simMatriz = {
                {1, 2, 4, 6},
                {2, 5, 3, 2},
                {4, 3, 7, 9},
                {6, 5, 9, 9}
        };
        boolean isSimetric = true;

        mainLoop: for(int i = 0; i < simMatriz.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(simMatriz[i][j] != simMatriz[j][i])
                {
                    isSimetric = false;
                    break mainLoop;
                }
            }
        }

        if(isSimetric)
        {
            System.out.println("La matriz es simetrica");
        }
        else
        {
            System.out.println("La matriz no es simetrica");
        }

    }
}
