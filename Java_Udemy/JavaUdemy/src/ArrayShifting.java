public class ArrayShifting {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int totalLen = myArray.length;
        int aux = myArray[totalLen-1];

        //Método 1
/*        for(int i = 0; i < totalLen - 1; i+=2)
        {
            aux1 = myArray[i];
            myArray[i] = aux2;
            aux2 = myArray[i+1];
            myArray[i+1] = aux1;
        }*/

        //Método 2
        for(int i = totalLen-2; i >= 0; i--)
        {
            myArray[i+1] = myArray[i];
        }
        myArray[0] = aux;

        System.out.println("El arreglado desplazado es: ");
        for(int i : myArray)
        {
            System.out.print(i + " ");
        }
    }
}
