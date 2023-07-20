import javax.swing.*;

public class Task6 {

    public static void main(String[] args) {

        String[] nombresYApellidos = new String[3];
        String[] nombres = new String[3];
        byte resultIndex = 0;


        for (byte i = 0; i < nombres.length; i++){
            nombresYApellidos[i] = JOptionPane.showInputDialog("Ingrese nombre y apellido: ");
            nombres[i] = nombresYApellidos[i].split(" ")[0];

            if(nombres[i].length() > nombres[resultIndex].length()){
                resultIndex = i;
            }
        }

        System.out.println( nombresYApellidos[resultIndex] +" tiene el nombre mas largo");

    }
}
