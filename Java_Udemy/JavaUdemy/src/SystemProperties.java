import java.util.Properties;

public class SystemProperties {

    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println(username);

        String home = System.getProperty("user.home");
        System.out.println(home);

        String workspace = System.getProperty("user.dir");
        System.out.println(workspace);

        String java = System.getProperty(("java.version"));
        System.out.println(java);

        //System.lineSeparator() produce un salto de línea

        Properties prop = System.getProperties();
        prop.list(System.out);
    }
}
