import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String output = "";
        System.out.println("Ingrese la cantidad de litros en el tanque: ");
        byte litros = scan.nextByte();

        if(litros == 70)
        {
            output = "Estanque lleno";
        }
        else if(litros >= 60 && litros < 70)
        {
            output = "Estanque casi lleno";
        }
        else if(litros >= 40 && litros < 60)
        {
            output = "Estanque 3/4";
        }
        else if(litros >= 35 && litros < 40)
        {
            output = "Medio estanque";
        }
        else if(litros >= 20 && litros < 35)
        {
            output = "Suficiente";
        }
        else if(litros >= 1 && litros < 20)
        {
            output = "Insuficiente";
        }

        System.out.println(output);
    }
}
