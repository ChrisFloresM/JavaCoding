import java.lang.reflect.Method;

public class MethodGetClass {

    public static void main(String[] args) {
        String myString = "Hello World";

        Class strClass = myString.getClass();

        System.out.println(strClass.getName());
        System.out.println(strClass.getSuperclass());
        System.out.println(strClass);

        for(Method method: strClass.getMethods()){
            System.out.println(method.getName());
        }

        String myNumber = "345";
        int myNumberInt = Integer.parseInt(myNumber);
        Integer myObjectInt = Integer.valueOf(myNumberInt);

        Double myObjectDouble = Double.valueOf(myObjectInt);
    }
}
