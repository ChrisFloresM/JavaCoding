import java.sql.SQLOutput;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double promMayCinc = 0.0;
        double promMenCua = 0.0;
        byte totNotUn = 0, totNotCinc = 0, totNotCua = 0;

        for(int i = 0; i < 20; i++){
            System.out.println("Ingrese nota del estudiante " + (i+1) + ":");
            double notaActual = scan.nextDouble();

            if(notaActual == 0){
                System.out.println("Error. Programa finalizado");
                break;
            }

            if(notaActual > 5.0){
                promMayCinc += notaActual;
                totNotCinc++;
            } else if(notaActual < 4.0) {
                promMenCua += notaActual;
                totNotCua++;

                if(notaActual == 1.0){
                    totNotUn++;
                }
            }
        }

        totNotCinc = totNotCinc == 0 ? 1 : totNotCinc;
        totNotCua = totNotCua == 0 ? 1 : totNotCua;

        System.out.println("El promedio de las notas mayores a 5 es: " + promMayCinc/(double)totNotCinc);
        System.out.println("El promedio de las notas menores a 4 es: " + promMenCua/(double)totNotCua);
        System.out.println("El total de las notas iguales a 1 es: " + totNotUn);
    }
}
