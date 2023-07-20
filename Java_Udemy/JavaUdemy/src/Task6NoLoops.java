import javax.swing.*;

public class Task6NoLoops {

    public static void main(String[] args) {

        String primerPersona = JOptionPane.showInputDialog("Ingrese nombre y apellido: ");
        String segundaPersona = JOptionPane.showInputDialog("Ingrese nombre y apellido: ");
        String tercerPersona = JOptionPane.showInputDialog("Ingrese nombre y apellido: ");

        int primerPersonaNombre = primerPersona.split(" ")[0].length();
        int segundaPersonaNombre = segundaPersona.split(" ")[0].length();
        int tercerPersonaNombre = tercerPersona.split(" ")[0].length();

        String result = "";

        if(primerPersonaNombre > segundaPersonaNombre)
        {
            result = primerPersonaNombre > tercerPersonaNombre ? primerPersona : tercerPersona;
        }
        else
        {
            result = segundaPersonaNombre > tercerPersonaNombre ? segundaPersona : tercerPersona;
        }

        JOptionPane.showMessageDialog(null, result + " tiene el nombre mas largo");
    }
}
