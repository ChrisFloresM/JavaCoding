import java.util.Map;

public class EnvVar {

    public static void main(String[] args) {
        Map<String, String> envVar = System.getenv();

        System.out.println("============= Printing environment variables ==================");
        for(String key : envVar.keySet())
        {
            System.out.println(key + ": " + envVar.get(key));
        }
    }
}
