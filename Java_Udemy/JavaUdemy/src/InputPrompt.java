import javax.swing.*;

public class InputPrompt {

    public static void main(String[] args) {

        String decimalNumber = JOptionPane.showInputDialog(null, "Input an integer number: ");
        int decimalNumberAsInteger = 0;

        try{
            decimalNumberAsInteger = Integer.parseInt(decimalNumber);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error. \nPlease enter a valid integer number");
            main(args);
            System.exit(0);
        }

        String outputMessage = "Input number: " + decimalNumberAsInteger;
        outputMessage += "\nInput number in Binary: 0b" + Integer.toBinaryString(decimalNumberAsInteger);
        outputMessage += "\nInput number in Hexadecimal: 0x" + Integer.toHexString(decimalNumberAsInteger);
        outputMessage += "\nInput number in Octal: 0" + Integer.toOctalString(decimalNumberAsInteger);

        JOptionPane.showMessageDialog(null, outputMessage);
    }
}
