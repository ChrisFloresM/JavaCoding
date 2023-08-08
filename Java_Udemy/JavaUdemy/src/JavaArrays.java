public class JavaArrays {

    public static void main(String[] args) {
        //Array declaration
        int[] arr = new int[3];
        int totalArr = arr.length;

        for(int i = 0; i < totalArr; i++)
        {
            arr[i] = i;
        }

        System.out.println("The sorted array is: ");
        for(int i = 0; i < totalArr; i++)
        {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }

        System.out.println(System.lineSeparator());

        System.out.println("The backwards sorted array is: ");
        for(int i = totalArr - 1; i >= 0; i--)
        {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
    }
}
