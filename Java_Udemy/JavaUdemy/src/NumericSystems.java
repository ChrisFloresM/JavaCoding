public class NumericSystems {

    public static void main(String[] args) {
        int decimal = 679;
        System.out.println("Decimal: " + decimal);
        System.out.println("Binario: " + Integer.toBinaryString(decimal));
        System.out.println("Octal: " + Integer.toOctalString(decimal));
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal));
    }
}
