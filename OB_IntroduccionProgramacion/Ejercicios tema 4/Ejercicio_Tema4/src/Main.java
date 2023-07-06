// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Primer punto
        first();

        //Segundo punto
        second();

        //Tercer punto
        third();

        //Cuarto punto
        fourth();

        //Quinto punto
        fifth();
    }

    public static void first(){
        int numeroif = 3;
        if(numeroif == 0) {
            System.out.println("El numero es cero");
        }
        else if (numeroif > 0) {
            System.out.println("El numero es positivo");
        }
        else {
            System.out.println("El numero es negativo");
        }
    }

    public static void second(){
        int numeroWhile = 0;

        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }

    public static void third(){
        int numeroWhile = 2;

        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        }while(numeroWhile < 3);
    }

    public static void fourth(){
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
    }

    public static void fifth(){
        String estacion = "Primavera";

        switch(estacion){
            case "Primavera":
                System.out.println("Es primavera!");
                break;
            case "Verano":
                System.out.println("Es Verano!");
                break;
            case "Otoño":
                System.out.println("Es Otoño!");
                break;
            case "Invierno":
                System.out.println("Es Invierno!");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }
    }
}