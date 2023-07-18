import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        double total = a + b;
        double taxes = total * 0.19;

        String outputMessage = "La factura " + name + " tiene un total bruto de " + total + ", con un impuesto de " + taxes + " y el monto total con impuesto es de " + (total+taxes);

        System.out.println(outputMessage);
    }
}