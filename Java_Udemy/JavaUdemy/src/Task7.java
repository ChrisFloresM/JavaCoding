import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int amountOfNumbers = 0, lesserNumber = 0;

        System.out.println("Ingrese por lo menos 10 numeros");
        do{
            amountOfNumbers = scan.nextInt();
            if(amountOfNumbers < 10) {
                System.out.println("Ingrese por lo menos 10 numeros");
            }
        } while(amountOfNumbers < 10);

        for(int i = 0; i < amountOfNumbers; i++) {
            int currentNumber = scan.nextInt();
            lesserNumber = i == 0 ? currentNumber : (currentNumber < lesserNumber ? currentNumber : lesserNumber);
        }
        scan.close();

        System.out.print("El numero menor es: " + lesserNumber);

        if(lesserNumber < 10){
            System.out.print(" y es menor que 10");
        } else {
            System.out.print(" y es mayor o igual que 10");
        }

    }
}
