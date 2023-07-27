import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesAssignment {

    public static void main(String[] args) {

       // System.out.println(new File("src\\configTests.properties").getAbsolutePath());
        try {
            FileInputStream file = new FileInputStream(new File("JavaUdemy/src/configTests.properties"));
            Properties p = new Properties();
            p.load(file);
            System.setProperties(p);
            System.setProperty("config.system.type", "Laptop ROG");
            p.list(System.out);
        } catch(Exception e){
            System.out.println("Error: File not found");
            System.out.println(e);
        }

    }
}
