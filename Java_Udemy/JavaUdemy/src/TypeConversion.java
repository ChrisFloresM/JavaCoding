public class TypeConversion {
    public static void main(String[] args) {

        //String to primitives
        System.out.println(Integer.parseInt("123"));
        System.out.println(Long.parseLong("123"));
        System.out.println(Float.parseFloat("123"));
        System.out.println(Double.parseDouble("123"));
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Character.valueOf('a'));

        //primitives to string
        System.out.println(Integer.toString(123));
        System.out.println(Long.toString(123));
        System.out.println(Float.toString(123));
        System.out.println(Double.toString(123));
        System.out.println(Boolean.toString(true));
        System.out.println(Character.toString('a'));

        System.out.println(String.valueOf(123));
    }
}
