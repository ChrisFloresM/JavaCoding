public class InstanceOfOperator {
    public static void main(String[] args) {
        String text = "My string";
        Character myChar = 'a';

        boolean result = text instanceof String;

        System.out.println(result);

        Object texto2 = "Hello world again!";
        boolean result2 = texto2 instanceof String;
        boolean result3 = texto2 instanceof Integer;

        System.out.println(result2 + " " + result3);
    }
}
