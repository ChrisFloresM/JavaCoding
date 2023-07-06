// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Parte 1
        System.out.println(suma(3, 14,27));

        //Parte 2
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println(miCoche.puertas);
    }
    //Parte 1
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

// Parte 2
class Coche {
    public int puertas = 0;

    public void sumarPuertas(){
        this.puertas++;
    }


}