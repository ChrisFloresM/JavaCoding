import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        int mult1 = 0;

        System.out.print("Ingrese un numero entero a multiplicar: ");
        int num1 = Integer.parseInt(scan.next());
        System.out.print("Ingrese otro numero entero a multiplicar: ");
        int num2 = Integer.parseInt(scan.next());

        scan.close();

        mult1 = num1 < 0 ? -num1 : num1;

        for(int i = 0; i < mult1; i++) {
            result += num2;
        }

        if( num1 < 0 ) {
            result = -result;
        }

        System.out.println("La operacion " + num1 + " por " + num2 + ": " + result);
    }

}
