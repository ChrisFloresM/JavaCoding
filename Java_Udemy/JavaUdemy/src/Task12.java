import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the radius in cm: ");
        int radius = scan.nextInt();

        double area = Math.PI * Math.pow((double)radius, 2);
        System.out.println("A circle of radius " + radius + " contains an area of " + Math.round(area) + " cm2");
    }
}
