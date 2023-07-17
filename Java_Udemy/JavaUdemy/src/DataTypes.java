public class DataTypes {

    public static void main(String[] args){

        //byte
        byte myByte = 127;
        System.out.println("A byte data type corresponds to "+ Byte.BYTES + " bytes");
        System.out.println("A byte data type maximum values corresponds to "+ Byte.MAX_VALUE);
        System.out.println("A byte data type minimum values corresponds to "+ Byte.MIN_VALUE);
        System.out.println("\n");

        //short
        short myShort = 32767;
        System.out.println("A short data type corresponds to "+ Short.BYTES + " bytes");
        System.out.println("A short data type maximum values corresponds to "+ Short.MAX_VALUE);
        System.out.println("A short data type minimum values corresponds to "+ Short.MIN_VALUE);
        System.out.println("\n");

        //int
        int myInt = 2147483647;
        System.out.println("A int data type corresponds to "+ Integer.BYTES + " bytes");
        System.out.println("A int data type maximum values corresponds to "+ Integer.MAX_VALUE);
        System.out.println("A int data type minimum values corresponds to "+ Integer.MIN_VALUE);
        System.out.println("\n");

        //long
        long myLong = 2147483647L;
        System.out.println("A long data type corresponds to "+ Long.BYTES + " bytes");
        System.out.println("A long data type maximum values corresponds to "+ Long.MAX_VALUE);
        System.out.println("A long data type minimum values corresponds to "+ Long.MIN_VALUE);
        System.out.println("\n");

        //float
        float myFloat = 3.4028235E38f;
        System.out.println("A float data type corresponds to "+ Float.BYTES + " bytes");
        System.out.println("A float data type maximum values corresponds to "+ Float.MAX_VALUE);
        System.out.println("A float data type minimum values corresponds to "+ Float.MIN_VALUE);
        System.out.println("\n");

        //double
        double myDouble = 1.7976931348623157E308;
        System.out.println("A double data type corresponds to "+ Double.BYTES + " bytes");
        System.out.println("A double data type maximum values corresponds to "+ Double.MAX_VALUE);
        System.out.println("A double data type minimum values corresponds to "+ Double.MIN_VALUE);
        System.out.println("\n");

        char myChar = '\u266A';
        System.out.println(myChar);
    }
}
