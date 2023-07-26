public class Wrappers {

    public static void main(String[] args) {

        Integer myInt = Integer.valueOf(2334);
        Integer mySecondInt = 2333;
        int myPrimitiveInt = mySecondInt.intValue();

        Long myLong = 12333334L;
        long myOtherLong = myLong;
        long sumaLong = myLong + myOtherLong;

        boolean primBool = false;
        Boolean objBool = Boolean.valueOf(primBool);
        boolean anotherBool = objBool.booleanValue();


    }
}
