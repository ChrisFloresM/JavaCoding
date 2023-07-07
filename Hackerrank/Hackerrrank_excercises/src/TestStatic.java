public class TestStatic {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Robot robot2 = new Robot();

        System.out.println(Robot.getValue());

    }
}

class Robot{
    private static final int value = 10; //Value is just an integer
    String robotName = "";

    public static int getValue() {
        return value;
    }


}